package br.com.senior.erpx.pessoa;

import org.apache.camel.component.jackson.JacksonDataFormat;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection(serialization = true)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ZipCode {

    public static final JacksonDataFormat ZIP_CODE_FORMAT = new JacksonDataFormat(ZipCode.class);

    /**
     * CEP endereço
     */
    public Long cepIni;

}
