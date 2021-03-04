package pe.com.peru.main;


import java.util.Date;


public class ProductPromotion {
    private int countRow;
    private String skuInkafarma;
    private String idCampaign;
    private Boolean active;
    private Double pricePromo;
    private Date dateInitPromo;
    private Date dateEndPromo;
    private String message;
    private boolean isInValidFromFile;
    private boolean isInValidFromDB;
    private String company;

    //3 precios
    private String priceType;
    private String cardBrand;

    public int getCountRow() {
        return countRow;
    }
    public void setCountRow(int countRow) {
        this.countRow = countRow;
    }
    public String getSkuInkafarma() {
        return skuInkafarma;
    }
    public void setSkuInkafarma(String skuInkafarma) {
        this.skuInkafarma = skuInkafarma;
    }

    public String getIdCampaign() {
        return idCampaign;
    }
    public void setIdCampaign(String idCampaign) {
        this.idCampaign = idCampaign;
    }
    public Boolean getActive() {
        return active;
    }
    public void setActive(Boolean active) {
        this.active = active;
    }
    public Double getPricePromo() {
        return pricePromo;
    }
    public void setPricePromo(Double pricePromo) {
        this.pricePromo = pricePromo;
    }
    public Date getDateInitPromo() {
        return dateInitPromo;
    }
    public void setDateInitPromo(Date dateInitPromo) {
        this.dateInitPromo = dateInitPromo;
    }
    public Date getDateEndPromo() {
        return dateEndPromo;
    }
    public void setDateEndPromo(Date dateEndPromo) {
        this.dateEndPromo = dateEndPromo;
    }
    public boolean isInValidFromFile() {
        return isInValidFromFile;
    }
    public void setInValidFromFile(boolean isInValidFromFile) {
        this.isInValidFromFile = isInValidFromFile;
    }
    public boolean isInValidFromDB() {
        return isInValidFromDB;
    }
    public void setInValidFromDB(boolean isInValidFromDB) {
        this.isInValidFromDB = isInValidFromDB;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public String getCompany() {
        return company;
    }
    public void setCompany(String company) {
        this.company = company;
    }

    public String getPriceType() {
        return priceType;
    }

    public void setPriceType(String priceType) {
        this.priceType = priceType;
    }

    public String getCardBrand() {
        return cardBrand;
    }

    public void setCardBrand(String cardBrand) {
        this.cardBrand = cardBrand;
    }
}
