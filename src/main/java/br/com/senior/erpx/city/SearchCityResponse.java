package br.com.senior.erpx.city;

import java.util.List;

import org.apache.camel.component.jackson.JacksonDataFormat;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection(serialization = true)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SearchCityResponse {

    public static final JacksonDataFormat SEARCH_CITY_RESPONSE_FORMAT = new JacksonDataFormat(SearchCityResponse.class);

    public Long totalPages;
    public Long totalElements;
    public List<City> contents;

}
