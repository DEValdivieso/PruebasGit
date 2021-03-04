package pe.com.peru.main;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class Pruebas {

    public static void main(String args []){
        System.out.println("Hola mundo");
        System.out.println("nueva linea");

        List<ProductPromotion> promotionsFromExcel=llenarDatos();
        String num="89,9";
       Double ddd= Double.parseDouble("89,9");
        System.out.println("nueva linea"+ddd);
        //VALIDAR CAMPOS VACIOS
      //  promotionsFromExcel=validarRegistros(promotionsFromExcel);


        promotionsFromExcel.forEach(c->System.out.println("campaing: getSkuInkafarma {}, " +
                        "getIdCampaign {}, " +
                        "getDateInitPromo {}," +
                        " getDateEndPromo {}," +
                        " getPricePromo {}," +
                        " getCompany {}, getPriceType {}, getCardBrand {}, getCardBrand {}\n"+
                c.getSkuInkafarma()+"    "+
                c.getIdCampaign()+"    "+c.getDateInitPromo()+"     "+c.getDateEndPromo()+"    "+c.getPricePromo()+"  "
                +c.getCompany()+"     "+c.getPriceType()+"      "+c.getCardBrand()+"      "+c.getMessage()));

    }

    public static List<ProductPromotion> validarRegistros(List<ProductPromotion> listPrices){

        listPrices.forEach(p->{
            if(p.getSkuInkafarma()==null) {
                p.setInValidFromFile(true);
                p.setMessage(CommonUtil.validStringNull(p.getMessage())+", valor de sku invalido");
            }if(p.getIdCampaign()==null) {
                p.setInValidFromFile(true);
                p.setMessage(CommonUtil.validStringNull(p.getMessage())+", valor de campa\u00f1a invalido");
            }if(p.getDateInitPromo()==null) {
                p.setInValidFromFile(true);
                p.setMessage(CommonUtil.validStringNull(p.getMessage())+", valor de fecha inicial invalido");
            }if(p.getDateEndPromo()==null) {
                p.setInValidFromFile(true);
                p.setMessage(CommonUtil.validStringNull(p.getMessage())+", valor de fecha final invalido");
            }if(p.getPricePromo()==null) {
                p.setInValidFromFile(true);
                p.setMessage(CommonUtil.validStringNull(p.getMessage())+", valor de precio invalido");
            }if(p.getDateInitPromo()!=null && p.getDateEndPromo()!=null) {
                if(p.getDateInitPromo().compareTo(p.getDateEndPromo()) > 0) {
                    p.setInValidFromFile(true);
                    p.setMessage(CommonUtil.validStringNull(p.getMessage())+", rango de fecha invalido");
                }
            }if(p.getCompany()==null || !(p.getCompany().equals("INKA") || p.getCompany().equals("MIFA"))) {
                p.setInValidFromFile(true);
                p.setMessage(CommonUtil.validStringNull(p.getMessage())+", valor de compa\u00f1ia invalido");
            }if(p.getPriceType()==null || !(p.getPriceType().equals("TMP") || p.getPriceType().equals("TOH"))) {
                p.setInValidFromFile(true);
                p.setMessage(CommonUtil.validStringNull(p.getMessage())+", valor de tipo precio invalido");
            }if(p.getCardBrand()==null) {
                p.setInValidFromFile(true);
                p.setMessage(CommonUtil.validStringNull(p.getMessage())+", valor de tipo tarjeta");
            }
            if(CommonUtil.validStringNull(p.getMessage()).length() > 0 ) {
                p.setMessage(p.getMessage().substring(2, p.getMessage().length()));
            }
        });

        for(int i=0;i<listPrices.size();i++){
            for(int j=i+1;j<listPrices.size();j++){
                if(listPrices.get(i).getSkuInkafarma().equalsIgnoreCase(listPrices.get(j).getSkuInkafarma())){
                    if(listPrices.get(i).getCompany().equalsIgnoreCase(listPrices.get(j).getCompany())){
                        if(listPrices.get(i).getPriceType().equalsIgnoreCase(listPrices.get(j).getPriceType())){
                            if(listPrices.get(i).getDateEndPromo().compareTo(listPrices.get(j).getDateInitPromo()) > 0) {
                                listPrices.get(i).setInValidFromFile(true);
                                listPrices.get(i).setMessage(CommonUtil.validStringNull(listPrices.get(i).getMessage())+", registro repetido");

                            }

                        }else if(listPrices.get(i).getPriceType().equalsIgnoreCase("TMP")){
                            if(listPrices.get(i).getPricePromo()<listPrices.get(j).getPricePromo()){
                                listPrices.get(i).setInValidFromFile(true);
                                listPrices.get(i).setMessage(CommonUtil.validStringNull(listPrices.get(i).getMessage())+", precio TMP < TOH");
                            }

                        }else if(listPrices.get(i).getPriceType().equalsIgnoreCase("TOH")){
                            if(listPrices.get(i).getPricePromo()>listPrices.get(j).getPricePromo()){
                                listPrices.get(i).setInValidFromFile(true);
                                listPrices.get(i).setMessage(CommonUtil.validStringNull(listPrices.get(i).getMessage())+", precio TMP < TOH");
                            }
                        }

                    }

                }

            }

        }

        return listPrices;
    }
    public static List<ProductPromotion> llenarDatos(){

        List<ProductPromotion> promotionsFromExcel = new ArrayList<ProductPromotion>();

        ProductPromotion ab=new ProductPromotion();
        ab.setSkuInkafarma("3508");
        ab.setIdCampaign("014996");
        ab.setDateInitPromo(new Date());
        ab.setDateEndPromo(new Date());
        ab.setPricePromo(99.55);
        ab.setCompany("MIFARMA");
        ab.setPriceType("TMP");
        ab.setCardBrand("1");

        promotionsFromExcel.add(ab);

        ab=new ProductPromotion();
        ab.setSkuInkafarma("3508");
        ab.setIdCampaign("014996");
        ab.setDateInitPromo(new Date());
        ab.setDateEndPromo(new Date());
        ab.setPricePromo(99.55);
        ab.setCompany("MIFARMA");
       //ab.setPriceType("TMP");
        ab.setCardBrand("1");

        promotionsFromExcel.add(ab);
        //--------------------------------------------------------

        ab=new ProductPromotion();
       // ab.setSkuInkafarma("3508");
        ab.setIdCampaign("014996");
        ab.setDateInitPromo(new Date());
        ab.setDateEndPromo(new Date());
        ab.setPricePromo(99.55);
        ab.setCompany("MIFARMA");
        ab.setPriceType("TMP");
        ab.setCardBrand("1");
        promotionsFromExcel.add(ab);
        return promotionsFromExcel;
    }
}
