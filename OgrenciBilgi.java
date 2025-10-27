/*
 * Ad Soyad: [Arda Yeşil]
 * Ogrenci No: [250542013]
 * Tarih: [27.10.2025]
 * Aciklama: Gorev 1 - Ogrenci Bilgi Sistemi
 * 
 * Bu program kullanicidan ogrenci bilgilerini alir ve
 * duzenli bir formatta ekrana yazdirir.
 * Diğer java dosyalarının başında da bu örnek formattaki gibi kısa bilgi giriniz
 */

import java.util.Scanner;

public class OgrenciBilgi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
         String ad,Soyad;
        int ogrenci_no,yas;
        double gpa;
        
        
        // Kullanicidan bilgileri alin
        System.out.println("=== OGRENCI BILGI SISTEMI ===");
        System.out.println();
        
        System.out.print("Adınızı Giriniz :");
        ad = input.nextLine();

        System.out.print("Soyadınızı Giriniz :");
        Soyad = input.nextLine();

        System.out.print("Öğrenci Numaranızı Giriniz :");
        ogrenci_no = input.nextInt();

        System.out.print("Yaşınızı Giriniz :");
        yas = input.nextInt();

        System.out.print("GPA (0.00-4.00):");
        gpa = input.nextDouble();
        
        
        // Bilgileri ekrana yazdirin
        System.out.println("\n=== OGRENCI BILGI SISTEMI ===");
        
        // COZUMUNUZU BURAYA YAZIN
        
        System.out.println("=== oğrenci bilgi sistemi ===");
        System.out.printf("Ad Soyad   : %s %s", ad, Soyad);
        System.out.printf("\nOgrenci No : %d", ogrenci_no);
        System.out.printf("\nYas        : %d", yas);
        System.out.printf("\nGPA        : %.2f", gpa);

        if (gpa > 3) {
          System.out.println("\nDurum      : Başarılı Öğrenci");
        } else {
          System.out.println("\nDurum      : Başarısız Öğrenci");
        }
        
        
        
        

        
        input.close();
        // Scanner'i kapatin (önemli pratik)
        
    }
}

git add .
git commit -m "Odev 1 tamamlandi"
git push
