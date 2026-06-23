package TallerEvaluativo.pregunta9;

// 1. DEFINICIÓN DE LAS INTERFACES

interface Sonoro {
    void emitirSonido();
}

interface Desplazable {
    void desplazarse();
}

interface Volador {
    void volar();
}

// 2. LAS CLASES QUE USAN LAS INTERFACES
//la palabra 'implements' para conectarse a sus habilidades

// El perro implementa Sonoro y Desplazable (pero NO Volador, porque no vuela)
class Perro implements Sonoro, Desplazable {
    private String nombre;

    public Perro(String nombre) {
        this.nombre = nombre;
    }

    //usamos 'implements', estamos obligados a darle vida a los métodos
    @Override
    public void emitirSonido() {
        System.out.println(nombre + " dice: ¡Guau, Guau!");
    }

    @Override
    public void desplazarse() {
        System.out.println(nombre + " corre usando sus 4 patas.");
    }
}

// El Ave implementa las TRES interfaces porque sí puede hacer las tres cosas
class Ave implements Sonoro, Desplazable, Volador {
    private String nombre;

    public Ave(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void emitirSonido() {
        System.out.println(nombre + " canta de forma melodiosa.");
    }

    @Override
    public void desplazarse() {
        System.out.println(nombre + " camina dando saltitos.");
    }

    @Override
    public void volar() {
        System.out.println(nombre + " abre sus alas y vuela por el cielo.");
    }
}

// El Gato implementa Sonoro y Desplazable
class Gato implements Sonoro, Desplazable {
    private String nombre;

    public Gato(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void emitirSonido() {
        System.out.println(nombre + " dice: ¡Miau, Miau!");
    }

    @Override
    public void desplazarse() {
        System.out.println(nombre + " camina de forma sigilosa.");
    }
}

// La Vaca implementa Sonoro y Desplazable
class Vaca implements Sonoro, Desplazable {
    private String nombre;

    public Vaca(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void emitirSonido() {
        System.out.println(nombre + " dice: ¡Muuu, Muuu!");
    }

    @Override
    public void desplazarse() {
        System.out.println(nombre + " camina despacio por el pasto.");
    }
}

// 3. CLASE PRINCIPAL
public class PruebaInterfaces {
    public static void main(String[] args) {
        System.out.println("--- PROBANDO COMPORTAMIENTOS CON INTERFACES ---");

        Perro miPerro = new Perro("Firulais");
        Ave miAve = new Ave("Piolín");
        Gato miGato = new Gato("Michi");
        Vaca miVaca = new Vaca("Lola");

        // Ejecutamos las habilidades del perro
        miPerro.emitirSonido();
        miPerro.desplazarse();

        System.out.println("----------------------------------------------");

        // Ejecutamos las habilidades del gato
        miGato.emitirSonido();
        miGato.desplazarse();

        System.out.println("----------------------------------------------");

        // Ejecutamos las habilidades de la vaca
        miVaca.emitirSonido();
        miVaca.desplazarse();

        System.out.println("----------------------------------------------");

        // Ejecutamos las habilidades del ave
        miAve.emitirSonido();
        miAve.desplazarse();
        miAve.volar(); // El ave sí vuela
    }
}
