package br.com.senior.erpx.local;

import org.apache.camel.component.jackson.JacksonDataFormat;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection(serialization = true)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_NULL)
public class Country {

    public static final JacksonDataFormat PERSON_FORMAT = new JacksonDataFormat(Country.class);

    public String id;
    /**
     * Código
     */
    @JsonProperty("codPai")
    public String code;
    /**
     * Nome
     */
    @JsonProperty("nomPai")
    public String name;

}
