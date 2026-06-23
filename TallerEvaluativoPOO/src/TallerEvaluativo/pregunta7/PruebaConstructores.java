package TallerEvaluativo.pregunta7;

public class PruebaConstructores {
    public static void main(String[] args) {
        // Probando el primer constructor
        Estudiante estudiante1 = new Estudiante("Angie Quintero", "12345", "Sistemas");
        estudiante1.mostrarDatos();

        System.out.println("------------------------------------------------");

        // Probando el segundo constructor (Sobrecargado)
        Estudiante estudiante2 = new Estudiante("Carlos Pérez", "67890");
        estudiante2.mostrarDatos();
    }
}