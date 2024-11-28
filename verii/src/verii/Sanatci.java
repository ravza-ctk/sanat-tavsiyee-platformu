package verii;

import java.util.ArrayList;
import java.util.List;

public class Sanatci {
    private String sanatciAd;
    private List<Sarki> sarkilar;

    public Sanatci(String sanatciAd) {
        this.sanatciAd = sanatciAd;
        this.sarkilar = new ArrayList<>();
    }

    public String getSanatciAd() {
        return sanatciAd;
    }

    public void sarkiEkle(Sarki sarki) {
        sarkilar.add(sarki);
    }

    public List<Sarki> getSarkilar() {
        return sarkilar;
    }
}
