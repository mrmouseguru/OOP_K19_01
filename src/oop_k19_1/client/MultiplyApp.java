package oop_k19_1.client;
import java.util.Scanner;
import oop_k19_1.provider.Multiplier;


/**
 *
 * @author phuoc
 */
public class MultiplyApp {
    
    public static void main(String[] args) {
      //input / output
      //Bước 1
        Scanner keyboard;
        //bước 3
        keyboard = 
        //Bước 2
        new Scanner(System.in);
        System.out.print("[NHAP SO THU NHAT]");
        //gửi thông điệp đến hành vi nextInt()
        //của đối tượng Scanner
        int so1 = keyboard.nextInt();
         System.out.print("[NHAP SO THU HAI]");
        //gửi thông điệp đến hành vi nextInt()
        //của đối tượng Scanner
        int so2 = keyboard.nextInt();

    //Bước 1
        Multiplier mul;
        //Bước 3
        mul = 
        //bước 2
        new Multiplier(so1, so2);
        
        //gửi thông điệp đến hành vi multiply()
        //của đối tượng Multiplier
        int result = mul.multiply();
        //output
        System.out.println("Ket qua: " + result);
        
    }
    
}
