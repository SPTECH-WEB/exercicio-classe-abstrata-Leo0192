package school.sptech;

public class Circulo extends Figura{
    private Double raio;

    public Double getRaio() {
        return raio;
    }

    public void setRaio(Double raio) {
        this.raio = raio;
    }

    @Override public Double calcularArea(){
        return (raio * raio) * Math.PI;
    }

    @Override public String toString(){
        return "O circulo tem raio de: " + raio + "e uma área de: " + calcularArea();
    }
}
