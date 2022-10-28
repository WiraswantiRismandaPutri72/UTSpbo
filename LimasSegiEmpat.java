public class LimasSegiEmpat extends BangunRuang{
    public float luasSegitiga;
    public float kelilingSegitiga;

    public void hitungVolume(Segitiga s){
        volume = s.a * s.a * s.t / 3;
    }

    public void hitungLuasPermukaan(Segitiga s, Persegi p){
        luasPermukaan = (4 * p.sPersegi) * s.a * s.a;
    }

    public void tampilLimasSegiEmpat(Segitiga s){
        System.out.println("Alas = " + s.a);
        System.out.println("Tinggi = " + s.t);
        System.out.println("Volume Limas SegiEmpat = " + super.volume);
        System.out.println("Luas Permukaan Limas SegiEmpat = " + super.luasPermukaan);
    }
}
