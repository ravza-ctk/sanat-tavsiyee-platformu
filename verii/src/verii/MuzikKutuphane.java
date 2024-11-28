package verii;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MuzikKutuphane {
    private Map<String, Sanatci> sanatcilar;

    public MuzikKutuphane() {
        sanatcilar = new HashMap<>();
    }

    public void sarkiEkle(Sarki sarki) {
        sanatcilar.putIfAbsent(sarki.getSanatci(), new Sanatci(sarki.getSanatci()));
        sanatcilar.get(sarki.getSanatci()).sarkiEkle(sarki);
    }

    public void sarkilariListele() {
        if (sanatcilar.isEmpty()) {
            System.out.println("Hiçbir şarkı veya sanatçı eklenmedi.");
            return;
        }

        for (Sanatci sanatci : sanatcilar.values()) {
            System.out.println("Sanatçı: " + sanatci.getSanatciAd());

            List<Sarki> sarkilar = sanatci.getSarkilar();
            if (!sarkilar.isEmpty()) {
                for (Sarki sarki : sarkilar) {
                    System.out.println(" - " + sarki);
                }
            } else {
                System.out.println("   Bu sanatçıya ait şarkı yok.");
            }
        }
    }

    public void sanatcilariListele() {
        if (sanatcilar.isEmpty()) {
            System.out.println("Hiçbir sanatçı eklenmedi.");
            return;
        }

        System.out.println("Sanatçılar:");
        for (String sanatciAd : sanatcilar.keySet()) {
            System.out.println(" - " + sanatciAd);
        }
    }
}
