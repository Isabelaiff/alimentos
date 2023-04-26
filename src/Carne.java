import java.time.LocalDate;

public class Carne extends Alimento {
    private double peso;
    private int desacos;

    public Carne(String nome, double custo, LocalDate validade, double peso, int desacos) {
        super(nome, custo, validade);
        this.peso = peso;
        this.desacos = desacos;
    }

    public double calcularPreco() {
        double preco = getCusto() * peso;
        preco += 2.5 * desacos;
        return preco;
    }

    private double getCusto() {
        return 0;
    }

    public void cortar(int quantidade) {
        if (quantidade <= desacos) {
            desacos -= quantidade;
            System.out.println("Cortou " + quantidade + " desacos.");
        } else {
            System.out.println("Não é possível cortar " + quantidade + " desacos, pois só há " + desacos + " desacos disponíveis.");
        }
    }
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getDesacos() {
        return desacos;
    }

    public void setDesacos(int desacos) {
        this.desacos = desacos;
    }
}
