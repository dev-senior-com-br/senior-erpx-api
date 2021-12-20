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
public class City {

    public static final JacksonDataFormat PERSON_FORMAT = new JacksonDataFormat(City.class);

    @JsonProperty("id")
    public String id;
    /**
     * Código cidade
     */
    @JsonProperty("codRai")
    public Long code;
    /**
     * Nome cidade
     */
    @JsonProperty("nomCid")
    public String name;
    /**
     * Estado
     */
    @JsonProperty("e007ufs")
    public State state;

}
