/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.latuklsoal2;

/**
 *
 * @author asyraf
 */
import java.util.Scanner;
public class LatUKLsoal2 {

    public static void main(String[] args) {
         Scanner masukan = new Scanner (System.in);
       int bilangan1;
       System.out.print("Masukkan  Bilangan = ");
       bilangan1 = masukan.nextInt();
       if(bilangan1 % 2 == 0){
           System.out.println("Bilangan Genap");
       }else{
           System.out.println("Bilangan Ganjil");
       }
    }
}
