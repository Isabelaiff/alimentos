import java.time.LocalDate;

public abstract class Alimento {
    private String nome;
    private double custo;
    private LocalDate validade;

    public Alimento(String nome, double custo, LocalDate validade) {
        this.nome = nome;
        this.custo = custo;
        this.validade = validade;
    }

    public abstract double calcularPreco();

    public boolean verificarValidade(LocalDate dataAtual) {
        return validade.isAfter(dataAtual);
    }
}
