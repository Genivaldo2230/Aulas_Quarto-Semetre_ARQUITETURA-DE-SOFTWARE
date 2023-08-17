package Aeronave;

public class AeronaveDeAsasRotativas extends Aeronave {
    private boolean rotorDeCalda;

    // Construtor da classe AeronaveDeAsasRotativas
    public AeronaveDeAsasRotativas(int numeroOcupante, float capacidadeCargo, boolean rotorDeCalda) {
        super(numeroOcupante, capacidadeCargo);
        this.rotorDeCalda = rotorDeCalda;
    }

    // Método para verificar se tem rotor de calda
    public boolean isRotorDeCalda() {
        return rotorDeCalda;
    }

    // Método para definir a presença do rotor de calda
    public void setRotorDeCalda(boolean rotorDeCalda) {
        this.rotorDeCalda = rotorDeCalda;
    }
}
