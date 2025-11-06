/*
 * Ad Soyad: [Arda Yeşil]
 * Ogrenci No: [250542013]
 * Tarih: [27.10.2025]
 * Aciklama: Gorev 3 - MaasHesap
 * 
 * Bu programı kullanarak Kullanıcıdan Adı,Soyadı,Haftalık çalışma saati , brüt maaşı ve mesai saatini verilerini alarak kullanıcının maaşını hesaplayıp 
 * detaylı bir şekilde ekrana yazdırıyoruz.
 */

import java.util.Date;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    //Kullunacının verileri alınıyor.
    System.out.println("=== MAAS HESAPLAMA SISTEMI ===");
    System.out.print("\nAdınızı Giriniz : ");
    String Ad = input.nextLine();

    System.out.print("Soyadınızı Giriniz : ");
    String Soyad = input.next();

    System.out.print("Aylık Bürüt Maaşınızı Giriniz : ");
    Double BürütMaaş = input.nextDouble();

    System.out.print("Haftalık Çalışma Saatini Giriniz : ");
    int HaftalıkÇalışmaSaati = input.nextInt();

    System.out.print("Mesai Saati Sayısını Giriniz : ");
    int MesaiSaati = input.nextInt();

    //Gerekli değişkenler tanımlanıyor ve gerekli hesaplamalar yapılıyor.
    Date date = new Date();

    int AylıkÇalışmaSaati=HaftalıkÇalışmaSaati/5*22;
    final double SGK_ORANI = 0.14;
    final double GELIR_VERGISI_ORANI = 0.15;
    final double DAMGA_VERGISI_ORANI = 0.00759;
    double MesaiÜcreti = (BürütMaaş / AylıkÇalışmaSaati) * MesaiSaati * 1.5;
    double ToplamGelir = MesaiÜcreti + BürütMaaş;

    Double SGK = ToplamGelir * SGK_ORANI;
    Double GelirVergisi = ToplamGelir * GELIR_VERGISI_ORANI;
    Double DamgaVergisi = ToplamGelir * DAMGA_VERGISI_ORANI;
    Double ToplamKesinti = SGK + GelirVergisi + DamgaVergisi;
    Double NetMaaş = ToplamGelir - ToplamKesinti;
    Double KesintiOranı = (ToplamKesinti / ToplamGelir) * 100;
    Double SaatlikNetKazanç = NetMaaş / AylıkÇalışmaSaati;
    Double GünlükNetKazanç = NetMaaş / 22;

    //Ekrana çıktı olarak yazdırılır.
    System.out.println("=============================");
    System.out.println("         MAAS BODROSU");
    System.out.println("=============================");
    System.out.println("Calısan : " + Ad + " " + Soyad);
    System.out.printf("%s %te.%<tM.%<tY", "Tarih   :", date);
    System.out.println("");
    System.out.println("\nGELIRLER :");
    System.out.printf("  Brut Maas              : %.2f TL", BürütMaaş);
    System.out.printf("\n  Mesai Ücreti (%d saat) : %.2f TL", MesaiSaati, MesaiÜcreti);
    System.out.println("\n  ------------------------");
    System.out.printf("  TOPLAM GELİR           : %.2f TL", ToplamGelir);
    System.out.println("\n");
    System.out.println("KESINTILER:");
    System.out.print("  SGK Kesintisi (14.5%)  :");  System.out.printf(" %.2f TL", SGK);
    System.out.print("\n  Gelir Vergisi (15.0%)  :");  System.out.printf(" %.2f TL", GelirVergisi);
    System.out.print("\n  Damga Vergisi  (0.8%)  :"); System.out.printf(" %.2f TL", DamgaVergisi);
    System.out.println("\n  ------------------------");
    System.out.printf("  TOPLAM KESINTI         : %.2f TL", ToplamKesinti);
    System.out.printf("\nNET MAAS                 : %.2f TL", NetMaaş);
    System.out.println("\n\nISTATISTIKLER :");
    System.out.printf("  Kesinti Oranı          : %.1f", KesintiOranı);System.out.println("%");
    System.out.printf("  Saatlik Net Kazanç     : %.2f TL/saat", SaatlikNetKazanç);
    System.out.printf("\n  Gunluk Net Kazanç      : %.2f  TL/gün", GünlükNetKazanç);
    System.out.println("\n=============================");

    //Scanner kapatıldı
    input.close();
  }

}

git add .
git commit -m "Odev 3 tamamlandi"
git push
