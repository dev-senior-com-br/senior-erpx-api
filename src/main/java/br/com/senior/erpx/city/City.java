package br.com.senior.erpx.city;

import org.apache.camel.component.jackson.JacksonDataFormat;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection(serialization = true)
@JsonIgnoreProperties(ignoreUnknown = true)
public class City {

    public static final JacksonDataFormat PERSON_FORMAT = new JacksonDataFormat(City.class);

    public String id;
    /**
     * Código cidade
     */
    public Long codRai;
    /**
     * Nome cidade
     */
    public String nomCid;
    /**
     * Estado
     */
    public State e007ufs;

}
