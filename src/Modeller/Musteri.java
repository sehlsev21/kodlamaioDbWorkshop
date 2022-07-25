package Modeller;

public class Musteri {

    private String id; //Önceden işyeri eğitimi gerçeklestirdiğim firma, id'leri string şeklinde tanımlıyordu. (.NET)
    private long musteriNo;
    private Kanal kanal; //kanal id'sine ulasabilmek icin kanal property'sine de ulaşmamız gerekiyor.
    private String kanalId;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public long getMusteriNo() {
        return musteriNo;
    }

    public void setMusteriNo(long musteriNo) {
        this.musteriNo = musteriNo;
    }

    public Kanal getKanal() {
        return kanal;
    }

    public void setKanal(Kanal kanal) {
        this.kanal = kanal;
    }

    public String getKanalId() {
        return kanalId;
    }

    public void setKanalId(String kanalId) {
        this.kanalId = kanalId;
    }
}
