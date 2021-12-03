package br.com.senior.erpx;

import org.apache.camel.component.jackson.JacksonDataFormat;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection(serialization = true)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CompanyGroup {

    public static final JacksonDataFormat PERSON_FORMAT = new JacksonDataFormat(CompanyGroup.class);

    /**
     * Grupo empresa
     */
    public Long codGre;
    /**
     * Nome
     */
    public String nomGre;

}
