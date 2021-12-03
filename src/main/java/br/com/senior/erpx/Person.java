package br.com.senior.erpx;

import org.apache.camel.component.jackson.JacksonDataFormat;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection(serialization = true)
@JsonIgnoreProperties(ignoreUnknown = true)
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
    public String nomPes;
    /**
     * Nome fantasia
     */
    public String apePes;
    /**
     * Tipo de pessoa
     */
    public String tipPes;
    /**
     * CNPJ/CPF
     */
    public String cnpCpf;
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
    public CEP e008cep;
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
    public Country e006pai;
    /**
     * Estado
     */
    public State e007ufs;
    /**
     * Cidade
     */
    public City e008rai;
    /**
     * Telefone
     */
    public String fonPes;
    /**
     * Situação
     */
    public String sitPes;

}
