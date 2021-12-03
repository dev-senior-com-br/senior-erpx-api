package br.com.senior.erpx;

import org.apache.camel.component.jackson.JacksonDataFormat;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection(serialization = true)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CEP {

    public static final JacksonDataFormat CEP_FORMAT = new JacksonDataFormat(CEP.class);

    /**
     * CEP endereço
     */
    public Long cepIni;

}
