import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class OtomasyonIsleri {
    
    private PreparedStatement preparedStatement = null;
    private Connection con = null;
    private Statement statement = null ;
    
    baglantıDurumu baglanti = new baglantıDurumu();
    public OtomasyonIsleri(){
        
        String url = "jdbc:mysql://" + database.host + ":" + database.port + "/" + database.databaseAdi + "?useUnicode=true&characterEncoding=utf8";
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
               baglanti.durumSoyle("başarısız");
            }
                
            try{    
                con = DriverManager.getConnection(url, database.kullaniciAdi, database.parola);
                baglanti.durumSoyle("başarılı");
            } catch (SQLException ex) {
                baglanti.durumSoyle("başarısız");
            }
    
        
        
    }
    
    
    public ArrayList<Doktorlar> doktorlarıGetir(){
        
        ArrayList<Doktorlar> cikti = new ArrayList<Doktorlar>();
        try {
            statement = con.createStatement();
            
            String sorgu = "Select * From doktorlar";
            ResultSet rs = statement.executeQuery(sorgu);
            
            while(rs.next()){
                
                String ad = rs.getString("ad");
                String soyad = rs.getString("soyad");
                String uzmanlik = rs.getString("uzmanlik");
                String sifre = rs.getString("sifre");
                String tc = rs.getString("tc");
                cikti.add(new Doktorlar(tc, ad, soyad, uzmanlik, sifre));
                
            }
            return cikti;
            
        } catch (SQLException ex) {
            Logger.getLogger(OtomasyonIsleri.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Doktor getirme başarısız");
            
        }
        return null;
        
        
    }
    
    public ArrayList<Hastalar> hastalarıGetir(){
        
         ArrayList<Hastalar> cikti = new ArrayList<Hastalar>();
         
        try {
            statement = con.createStatement();
            
            String sorgu = "Select * From hastalar";
            ResultSet rs = statement.executeQuery(sorgu);
            
           while(rs.next()){
               
                String saat = rs.getString("saat");
                String tc = rs.getString("tc");
                String ad = rs.getString("isim");
                String soyad = rs.getString("soyisim");
                String telefon = rs.getString("telefon");
                
                
                cikti.add(new Hastalar(saat, tc, ad, soyad, telefon));
                             
           }
            return cikti;
            
        } catch (SQLException ex) {
            Logger.getLogger(OtomasyonIsleri.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
        
    }
    
    public void hastaKayitEkle (String saat, String tc, String ad, String soyad, String telefon){
        
        //Insert Into doktorlar (saat, tc, isim, soyisim, telefon) VALUES (?, ?, ?, ?, ?)
            //INSERT INTO `hastalar`(`saat`, `tc`, `isim`, `soyisim`, `telefon`) VALUES ([value-1],[value-2],[value-3],[value-4],[value-5])
            String sorgu = "Insert Into hastalar (saat , tc, isim, soyisim, telefon) VALUES (?, ?, ?, ?, ?)";
        try {
            
            preparedStatement = con.prepareStatement(sorgu);
            
            
            preparedStatement.setString(1, saat);
            preparedStatement.setString(2, tc);
            preparedStatement.setString(4, soyad);
            preparedStatement.setString(3, ad);
            preparedStatement.setString(5, telefon);

            
            preparedStatement.executeUpdate();
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(OtomasyonIsleri.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
        
    }
    
    
    public void doktorEkle(String tc, String ad, String soyad, String uzmanlik, String sifre){
        
        String sorgu = "Insert Into doktorlar (tc, ad, soyad, uzmanlik, sifre) VALUES (?, ?, ?, ?, ?)";
        try {
            
            preparedStatement = con.prepareStatement(sorgu);
            
            preparedStatement.setString(1, tc);
            preparedStatement.setString(2, ad);
            preparedStatement.setString(3, soyad);
            preparedStatement.setString(4, uzmanlik);
            preparedStatement.setString(5, sifre);
            
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(OtomasyonIsleri.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
        
    }
    
    public void doktorGüncelle(String tc, String ad, String soyad, String uzmanlik, String sifre){
        
        String sorgu = "Update doktorlar set ad = ? , soyad = ? , uzmanlik = ? , sifre = ? where tc = ? ";
        
        try { 
            preparedStatement = con.prepareStatement(sorgu);
            
            preparedStatement.setString(1, ad);
            preparedStatement.setString(2, soyad);
            preparedStatement.setString(3, uzmanlik);
            preparedStatement.setString(4, sifre);
            preparedStatement.setString(5, tc);
            
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(OtomasyonIsleri.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
    
    public boolean doktorGirisi(String doktorTc, String doktorParola){
        
        String sorgu = "SELECT * FROM doktorlar WHERE tc = ? and sifre = ?";
        
        try {
            preparedStatement = con.prepareStatement(sorgu);
            
            preparedStatement.setString(1, doktorTc);
            preparedStatement.setString(2, doktorParola);
            
            ResultSet rs = preparedStatement.executeQuery();
            
            return rs.next();
            
        } catch (SQLException ex) {
            Logger.getLogger(OtomasyonIsleri.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }
   
    public boolean adminGirisi(String adminAd, String adminParola){
        
        String sorgu = "SELECT * FROM adminler WHERE username = ? and password= ?";
        
        try {
            preparedStatement = con.prepareStatement(sorgu);
            
            preparedStatement.setString(1, adminAd);
            preparedStatement.setString(2, adminParola);
            
            ResultSet rs = preparedStatement.executeQuery();
            
            return rs.next();
            
        } catch (SQLException ex) {
            Logger.getLogger(OtomasyonIsleri.class.getName()).log(Level.SEVERE, null, ex);
            
            return false;
        }
        
    }
    
    public void doktorSil(String tc){
        
        String sorgu = "Delete from doktorlar where tc = ?";
        
        try {
            preparedStatement = con.prepareStatement(sorgu);
            
            preparedStatement.setString(1, tc);
            
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(OtomasyonIsleri.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
}
