package br.com.senior.erpx;

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
public class SearchPayload {

    public static final JacksonDataFormat SEARCH_FORMAT = new JacksonDataFormat(SearchPayload.class);

    @JsonProperty("offset")
    public Long offset;
    @JsonProperty("size")
    public Long size;
    @JsonProperty("orderBy")
    public String orderBy;
    @JsonProperty("filter")
    public String filter;
    @JsonProperty("displayFields")
    public List<String> displayFields;


}
