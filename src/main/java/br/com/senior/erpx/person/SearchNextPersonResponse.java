package br.com.senior.erpx.person;

import org.apache.camel.component.jackson.JacksonDataFormat;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection(serialization = true)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_NULL)
public class SearchNextPersonResponse {

    public static final JacksonDataFormat SEARCH_NEXT_PERSON_RESPONSE_FORMAT = new JacksonDataFormat(SearchNextPersonResponse.class);

    @JsonProperty("e001pes")
    public Person person;

}
