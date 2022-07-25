package Modeller;

import java.util.Date;

public class TicariFaaliyet {

    private String id;
    private GercekMusteri gercekMusteri;
    private String gercekMusteriId;
    private Date baslangicTarihi;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public GercekMusteri getGercekMusteri() {
        return gercekMusteri;
    }

    public void setGercekMusteri(GercekMusteri gercekMusteri) {
        this.gercekMusteri = gercekMusteri;
    }

    public String getGercekMusteriId() {
        return gercekMusteriId;
    }

    public void setGercekMusteriId(String gercekMusteriId) {
        this.gercekMusteriId = gercekMusteriId;
    }

    public Date getBaslangicTarihi() {
        return baslangicTarihi;
    }

    public void setBaslangicTarihi(Date baslangicTarihi) {
        this.baslangicTarihi = baslangicTarihi;
    }
}
