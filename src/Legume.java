import java.time.Instant;
import java.time.LocalDate;

public class Legume extends Alimento {
    private String textura;
    private boolean descascado;

    public Legume(String nome, double custo, LocalDate validade, String textura, boolean descascado) {
        super(nome, custo, validade);
        this.textura = textura;
        this.descascado = descascado;
    }

    public double calcularPreco() {
        double preco = getCusto();
        if (descascado) {
            preco += 0.5 * getCusto();
        }
        if (getValidade().isBefore(Instant.from(LocalDate.now().plusDays(2)))) {
            preco *= 0.5;
        }
        return preco;
    }

    private Instant getValidade() {
        return null;
    }

    private double getCusto() {
        return 0;
    }

    public void descascar() {
        if (!descascado) {
            descascado = true;
            System.out.println("Legume descascado!");
        } else {
            System.out.println("O legume já está descascado.");
        }
    }
    public String getTextura() {
        return textura;
    }

    public void setTextura(String textura) {
        this.textura = textura;
    }

    public boolean isDescascado() {
        return descascado;
    }

    public void setDescascado(boolean descascado) {
        this.descascado = descascado;
    }
}
