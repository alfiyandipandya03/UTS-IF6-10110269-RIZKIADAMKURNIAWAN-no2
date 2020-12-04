import java.util.Scanner;
/*
NAMA  : Alfiyandi Pandya Khalfani
KELAS : IF 1
NIM   : 10119007
*/
public class UTS_IF1_10119007_ALFIYANDIPANDYA_no2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("====Program Penarikan Uang====");
        System.out.print("Masukkan Saldo Awal : ");
        Tabungan t = new Tabungan(scan.nextInt());
        System.out.print("Jumlah uang yang diambil : ");
        int ambil = scan.nextInt();
        
        System.out.println("Saldo Anda Sekarang : "+t.ambilUang(ambil));
    }

}