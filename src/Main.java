import Aeronave.Aeronave;
import Aeronave.JatoDeCaca;

public class Main {
    public static void main(String[] args) {

        // Criando uma instância de Aeronave
        Aeronave aeronave = new Aeronave(2, 1500.0F);
        System.out.println("Número de Ocupantes da Aeronave: " + aeronave.getNumeroOcupante());
        System.out.println("Capacidade de Carga da Aeronave: " + aeronave.getCapcidadeCargo());
        aeronave.voar();

        // Criando uma instância de JatoDeCaca
        JatoDeCaca jato = new JatoDeCaca(1, 2.0F, "Mísseis ar-ar");
        System.out.println("Número de Ocupantes do Jato de Caça: " + jato.getNumeroOcupante());
        System.out.println("Capacidade de Carga do Jato de Caça: " + jato.getCapcidadeCargo());
        System.out.println("Armamento do Jato de Caça: " + jato.getArmamento());
        jato.voar();
        jato.atirar(5);
    }
}
