package com.monitoring_mikrohidro_store.configs;

import graphql.language.StringValue;
import graphql.scalars.ExtendedScalars;
import graphql.schema.Coercing;
import graphql.schema.CoercingParseLiteralException;
import graphql.schema.CoercingParseValueException;
import graphql.schema.CoercingSerializeException;
import graphql.schema.GraphQLScalarType;

import org.springframework.graphql.execution.RuntimeWiringConfigurer;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GraphQLScalarConfig {

    @Bean
    public RuntimeWiringConfigurer runtimeWiringConfigurer() {
        return wiringBuilder -> wiringBuilder
            .scalar(ExtendedScalars.DateTime)
            .scalar(this.localDateTimeScalar());
    }

    @Bean
    public GraphQLScalarType localDateTimeScalar() {
        return GraphQLScalarType.newScalar()
            .name("LocalDateTime")
            .description("Java 8 LocalDateTime as scalar")
            .coercing(new Coercing<LocalDateTime, String>() {
                private final DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;

                @Override
                public String serialize(Object dataFetcherResult) {
                    if (dataFetcherResult instanceof LocalDateTime) {
                        return ((LocalDateTime) dataFetcherResult).format(formatter);
                    }
                    throw new CoercingSerializeException("Expected a LocalDateTime object.");
                }

                @Override
                public LocalDateTime parseValue(Object input) {
                    try {
                        if (input instanceof String) {
                            return LocalDateTime.parse((String) input, formatter);
                        }
                        throw new CoercingParseValueException("Expected a String");
                    } catch (Exception e) {
                        throw new CoercingParseValueException(String.format("Not a valid LocalDateTime: '%s'", input));
                    }
                }

                @Override
                public LocalDateTime parseLiteral(Object input) {
                    if (input instanceof StringValue) {
                        try {
                            return LocalDateTime.parse(((StringValue) input).getValue(), formatter);
                        } catch (Exception e) {
                            throw new CoercingParseLiteralException(e);
                        }
                    }
                    throw new CoercingParseLiteralException("Expected a StringValue.");
                }
            })
            .build();
    }
}