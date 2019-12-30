
import java.util.logging.Logger;


public class Doktorlar {

    
    
    private String ad;
    private String soyad;
    private String uzmanlık;
    private String sifre;
    private String tc;

    public Doktorlar(String tc, String ad, String soyad, String uzmanlık, String sifre) {
        this.ad = ad;
        this.soyad = soyad;
        this.uzmanlık = uzmanlık;
        this.sifre = sifre;
        this.tc = tc;
    }

    public String getTc() {
        return tc;
    }

    public void setTc(String tc) {
        this.tc = tc;
    }
    
    public String getAd() {
        return ad;
    }
    

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getUzmanlık() {
        return uzmanlık;
    }

    public void setUzmanlık(String uzmanlık) {
        this.uzmanlık = uzmanlık;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

   
    
}
