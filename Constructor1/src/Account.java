
public class Account {
    
    private String HesapNo;
    private double Bakiye;
    private String isim;
    private String email;
    private String telefonNo;
    
    /*
    ***Constructor: yapıcı metotlardır. Nesne oluştuğunda ilk çağrılan  kısımdır. 
    ismi class ismi ile aynı olacak. 
    Geri dönüş tipi yoktur void bile almaz..
    Bir classta birden fazla olabilir.
    Eğer constructor yazılmazsa Java bunu kendisi otomatik oluşturuyor.
    Nesnenin ilk değerlerini ayarlayarak başlatma işlemini yapar.
    Nesnelerin boş durumda kalmasını önler.
    */
    public Account(){ 
        //System.out.println("Kendi yazdigimiz constructor..");
        //2. constructorda yapılan tanımlamaları bu kısımda da yapabilirdik. this anahtar kelimesi ile.
        
        //Ya da 2. seçenek olarak constructor içinde constructor çağrılabilir...
        this("bilgi yok", 0.0, "Sahin Kavsara", "bilgi yok","bilgi yok");
        
        
    }
    //2. constructor:
    public Account(String HesapNo,double Bakiye,String isim,String email,String telefonNo){
        //Bu kısımda nesne oluşturulduğunda girilen parametreler tanımlanan özelliklere eşit oldu..
        this.HesapNo=HesapNo;
        this.Bakiye=Bakiye;
        this.isim=isim;
        this.email=email;
        this.telefonNo=telefonNo;
    }
    
    public void bilgileriGoster(){
        System.out.println("Hesap No:"+this.HesapNo);
        System.out.println("Bakiye:"+this.Bakiye);
        System.out.println("isim:"+this.isim);
        System.out.println("email:"+this.email);
        System.out.println("Telefon No:"+this.telefonNo);
    }
    public void paraYatir(double miktar){
        Bakiye+=miktar;
        System.out.println("Yeni bakiye: "+Bakiye);
    }
    
    public void paraCekme(double miktar){
        if(miktar>Bakiye){
            System.out.println("Bakiyeniz yetersiz! Bakiyeniz:" +Bakiye);
        }
        else{
            Bakiye-=miktar;
            System.out.println("Yeni bakiye: "+Bakiye);
        }
        
    }
    
    

    /**
     * @return the HesapNo
     */
    public String getHesapNo() {
        return HesapNo;
    }

    /**
     * @param HesapNo the HesapNo to set
     */
    public void setHesapNo(String HesapNo) {
        this.HesapNo = HesapNo;
    }

    /**
     * @return the Bakiye
     */
    public double getBakiye() {
        return Bakiye;
    }

    /**
     * @param Bakiye the Bakiye to set
     */
    public void setBakiye(double Bakiye) {
        this.Bakiye = Bakiye;
    }

    /**
     * @return the isim
     */
    public String getIsim() {
        return isim;
    }

    /**
     * @param isim the isim to set
     */
    public void setIsim(String isim) {
        this.isim = isim;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the telefonNo
     */
    public String getTelefonNo() {
        return telefonNo;
    }

    /**
     * @param telefonNo the telefonNo to set
     */
    public void setTelefonNo(String telefonNo) {
        this.telefonNo = telefonNo;
    }
    
    
}
