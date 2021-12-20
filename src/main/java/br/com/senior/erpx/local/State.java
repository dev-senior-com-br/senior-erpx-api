package br.com.senior.erpx.local;

import org.apache.camel.component.jackson.JacksonDataFormat;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection(serialization = true)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_NULL)
public class State {

    public static final JacksonDataFormat PERSON_FORMAT = new JacksonDataFormat(State.class);

    @JsonProperty("id")
    public String id;
    /**
     * Sigla
     */
    @JsonProperty("sigUfs")
    public String initials;
    /**
     * Nome
     */
    @JsonProperty("nomUfs")
    public String name;
    /**
     * País
     */
    @JsonProperty("e006pai")
    public Country country;

}
