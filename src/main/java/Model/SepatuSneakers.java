package Model;

public class SepatuSneakers extends Sepatu {

    public SepatuSneakers(String idSepatu, String merek, String warna) {
        super(idSepatu, merek, warna);
    }

    @Override
    public void tampilkanJenis() {
        System.out.println("Jenis Sepatu : Sneakers");
    }
}