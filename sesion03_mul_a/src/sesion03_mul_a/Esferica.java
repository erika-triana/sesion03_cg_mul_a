package sesion03_mul_a;

public class Esferica {
	private float r, alpha, teta;

    public Esferica(float r, float alpha, float teta) {
        this.r = r;
        this.alpha = alpha; 
        this.teta = teta;
    }

    public Esferica() {

    }

    public float getR() {
        return r;
    }

    public void setR(float r) {
        this.r = r;
    }

    public float getAlpha() {
        return alpha;
    }

    public void setAlpha(float alpha) {
        this.alpha = alpha;
    }

    public float getteta() {
        return teta;
    }

    public void setteta(float teta) {
        this.teta = teta;
    }
}
