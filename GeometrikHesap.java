/*
 * Ad Soyad: [Arda Yeşil]
 * Ogrenci No: [250542013]
 * Tarih: [27.10.2025]
 * Aciklama: Gorev 1 - Ogrenci Bilgi Sistemi
 * 
 * Bu program kullanicidan dairenin yarı çapını alarak dairenin alan , çevre , çap , yüzeyalanı ve hacmini hesaplayarak
 * duzenli bir formatta ekrana yazdirir.
 * 
 */


import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
  
      float pi = 3.14159f; // pi tanımlandı
      Double alan, çevre, çap, yuzeyAlanı,hacim; //İstenilen Geometrik hesaplamaların değişkenlerini tanımladık

      System.out.println("===== GEOMETRIK HESAPLAYICI =====");
      System.out.print("Dairenin yarıcapını giriniz (cm):");

      //Geometrik Hesaplamaları yapıldı
      alan = pi * yarıcap * yarıcap;
      çevre = 2 * pi * yarıcap;
      çap = 2 * yarıcap;
      yuzeyAlanı = 4 * pi * yarıcap * yarıcap;
      hacim = 4.0*pi*yarıcap*yarıcap*yarıcap/3.0;


      //Çıktı Gösterildi
      System.out.println("\nSonuçlar :");
      System.out.println("===========");
      System.out.printf(" Daire Alanı       : %.2f cm²", alan);
      System.out.printf("\n Daire Çevresi     : %.2f cm", çevre);
      System.out.printf("\n Daire Çapı        : %.2f cm", çap);
      System.out.printf("\n Daire Hacmi       : %.2f cm³", hacim);
      System.out.printf("\n Daire Yüzey Alanı : %.2f cm²", yuzeyAlanı);
  
    //Scanner kapandı
    input.close();
  }

}
