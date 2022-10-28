public class Persegi extends Kubus{
    public float luasPersegi;
    public float kelilingLPersegi;
    public float sPersegi;

    Persegi(){

    }

    Persegi(float sPersegi){
        this.sPersegi = sPersegi;
    }

    public void setsPersegi(float sPersegi){
        this.sPersegi = sPersegi;
    }

    public float getsPersegi(){
        return sPersegi;
    }

    public void hitungLuas(){
        luasPersegi = sPersegi * sPersegi;
    }

    public void hitungKeliling(){
        kelilingPersegi = 4 * sPersegi;
    }
}
