public class Kubus extends BangunRuang{
    public float luasPersegi;
    public float kelilingPersegi;

    public void hitungVolume(Persegi p){
        volume = p.sPersegi * p.sPersegi * p.sPersegi;
    }

    public void hitungLuasPermukaan(Persegi p){
        luasPermukaan = 6 * (p.sPersegi * p.sPersegi);
    }

    public void tampilKubus(Persegi p){
        System.out.println("Luas Persegi = " + p.luasPersegi);
        System.out.println("Luas Persegi = " + p.kelilingPersegi);
        System.out.println("Volume Kubus = " + super.volume);
        System.out.println("Luas Permukaan Kubus = " + super.luasPermukaan);
    }
}
