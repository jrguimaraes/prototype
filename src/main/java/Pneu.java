public class Pneu implements Cloneable {
    private int largura;
    private int altura;
    private Aro aro;

    public Pneu(int largura, int altura, Aro aro) {
        this.largura = largura;
        this.altura = altura;
        this.aro = aro;
    }

    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public Aro getAro() {
        return aro;
    }

    public void setAro(Aro aro) {
        this.aro = aro;
    }

    @Override
    public Pneu clone() throws CloneNotSupportedException {
        Pneu pneuClone = (Pneu) super.clone();
        pneuClone.aro = (Aro) pneuClone.aro.clone();
        return pneuClone;
    }

    @Override
    public String toString() {
        return "Pneu{" +
                "largura=" + largura +
                ", altura=" + altura +
                ", aro=" + aro + "}";
    }
}
