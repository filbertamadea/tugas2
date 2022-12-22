package Inheritance;

public class Prisma extends Segitiga implements BangunRuang{
    int tinggiP;
    @Override
    public void Bangun() {
        System.out.println("Bangun Prisma");
        System.out.println("==============");
    }

    @Override
    public void Karakteristik() {
        System.out.println("1.Mempunyai sisi prisma segitiga." + "\n" +
                "2.Bentuk alas dan atapnya segitiga." + "\n" +
                "3.Rusuk tegak sama panjang Mempunyai 6 buah." + "\n" +
                "4.titik sudut Mempunyai 9 buah rusuk." + "\n" );
    }

    @Override
    public double Volume() {
        double VolumePrisma = ((Luas() / 2) * tinggiP);
        return VolumePrisma;
    }

    @Override
    public double LuasP() {
        double LuasPrisma = (2 * Luas()) + (Keliling() * tinggiP);
        return LuasPrisma;
    }
}
