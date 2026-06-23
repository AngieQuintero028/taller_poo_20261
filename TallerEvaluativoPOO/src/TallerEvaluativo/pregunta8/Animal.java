package TallerEvaluativo.pregunta8;

import java.util.ArrayList;
import java.util.List;

// Clase Padre (Superclase)
class Animal {
    protected String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    // Método genérico que será sobrescrito polimórficamente
    public void hacerSonido() {
        System.out.println(nombre + " hace un sonido genérico.");
    }
}

// Clase Hija 1: Perro (Aplica Herencia)
class Perro extends Animal {
    public Perro(String nombre) {
        super(nombre); // Llama al constructor de la clase padre
    }

    @Override // Sobrescritura de método: Polimorfismo
    public void hacerSonido() {
        System.out.println(nombre + " dice: ¡Guau, Guau!");
    }
}

// Clase Hija 2: Gato (Aplica Herencia)
class Gato extends Animal {
    public Gato(String nombre) {
        super(nombre);
    }

    @Override // Sobrescritura de método: Polimorfismo
    public void hacerSonido() {
        System.out.println(nombre + " dice: ¡Miau, Miau!");
    }
}
// Clase Hija 3: Vaca (Aplica Herencia)
class Vaca extends Animal {
    public Vaca(String nombre) {
        super(nombre);
    }

    @Override // Sobrescritura de método: Polimorfismo
    public void hacerSonido() {
        System.out.println(nombre + " dice: ¡Muuu, Muuu!");
    }
}
// Clase Hija 4: Ave (Aplica Herencia)
class Ave extends Animal {
    public Ave(String nombre) {
        super(nombre);
    }

    @Override // Sobrescritura de método: Polimorfismo
    public void hacerSonido() {
        System.out.println(nombre + " dice: ¡Pío, Pío!");
    }
}

