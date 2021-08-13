package sesion03_mul_a;

public class Cilindrica {
	private float r, teta, z;

    public Cilindrica(float r, float teta, float z) {
        this.r = r;//Radio de la base 
        this.teta = teta;//Angulo respecto X de la proyección del punto sobre el plano XY
        this.z = z;//Valor de la coordenada Z
    }

    public Cilindrica() {

    }

    public Cilindrica esferica_cilindrica(float r, float alpha, float teta) {

        float r1 = (float) (r * Math.sin(alpha));
        float z = (float) (r * Math.cos(alpha));

        return new Cilindrica(r1, teta, z);
    }

    public Cilindrica esferica_cilindrica(Esferica e) {

        return esferica_cilindrica(e.getR(), e.getAlpha(), e.getteta());
    }

    public Esferica clindrica_esferica(float r, float teta, float z) {

        float r1 = (float) Math.sqrt((Math.pow(r, 2)) + Math.pow(z, 2));
        float alpha = (float) Math.atan(r / z);

        return new Esferica(r1, alpha, teta);

    }

    public Esferica cilindrica_esferica(Cilindrica c) {

        return clindrica_esferica(c.getR(), c.getteta(), c.getZ());
    }

    public float getR() {
        return r;
    }

    public void setR(float r) {
        this.r = r;
    }

    public float getteta() {
        return teta;
    }

    public void setteta(float teta) {
        this.teta = teta;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
}
