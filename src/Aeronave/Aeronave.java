package Aeronave;

public class Aeronave {
    private int numeroOcupante;
    private float capcidadeCargo;


    // Construtor da classe Aeronave
    public Aeronave(int numeroOcupante, float capcidadeCargo) {
        this.numeroOcupante = numeroOcupante;
        this.capcidadeCargo = capcidadeCargo;

    }

    public int getNumeroOcupante() {   // Método para obter o número de ocupantes
        return numeroOcupante;
    }

    public void setNumeroOcupante(int numeroOcupante) {  // Método para obter Capacidade de Carga
        this.numeroOcupante = numeroOcupante;
    }

    public float getCapcidadeCargo() {
        return capcidadeCargo;
    }

    public void setCapcidadeCargo(float capcidadeCargo) {
        this.capcidadeCargo = capcidadeCargo;
    }

    public void voar() {  // Método para simular que a aeronave está voando
        System.out.println("Aeronave voando");
    }
}
