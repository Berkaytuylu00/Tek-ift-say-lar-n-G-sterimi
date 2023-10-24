package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Kullanıcının girdiği sayıya kadar olan çift sayıları yazdıran program
        Scanner input = new Scanner(System.in);
        int sayi;
        System.out.println("Sayi girin");
        sayi = input.nextInt();

        for (int i = 1; i <= sayi; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
//Kullanıcının girdiği sayıya kadar olan 3e bölünen sayıları yazdıran program
      /*for (int i=1;i<=sayi;i++){
          if (i%3==0){
              System.out.println(i);
          }
      }
*/
        //Kullanıcının girdiği sayıya kadar olan 4e bölünen sayıları yazdıran program

    /*    for (int i=1;i<=sayi;i++){
            if (i%4==0){
                System.out.println(i);
            }
        }

     */
    }
}
