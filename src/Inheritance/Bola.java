package Inheritance;

public class Bola extends Lingkaran implements BangunRuang{

    @Override
    public void Bangun() {
        System.out.println("Bangun Bola");
        System.out.println("==============");
    }

    @Override
    public void Karakteristik() {
        System.out.println("1.Tidak memiliki rusuk dan titik sudut." + "\n" +
                "2.Memiliki satu bidang sisi lengkung, yakni selimut bola." + "\n" +
                "3.Terdapat jari-jari dan diameter." + "\n" +
                "4.Memiliki luas permukaan dan volume." + "\n" );
    }

    @Override
    public double Volume() {
        double Volume = (phi * jari * jari * jari) * (4/3);
        return Volume;
    }

    @Override
    public double LuasP() {
        double Luas = 4 * Luas();
        return Luas;
    }
}
