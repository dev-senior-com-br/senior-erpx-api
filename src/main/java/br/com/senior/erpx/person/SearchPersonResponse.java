package br.com.senior.erpx.person;

import java.util.List;

import org.apache.camel.component.jackson.JacksonDataFormat;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection(serialization = true)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_NULL)
public class SearchPersonResponse {

    public static final JacksonDataFormat SEARCH_PERSON_RESPONSE_FORMAT = new JacksonDataFormat(SearchPersonResponse.class);

    @JsonProperty("totalPages")
    public Long totalPages;
    @JsonProperty("totalElements")
    public Long totalElements;
    @JsonProperty("contents")
    public List<Person> contents;

}
