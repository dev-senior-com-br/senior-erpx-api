package br.com.senior.erpx.pessoa;

import org.apache.camel.component.jackson.JacksonDataFormat;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import br.com.senior.erpx.city.City;
import br.com.senior.erpx.city.State;
import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection(serialization = true)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_NULL)
public class Person {

    public static final JacksonDataFormat PERSON_FORMAT = new JacksonDataFormat(Person.class);

    /**
     * Id da entidade
     */
    public String id;
    /**
     * Código
     */
    public Long codPes;
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
    public String numIdf;
    /**
     * Inscrição estadual
     */
    public String insEst;
    /**
     * Inscrição municipal
     */
    public String insMun;
    /**
     * Grupo de empresas
     */
    public CompanyGroup e069gre;
    /**
     * CEP
     */
    public ZipCode e008cep;
    /**
     * Endereço
     */
    public String endPes;
    /**
     * Número
     */
    public String numEnd;
    /**
     * Bairro
     */
    public String nomBai;
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
    public String fonPes;
    /**
     * Situação
     */
    public String sitPes;
    /**
     * Indica se o registro foi excluído
     */
    public Boolean excluido = false;
    /**
     * Número do RG
     */
    public String numRge;
    /**
     * Tipo de mercado do cliente
     */
    public String tipMer;
    /**
     * Complemento
     */
    public String cplEnd;
    /**
     * Zip code
     */
    public String zipCod;
    /**
     * Telefone 2
     */
    public String fonPe2;
    /**
     * E-mail
     */
    public String intNet;
    /**
     * E-mail para envio de documentos eletrônicos
     */
    public String emaNfe;

}
