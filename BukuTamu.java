package bukutamu;
public class BukuTamu {
    private final String Nama;
    private final String Alamat;
    private final String Notel;
    private static int ID;
    private static int Jumlah;

public BukuTamu(String nm,String al,String no,int id){
    Nama=nm;
    Alamat=al;
    Notel=no;
    ID=id;
    Jumlah++;
}
public  String getNama(){
    return Nama;
}
public String getAlamat(){
    return Alamat;
}
public String getNoTelephone(){
    return Notel;
}
public static int getJumlah(){
    return Jumlah;
}
public static int getID(){
    return ID;
}
public void DissplayMassage() {
       System.out.println("Nama    : " + getNama());
       System.out.println("Alamat  : " + getAlamat());
       System.out.println("Telepon : " + getNoTelephone());
       System.out.println("ID      : "+getID());
}
}
    
