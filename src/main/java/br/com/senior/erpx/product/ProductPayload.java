package br.com.senior.erpx.product;

import org.apache.camel.component.jackson.JacksonDataFormat;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection(serialization = true)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_NULL)
public class ProductPayload {

    public static final JacksonDataFormat PRODUCT_FORMAT = new JacksonDataFormat(ProductPayload.class);

    public String id;

    /**
     * Empresa
     */
    // public Company company;

    /**
     * Família
     */
    // public Family family;

    /**
     * Código
     */
    public String code;

    /**
     * Descrição
     */
    public String description;

    /**
     * Descrição complementar
     */
    public String additionalDescription;

    /**
     * Código de barras
     */
    public String barcode;

    /**
     * Código barras livre
     */
    public String freeBarcode;

    /**
     * GTIN unidade tributável
     */
    public String gtin;

    /**
     * Identificação produto
     */
    public String productIdentification;

    /**
     * Peso bruto
     */
    public Double grossWeight;

    /**
     * Peso líquido
     */
    public Double netWeight;

    /**
     * Código da Referência
     */
    public String referenceCode;

    /**
     * Natureza de gasto
     */
    // public SpendingNature spendingNature;

    /**
     * Situação
     */
    public String status;

    /**
     * Motivo da situação
     */
    // public StatusReason statusReason;

    /**
     * Enquadramento de produto específico
     */
    public String productFramework;

    /**
     * Indica se o registro foi excluído
     */
    public Boolean deleted;

    /**
     * Dados comerciais do produto
     */
    // public CommercialProduct commercialProduct;

    /**
     * Dados fiscais do produto
     */
    // public TaxProduct taxProduct;

    /**
     * Dados de estoque do produto
     */
    // public StockProduct stockProduct;

    /**
     * Dados de compra do produto
     */
    // public PurchaseProduct purchaseProduct;

    /**
     * Dados de rateio financeiro do produto
     */
    // public ApportionmentProduct apportionmentProduct;

}
