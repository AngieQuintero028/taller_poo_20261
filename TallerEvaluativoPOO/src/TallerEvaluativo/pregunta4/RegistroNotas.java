package TallerEvaluativo.pregunta4;

import java.util.Scanner;

public class RegistroNotas {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int cantidadEstudiantes;
        double nota;
        double sumaNotas = 0;
        double promedio;
        int aprobados = 0;
        int reprobados = 0;

        System.out.print("Ingrese la cantidad de estudiantes: ");
        cantidadEstudiantes = scanner.nextInt();

        for (int i = 1; i <= cantidadEstudiantes; i++) {

            System.out.println("\nEstudiante #" + i);

            do {
                System.out.print("Ingrese la nota (0.0 - 5.0): ");
                nota = scanner.nextDouble();

                if (nota < 0 || nota > 5) {
                    System.out.println("Error: la nota debe estar entre 0.0 y 5.0");
                }

            } while (nota < 0 || nota > 5);

            sumaNotas += nota;

            if (nota >= 3.0) {
                aprobados++;
            } else {
                reprobados++;
            }
        }

        promedio = sumaNotas / cantidadEstudiantes;

        System.out.println("\n===== RESULTADOS =====");
        System.out.println("Promedio general: " + promedio);
        System.out.println("Aprobados: " + aprobados);
        System.out.println("Reprobados: " + reprobados);

    }
}