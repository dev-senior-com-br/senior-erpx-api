package br.com.senior.erpx;

import org.apache.camel.component.jackson.JacksonDataFormat;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection(serialization = true)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Country {

    public static final JacksonDataFormat PERSON_FORMAT = new JacksonDataFormat(Country.class);

    /**
     * Código
     */
    public String codPai;
    /**
     * Nome
     */
    public String nomPai;

}
