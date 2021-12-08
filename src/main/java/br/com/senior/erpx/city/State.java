package br.com.senior.erpx.city;

import org.apache.camel.component.jackson.JacksonDataFormat;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection(serialization = true)
@JsonIgnoreProperties(ignoreUnknown = true)
public class State {

    public static final JacksonDataFormat PERSON_FORMAT = new JacksonDataFormat(State.class);

    /**
     * Sigla
     */
    public String sigUfs;
    /**
     * Nome
     */
    public String nomUfs;

}
