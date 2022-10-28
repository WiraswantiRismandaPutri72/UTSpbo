public class Bola extends BangunRuang{
    public float luasLingkaran;
    public float kelilingLingkaran;

    public void hitungVolume(Lingkaran l){
        volume = 4/3 * l.phi * l.rLingkaran * l.rLingkaran * l.rLingkaran;
    }

    public void hitungLuasPermukaan(Lingkaran l){
        luasPermukaan = 4 * l.phi * l.rLingkaran * l.rLingkaran;
    }

    public void tampilBola(Lingkaran l){
        System.out.println("Luas Lingkaran = " + l.luasLingkaran);
        System.out.println("Luas Lingkaran = " + l.kelilingLingkaran);
        System.out.println("Volume bola = " + super.volume);
        System.out.println("Luas Permukaan bola = " + super.luasPermukaan);
    }
}
