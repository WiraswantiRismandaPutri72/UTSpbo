public class LimasSegitiga extends BangunRuang{
    public float luasSegitiga;
    public float kelilingSegitiga;

    public void hitungVolume(Segitiga s){
        volume = s.luasSegitiga * s.t / 3;
    }

    public void hitungLuasPermukaan(Segitiga s){
        luasPermukaan = 3 * s.luasSegitiga;
    }

    public void tampilLimasSegiEmpat(Segitiga s){
        System.out.println("Alas = " + s.a);
        System.out.println("Tinggi = " + s.t);
        System.out.println("Volume Limas SegiTiga = " + super.volume);
        System.out.println("Luas Permukaan Limas SegiTiga = " + super.luasPermukaan);
    }
}
