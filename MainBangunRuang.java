public class MainBangunRuang{
    public static void main(String[] args){
        BangunRuang bg = new BangunRuang();
        Lingkaran l = new Lingkaran();
        Persegi p = new Persegi();
        Segitiga s = new Segitiga();
        Bola bl = new Bola();
        Kubus kb = new Kubus();
        LimasSegiEmpat lsm = new LimasSegiEmpat();
        LimasSegitiga lst = new LimasSegitiga();

        bg.tampil();
        l.rLingkaran = 7;
        l.hitungLuas();
        l.hitungKeliling();
        bl.hitungLuasPermukaan(l);
        bl.hitungVolume(l);
        bl.tampilBola(l);

        bg.tampil();
        p.sPersegi = 5;
        p.hitungLuas();
        p.hitungKeliling();
        kb.hitungLuasPermukaan(p);
        kb.hitungVolume(p);
        kb.tampilKubus(p);

        bg.tampil();
        s.a = 5;
        s.t = 10;
        lsm.hitungLuasPermukaan(s, p);
        lsm.hitungVolume(s);
        lsm.tampilLimasSegiEmpat(s);

        bg.tampil();
        s.a = 5;
        s.t = 10;
        s.hitungLuas();
        s.hitungKeliling();
        lst.hitungLuasPermukaan(s);
        lst.hitungVolume(s);
        lst.tampilLimasSegiEmpat(s);
    }
}