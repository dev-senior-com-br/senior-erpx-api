package br.com.senior.erpx.company;

import org.apache.camel.component.jackson.JacksonDataFormat;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection(serialization = true)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_NULL)
public class CompanyGroup {

    public static final JacksonDataFormat PERSON_FORMAT = new JacksonDataFormat(CompanyGroup.class);

    /**
     * Grupo empresa
     */
    @JsonProperty("codGre")
    public Long code;
    /**
     * Nome
     */
    @JsonProperty("nomGre")
    public String name;

}
