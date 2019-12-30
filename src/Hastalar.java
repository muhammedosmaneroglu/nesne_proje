
public class Hastalar implements Interface{
    
    private String saat;
    private String isim;
    private String tc;
    private String soyisim;
    private String telefon;

    @Override
    public String getSaat() {
        return saat;
    }
    
    @Override
    public void setSaat(String saat) {
        this.saat = saat;
    }
    
    @Override
    public String getIsim() {
        return isim;
    }
    @Override
    public void setIsim(String isim) {
        this.isim = isim;
    }
    @Override
    public String getTc() {
        return tc;
    }
    @Override
    public void setTc(String tc) {
        this.tc = tc;
    }
    @Override
    public String getSoyisim() {
        return soyisim;
    }
    @Override
    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }
    @Override
    public String getTelefon() {
        return telefon;
    }
    @Override
    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }
    

    public Hastalar(String saat, String isim, String tc, String soyisim, String telefon) {
        this.saat = saat;
        this.isim = isim;
        this.tc = tc;
        this.soyisim = soyisim;
        this.telefon = telefon;
    }
    
    
    
}
