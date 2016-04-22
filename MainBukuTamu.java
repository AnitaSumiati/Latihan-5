package bukutamu;
import java.util.Scanner;
public class MainBukuTamu {
    private static int tamu;
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
    String Nama ,Alamat,Notel;
        BukuTamu [] BUKU;
        System.out.print("Masukakan Jumlah Tamu Yang Hadir :");
        int Jumlah =input.nextInt();
        
        BUKU=new BukuTamu[Jumlah];
        for(int a=0; a<BUKU.length; a++){
        System.out.print("Masukan Nama :");
        Nama=input.next();
        System.out.print("Masukan Alamat :");
        Alamat=input.next();
        System.out.print("Masukan No Telephone :");
        Notel=input.next();
        System.out.print("Masukan ID :");
        int ID=input.nextInt();
        BUKU[a]=new BukuTamu(Nama,Alamat,Notel,ID);
        System.out.println("================================");
        System.out.println("Buku Tamu Perpisahan Kelas XII");
        System.out.println("SMA NEGERI 2 PLUS SIPIROK");
        System.out.println("================================");
        BukuTamu Bt= new BukuTamu(Nama,Alamat,Notel,ID);
        Bt.DissplayMassage();
        System.out.println("================================");
        System.out.println("Jumlah Tamu Yang Hadir : "+Jumlah);
        System.out.println("================================");
   }
    }
}