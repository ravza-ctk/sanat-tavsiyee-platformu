package verii;

public class Sarki {
    private String sarkiAd;
    private String sanatci;
    private String album;

    public Sarki(String sarkiAd, String sanatci, String album) {
        this.sarkiAd = sarkiAd;
        this.sanatci = sanatci;
        this.album = album;
    }

    public String getSarkiAd() {
        return sarkiAd;
    }

    public String getSanatci() {
        return sanatci;
    }

    public String getAlbum() {
        return album;
    }

    @Override
    public String toString() {
        return "Şarkı: " + sarkiAd + ", Sanatçı: " + sanatci + ", Albüm: " + album;
    }
}
