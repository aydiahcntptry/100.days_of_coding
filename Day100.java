package pkg100.days.of.coding;

import java.util.Scanner;

public class Day100_ {

    public static void main(String[] args) {
        
        /*mengecek kata/nomor palindrome atau bukan
        kata palindrome adalah kata-kata yang dapat dibaca
        baik dari depan maupun dari belakang*/

        System.out.println("=====mengecek kata/nomor palindrome atau bukan=====");
        
        String kata, balik = "";
        
        Scanner sc = new Scanner(System.in);
        System.out.println("masukan kata/nomor : ");
        kata = sc.nextLine();
        
        int length = kata.length();
        
        for (int i = length -1; i >=0; i--) {
            balik = balik + kata.charAt(i);
        }
        
        if(kata.equals(balik)){
            System.out.println(kata + " adalah kata/nomor palindrome");
        }else{
            System.out.println(kata + " adalah bukan kata/nomor Palindrome");
        }
        
    }
}
    
