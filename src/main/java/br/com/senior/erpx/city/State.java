package br.com.senior.erpx.city;

import org.apache.camel.component.jackson.JacksonDataFormat;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import br.com.senior.erpx.pessoa.Country;
import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection(serialization = true)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_NULL)
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
    /**
     * País
     */
    @JsonProperty("e006pai")
    public Country country;

}
