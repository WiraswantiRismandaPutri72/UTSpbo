public class Lingkaran extends Bola{
    public float luasLingkaran;
    public float kelilingLingkaran;
    public float rLingkaran;
    public float phi = 22/7;

    Lingkaran(){

    }

    Lingkaran(float rLingkaran, float phi){
        this.rLingkaran = rLingkaran;
        this.phi = phi;
    }

    public void setrLingkaran(float rLingkaran){
        this.rLingkaran = rLingkaran;
    }

    public float getrLingkaran(){
        return rLingkaran;
    }

    public void hitungLuas(){
        luasLingkaran = phi * rLingkaran * rLingkaran;
    }

    public void hitungKeliling(){
        kelilingLingkaran = phi * rLingkaran * rLingkaran;
    }
}
