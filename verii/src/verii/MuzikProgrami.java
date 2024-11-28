package verii;

import java.util.Scanner;

public class MuzikProgrami {
    public static void main(String[] args) {
        MuzikKutuphane muzikKutuphane = new MuzikKutuphane();
        Scanner scanner = new Scanner(System.in);
        String komut;

        System.out.println("Kişiselleştirilmiş Müzik Programı");
        do {
            System.out.print("Komut girin (ekle, listele, sanatcılar, çıkış): ");
            komut = scanner.nextLine();

            switch (komut) {
                case "ekle":
                    System.out.print("Şarkı adı: ");
                    String sarkiAd = scanner.nextLine();
                    System.out.print("Sanatçı adı: ");
                    String sanatciAd = scanner.nextLine();
                    System.out.print("Albüm adı: ");
                    String albumAd = scanner.nextLine();
                    Sarki yeniSarki = new Sarki(sarkiAd, sanatciAd, albumAd);
                    muzikKutuphane.sarkiEkle(yeniSarki);
                    System.out.println("Şarkı eklendi!");
                    break;

                case "listele":
                    muzikKutuphane.sarkilariListele();
                    break;

                case "sanatcılar":
                    muzikKutuphane.sanatcilariListele();
                    break;

                case "çıkış":
                    System.out.println("Programdan çıkılıyor...");
                    break;

                default:
                    System.out.println("Geçersiz komut. Lütfen tekrar deneyin.");
            }
        } while (!komut.equals("çıkış"));

        scanner.close();
    }
}
