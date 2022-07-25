package Modeller;

public class Adres {
    private String id;
    private Musteri musteri;
    private String musteriId;
    private String adresDetay;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Musteri getMusteri() {
        return musteri;
    }

    public void setMusteri(Musteri musteri) {
        this.musteri = musteri;
    }

    public String getMusteriId() {
        return musteriId;
    }

    public void setMusteriId(String musteriId) {
        this.musteriId = musteriId;
    }

    public String getAdresDetay() {
        return adresDetay;
    }

    public void setAdresDetay(String adresDetay) {
        this.adresDetay = adresDetay;
    }
}
