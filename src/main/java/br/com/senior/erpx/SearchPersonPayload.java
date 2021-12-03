package br.com.senior.erpx;

import java.util.List;

import org.apache.camel.component.jackson.JacksonDataFormat;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection(serialization = true)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SearchPersonPayload {

    public static final JacksonDataFormat SEARCH_PERSON_FORMAT = new JacksonDataFormat(SearchPersonPayload.class);

    public Long offset;
    public Long size;
    public String orderBy;
    public String filter;
    public List<String> displayFields;


}
