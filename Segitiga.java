public class Segitiga extends LimasSegitiga{
    public float luasSegitiga;
    public float kelilingSegitiga;
    public float a;
    public float t;

    Segitiga(){

    }

    Segitiga(float a, float t){
        this.a = a;
        this.t = t;
    }

    public void setaSegitiga(float a){
        this.a = a;
    }

    public float getaSegitiga(){
        return a;
    }

    public void settSegitiga(float t){
        this.t = t;
    }

    public float gettSegitiga(){
        return t;
    }

    public void hitungLuas(){
        luasSegitiga = a * t / 2;
    }

    public void hitungKeliling(){
        kelilingSegitiga = a + a + a;
    }
}
