package br.com.senior.erpx.pessoa;

import java.util.List;

import org.apache.camel.component.jackson.JacksonDataFormat;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection(serialization = true)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SearchPersonResponse {

    public static final JacksonDataFormat SEARCH_PERSON_RESPONSE_FORMAT = new JacksonDataFormat(SearchPersonResponse.class);

    public Long totalPages;
    public Long totalElements;
    public List<Person> contents;

}
