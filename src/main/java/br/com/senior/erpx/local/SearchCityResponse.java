package br.com.senior.erpx.local;

import java.util.List;

import org.apache.camel.component.jackson.JacksonDataFormat;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection(serialization = true)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_NULL)
public class SearchCityResponse {

    public static final JacksonDataFormat SEARCH_CITY_RESPONSE_FORMAT = new JacksonDataFormat(SearchCityResponse.class);

    public Long totalPages;
    public Long totalElements;
    public List<City> contents;

}
