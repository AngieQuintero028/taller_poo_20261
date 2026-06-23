package TallerEvaluativo.pregunta8;

import java.util.ArrayList;
import java.util.List;

// Clase Principal para demostrar el Polimorfismo dinámico en colecciones
public class PruebaHerenciaPolimorfismo {
    public static void main(String[] args) {
        // Creamos una lista genérica de tipo Animal (Colección polimórfica)
        List<Animal> misAnimales = new ArrayList<>();

        // // Guardamos los cuatro animales en la misma lista (Polimorfismo)
        misAnimales.add(new Perro("Lucas"));
        misAnimales.add(new Gato("Michi"));
        misAnimales.add(new Vaca("Lola"));
        misAnimales.add(new Ave("Pepe"));

        System.out.println("--- Demostración de Polimorfismo en Java ---");

        // Recorremos la lista y cada animal responde según su comportamiento real
        for (Animal animal : misAnimales) {
            animal.hacerSonido();
        }
    }
}