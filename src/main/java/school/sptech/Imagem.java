package school.sptech;

import java.util.ArrayList;
import java.util.List;

public class Imagem {
    private List<Figura> figuras = new ArrayList<>();

        public List<Figura> getFiguras() {
            return figuras;
        }

        public void setFiguras(List<Figura> figuras) {
            this.figuras = figuras;
        }

        public void adicionar(Figura figura){
            figuras.add(figura);
        }

        public Double calcularSomaDasAreas(){
            Double areaTotal = 0.0;
            for (Figura figura:figuras){
                areaTotal += figura.calcularArea();
            } return areaTotal;
        }

        public List<Figura> buscarPorAreaMaiorQue20(){
            List<Figura>figuras2 = new ArrayList<>();
            for (Figura figura:figuras){
                if (figura.calcularArea() > 20){
                    figuras2.add(figura);
                }
            } return figuras2;
        }

        public List<Figura> buscarQuadrados(){
            List<Figura>figuras2 = new ArrayList<>();
            for (Figura figura:figuras){
                if (figura instanceof Quadrado){
                    figuras2.add(figura);
                }
            } return figuras2;
        }
}
