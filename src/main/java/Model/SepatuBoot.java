package Model;

public class SepatuBoot extends Sepatu {

    public SepatuBoot(String idSepatu, String merek, String warna) {
        super(idSepatu, merek, warna);
    }

    @Override
    public void tampilkanJenis() {
        System.out.println("Jenis Sepatu : Boots");
    }
}