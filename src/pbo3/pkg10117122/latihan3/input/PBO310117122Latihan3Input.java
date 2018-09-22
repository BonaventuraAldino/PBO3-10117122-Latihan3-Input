/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117122.latihan3.input;

import java.util.Scanner;

/**
 *
 * @author lenovo
 * 
 * NAMA  : BONAVENTURA ALDINO SENDA SENI
 * KELAS : PBO-3
 * NIM   : 10117122
 * 
 */
public class PBO310117122Latihan3Input {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.print("Masukkan nama anda : ");
        Scanner scanner = new Scanner (System.in);
        
        String nama = scanner.next();
        System.out.println("Nama anda adalah "+nama);
        
    }
}
