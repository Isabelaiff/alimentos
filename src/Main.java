import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Legume legume = new Legume("Cenoura", 2.5, LocalDate.of(2023, 4, 5), "Crocante", false);
        System.out.println("Preço do legume: " + legume.calcularPreco());
        legume.descascar();

        Alimento alimento = new Carne("Alcatra", 20.0, LocalDate.of(2023, 4, 8), 1.2, 4);
        System.out.println("Preço do alimento (Carne): " + alimento.calcularPreco());
        System.out.println("Verificando validade do alimento: " + alimento.verificarValidade(LocalDate.now()));
    }

}
