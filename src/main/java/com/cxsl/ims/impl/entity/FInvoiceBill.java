package com.cxsl.ims.impl.entity;

import java.math.BigDecimal;
import java.util.Date;

public class FInvoiceBill {
    private Long invBillId;

    private Integer shopId;

    private String shopName;

    private Date shippedTime;

    private Date settleTime;

    private String customerCode;

    private String customerName;

    private String outerOrderId;

    private Long packingId;

    private Date glDate;

    private Date receivedTime;

    private String omNum;

    private String cmisFinanceNum;

    private BigDecimal settlementAmount;

    private Byte saleDetailsStatus;

    private String invoiceTitle;

    private Date invoiceDate;

    private String invoiceCode;

    private String invoiceNum;

    private String itemName;

    private String itemId;

    private BigDecimal itemPrice;

    private Short itemCnt;

    private BigDecimal excTaxAmount;

    private BigDecimal taxRate;

    private BigDecimal taxAmount;

    private BigDecimal itemAmount;

    private Byte invoiceType;

    private Byte invoiceStatus;

    private Boolean isInvoiced;

    private Boolean isConfirmedIncome;

    private Byte invBillResult;

    private Long ouId;

    private Byte invoiceReason;

    private String exceptionReason;

    private Date createTime;

    public Long getInvBillId() {
        return invBillId;
    }

    public void setInvBillId(Long invBillId) {
        this.invBillId = invBillId;
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public Date getShippedTime() {
        return shippedTime;
    }

    public void setShippedTime(Date shippedTime) {
        this.shippedTime = shippedTime;
    }

    public Date getSettleTime() {
        return settleTime;
    }

    public void setSettleTime(Date settleTime) {
        this.settleTime = settleTime;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getOuterOrderId() {
        return outerOrderId;
    }

    public void setOuterOrderId(String outerOrderId) {
        this.outerOrderId = outerOrderId;
    }

    public Long getPackingId() {
        return packingId;
    }

    public void setPackingId(Long packingId) {
        this.packingId = packingId;
    }

    public Date getGlDate() {
        return glDate;
    }

    public void setGlDate(Date glDate) {
        this.glDate = glDate;
    }

    public Date getReceivedTime() {
        return receivedTime;
    }

    public void setReceivedTime(Date receivedTime) {
        this.receivedTime = receivedTime;
    }

    public String getOmNum() {
        return omNum;
    }

    public void setOmNum(String omNum) {
        this.omNum = omNum;
    }

    public String getCmisFinanceNum() {
        return cmisFinanceNum;
    }

    public void setCmisFinanceNum(String cmisFinanceNum) {
        this.cmisFinanceNum = cmisFinanceNum;
    }

    public BigDecimal getSettlementAmount() {
        return settlementAmount;
    }

    public void setSettlementAmount(BigDecimal settlementAmount) {
        this.settlementAmount = settlementAmount;
    }

    public Byte getSaleDetailsStatus() {
        return saleDetailsStatus;
    }

    public void setSaleDetailsStatus(Byte saleDetailsStatus) {
        this.saleDetailsStatus = saleDetailsStatus;
    }

    public String getInvoiceTitle() {
        return invoiceTitle;
    }

    public void setInvoiceTitle(String invoiceTitle) {
        this.invoiceTitle = invoiceTitle;
    }

    public Date getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(Date invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public String getInvoiceCode() {
        return invoiceCode;
    }

    public void setInvoiceCode(String invoiceCode) {
        this.invoiceCode = invoiceCode;
    }

    public String getInvoiceNum() {
        return invoiceNum;
    }

    public void setInvoiceNum(String invoiceNum) {
        this.invoiceNum = invoiceNum;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public BigDecimal getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(BigDecimal itemPrice) {
        this.itemPrice = itemPrice;
    }

    public Short getItemCnt() {
        return itemCnt;
    }

    public void setItemCnt(Short itemCnt) {
        this.itemCnt = itemCnt;
    }

    public BigDecimal getExcTaxAmount() {
        return excTaxAmount;
    }

    public void setExcTaxAmount(BigDecimal excTaxAmount) {
        this.excTaxAmount = excTaxAmount;
    }

    public BigDecimal getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(BigDecimal taxRate) {
        this.taxRate = taxRate;
    }

    public BigDecimal getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(BigDecimal taxAmount) {
        this.taxAmount = taxAmount;
    }

    public BigDecimal getItemAmount() {
        return itemAmount;
    }

    public void setItemAmount(BigDecimal itemAmount) {
        this.itemAmount = itemAmount;
    }

    public Byte getInvoiceType() {
        return invoiceType;
    }

    public void setInvoiceType(Byte invoiceType) {
        this.invoiceType = invoiceType;
    }

    public Byte getInvoiceStatus() {
        return invoiceStatus;
    }

    public void setInvoiceStatus(Byte invoiceStatus) {
        this.invoiceStatus = invoiceStatus;
    }

    public Boolean getIsInvoiced() {
        return isInvoiced;
    }

    public void setIsInvoiced(Boolean isInvoiced) {
        this.isInvoiced = isInvoiced;
    }

    public Boolean getIsConfirmedIncome() {
        return isConfirmedIncome;
    }

    public void setIsConfirmedIncome(Boolean isConfirmedIncome) {
        this.isConfirmedIncome = isConfirmedIncome;
    }

    public Byte getInvBillResult() {
        return invBillResult;
    }

    public void setInvBillResult(Byte invBillResult) {
        this.invBillResult = invBillResult;
    }

    public Long getOuId() {
        return ouId;
    }

    public void setOuId(Long ouId) {
        this.ouId = ouId;
    }

    public Byte getInvoiceReason() {
        return invoiceReason;
    }

    public void setInvoiceReason(Byte invoiceReason) {
        this.invoiceReason = invoiceReason;
    }

    public String getExceptionReason() {
        return exceptionReason;
    }

    public void setExceptionReason(String exceptionReason) {
        this.exceptionReason = exceptionReason;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}