package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    public static boolean isPalindrome(int sayi){
        String str = String.valueOf(sayi).replaceAll("-","");;
        String[] str1= str.split("");
        String str2="";
        for(int i=str1.length-1;i>=0;i--){
          str2+=str1[i];
        }
        return str.equals(str2);
    }

    public static boolean isPerfectNumber(int sayi) {
        if (sayi < 1) {
            return false;
        }

        int toplam = 0;
        for (int i = 1; i < sayi; i++) {
            if (sayi % i == 0) {
                toplam += i;
            }
        }

        return toplam == sayi;
    }

    public static String numberToWords(int sayi) {
        if (sayi < 0) {
            return "Invalid Value";
        }

        String sonuc = "";
        String str = "" + sayi;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            switch (c) {
                case '0': sonuc += "Zero "; break;
                case '1': sonuc += "One "; break;
                case '2': sonuc += "Two "; break;
                case '3': sonuc += "Three "; break;
                case '4': sonuc += "Four "; break;
                case '5': sonuc += "Five "; break;
                case '6': sonuc += "Six "; break;
                case '7': sonuc += "Seven "; break;
                case '8': sonuc += "Eight "; break;
                case '9': sonuc += "Nine "; break;
            }
        }

        return sonuc.trim();
    }

}
