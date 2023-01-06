import java.util.ArrayList;
import java.util.Scanner;
// Ahmad Panjalu R5R (202043501452)
public class Maindatawarga {
    public static void Maindatawarga(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer pilihan = 0;
        
        System.out.println("====================================");
        System.out.println("Pendataan dan Pembayaran Iuran Warga");
        System.out.println("====================================");
        System.out.println("1. Input Data Warga");
        System.out.println("2. Input Iuran Warga");
        System.out.println();
        System.out.print("PILIHAN MENU : ");
        pilihan = sc.nextInt();
        System.out.println();
        
        Datawarga n = new Datawarga();
        
        if (pilihan == 1){
            n.warga1();
            //}else if(pilihan == 2){
            n.warga2();
            }
        }
    } 