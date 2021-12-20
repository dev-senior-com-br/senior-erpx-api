package br.com.senior.erpx.product;

import org.apache.camel.component.jackson.JacksonDataFormat;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection(serialization = true)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_NULL)
public class ProductPayload {

    public static final JacksonDataFormat PRODUCT_FORMAT = new JacksonDataFormat(ProductPayload.class);

    @JsonProperty("id")
    public String id;

    /**
     * Empresa
     */
    // @JsonProperty("company")
    // public Company company;

    /**
     * Família
     */
    // @JsonProperty("family")
    // public Family family;

    /**
     * Código
     */
    @JsonProperty("code")
    public String code;

    /**
     * Descrição
     */
    @JsonProperty("description")
    public String description;

    /**
     * Descrição complementar
     */
    @JsonProperty("additionalDescription")
    public String additionalDescription;

    /**
     * Código de barras
     */
    @JsonProperty("barcode")
    public String barcode;

    /**
     * Código barras livre
     */
    @JsonProperty("freeBarcode")
    public String freeBarcode;

    /**
     * GTIN unidade tributável
     */
    @JsonProperty("gtin")
    public String gtin;

    /**
     * Identificação produto
     */
    @JsonProperty("productIdentification")
    public String productIdentification;

    /**
     * Peso bruto
     */
    @JsonProperty("grossWeight")
    public Double grossWeight;

    /**
     * Peso líquido
     */
    @JsonProperty("netWeight")
    public Double netWeight;

    /**
     * Código da Referência
     */
    @JsonProperty("referenceCode")
    public String referenceCode;

    /**
     * Natureza de gasto
     */
    // @JsonProperty("spendingNature")
    // public SpendingNature spendingNature;

    /**
     * Situação
     */
    @JsonProperty("status")
    public String status;

    /**
     * Motivo da situação
     */
    // @JsonProperty("statusReason")
    // public StatusReason statusReason;

    /**
     * Enquadramento de produto específico
     */
    @JsonProperty("productFramework")
    public String productFramework;

    /**
     * Indica se o registro foi excluído
     */
    @JsonProperty("deleted")
    public Boolean deleted;

    /**
     * Dados comerciais do produto
     */
    // @JsonProperty("commercialProduct")
    // public CommercialProduct commercialProduct;

    /**
     * Dados fiscais do produto
     */
    // @JsonProperty("taxProduct")
    // public TaxProduct taxProduct;

    /**
     * Dados de estoque do produto
     */
    // @JsonProperty("stockProduct")
    // public StockProduct stockProduct;

    /**
     * Dados de compra do produto
     */
    // @JsonProperty("purchaseProduct")
    // public PurchaseProduct purchaseProduct;

    /**
     * Dados de rateio financeiro do produto
     */
    // @JsonProperty("apportionmentProduct")
    // public ApportionmentProduct apportionmentProduct;

}
