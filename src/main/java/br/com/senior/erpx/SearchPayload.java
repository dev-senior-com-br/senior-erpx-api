package br.com.senior.erpx;

import java.util.List;

import org.apache.camel.component.jackson.JacksonDataFormat;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection(serialization = true)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SearchPayload {

    public static final JacksonDataFormat SEARCH_FORMAT = new JacksonDataFormat(SearchPayload.class);

    public Long offset;
    public Long size;
    public String orderBy;
    public String filter;
    public List<String> displayFields;


}
