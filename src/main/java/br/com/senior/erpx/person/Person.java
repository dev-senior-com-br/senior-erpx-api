package br.com.senior.erpx.person;

import org.apache.camel.component.jackson.JacksonDataFormat;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import br.com.senior.erpx.company.CompanyGroup;
import br.com.senior.erpx.local.City;
import br.com.senior.erpx.local.Country;
import br.com.senior.erpx.local.State;
import br.com.senior.erpx.local.ZipCode;
import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection(serialization = true)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_NULL)
public class Person {

    public static final JacksonDataFormat PERSON_FORMAT = new JacksonDataFormat(Person.class);

    @JsonProperty("id")
    public String id;
    /**
     * Código
     */
    @JsonProperty("codPes")
    public Long code;
    /**
     * Nome
     */
    @JsonProperty("nomPes")
    public String name;
    /**
     * Nome fantasia
     */
    @JsonProperty("apePes")
    public String surname;
    /**
     * Tipo de pessoa
     */
    @JsonProperty("tipPes")
    public String type;
    /**
     * CNPJ/CPF
     */
    @JsonProperty("cnpCpf")
    public String idNumber;
    /**
     * Número de identificação fiscal (NIF)
     */
    @JsonProperty("numIdf")
    public String taxIdentificationNumber;
    /**
     * Inscrição estadual
     */
    @JsonProperty("insEst")
    public String stateRegistration;
    /**
     * Inscrição municipal
     */
    @JsonProperty("insMun")
    public String municipalRegistration;
    /**
     * Grupo de empresas
     */
    @JsonProperty("e069gre")
    public CompanyGroup companyGroup;
    /**
     * CEP
     */
    @JsonProperty("e008cep")
    public ZipCode zipCode;
    /**
     * Endereço
     */
    @JsonProperty("endPes")
    public String address;
    /**
     * Número
     */
    @JsonProperty("numEnd")
    public String addressNumber;
    /**
     * Bairro
     */
    @JsonProperty("nomBai")
    public String district;
    /**
     * Pais
     */
    @JsonProperty("e006pai")
    public Country country;
    /**
     * Estado
     */
    @JsonProperty("e007ufs")
    public State state;
    /**
     * Cidade
     */
    @JsonProperty("e008rai")
    public City city;
    /**
     * Telefone
     */
    @JsonProperty("fonPes")
    public String phone;
    /**
     * Situação
     */
    @JsonProperty("sitPes")
    public String situation;
    /**
     * Indica se o registro foi excluído
     */
    @JsonProperty("excluido")
    public Boolean excluded = false;
    /**
     * Número do RG
     */
    @JsonProperty("numRge")
    public String ID;
    /**
     * Tipo de mercado do cliente
     */
    @JsonProperty("tipMer")
    public String marketType;
    /**
     * Complemento
     */
    @JsonProperty("cplEnd")
    public String addressComplement;
    /**
     * Zip code
     */
    @JsonProperty("zipCod")
    public String zipCod;
    /**
     * Telefone 2
     */
    @JsonProperty("fonPe2")
    public String phone2;
    /**
     * E-mail
     */
    @JsonProperty("intNet")
    public String eMail;
    /**
     * E-mail para envio de documentos eletrônicos
     */
    @JsonProperty("emaNfe")
    public String eDocEMail;

}
