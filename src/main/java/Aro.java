public class Aro implements Cloneable {
    private int tamanho;
    private String tipo;

    public Aro(int tamanho, String tipo) {
        super();
        this.tamanho = tamanho;
        this.tipo = tipo;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Aro{" +
                "tamanho=" + tamanho +
                ", tipo='" + tipo + '\'' + '}';
    }
}
