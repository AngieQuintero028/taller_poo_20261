package TallerEvaluativo.pregunta7;

public class Estudiante {
    private String nombre;
    private String codigo;
    private String carrera;

    // CONSTRUCTOR 1: Recibe todos los parámetros (Constructor Completo)
    public Estudiante(String nombre, String codigo, String carrera) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.carrera = carrera;
        System.out.println("Objeto creado con el Constructor 1 (Completo)");
    }

    // CONSTRUCTOR 2: Sobrecarga. Solo pide nombre y código. Asigna carrera por defecto.
    public Estudiante(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.carrera = "Ingeniería Informática"; // Valor predeterminado
        System.out.println("Objeto creado con el Constructor 2 (Por defecto)");
    }

    public void mostrarDatos() {
        System.out.println("Estudiante: " + nombre + " | Código: " + codigo + " | Carrera: " + carrera);
    }
}
