package Aeronave;

public class JatoDeCaca extends Aeronave {
    private String armamento;

    public JatoDeCaca(int numeroOcupante, float capacidadeCargo, String armamento) {
        super(numeroOcupante, capacidadeCargo);
        this.armamento = armamento;
    }

    public String getArmamento() {
        return armamento;
    }

    public void setArmamento(String armamento) {
        this.armamento = armamento;
    }

    public void atirar(int i) {
        System.out.println("Disparando armamento.");
    }


}
