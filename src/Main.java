import clases.*;

public class Main {
    public static void main(String ... args){
        // Instancia de una Clase con un método Constructor vacío creado por defecto
        Libro cleanCode = new Libro();

        // Instancia de una Clase con un método Constructor vacío creado por el Desarrollador
        Persona asimov = new Persona();

        // Instancia de una Clase con un método Constructor que inicia los valores de las propiedades del objeto
        // cada vez que se crea una instancia.
        Silla sillaDeMadera = new Silla();
        System.out.println("La silla de Madera tiene " + sillaDeMadera.numeroDePatas + " patas.");
        System.out.println("¿La silla de Madera tiene respaldo? - " + sillaDeMadera.conRespaldo);

        Silla sillaDeOficina = new Silla();
        System.out.println("La silla de Oficina tiene " + sillaDeOficina.numeroDePatas + " patas.");
        System.out.println("¿La silla de Oficina tiene respaldo? - " + sillaDeOficina.conRespaldo);
        System.out.println();

        // Instancia de una Clase con un método Constructor que acepta parametros
        // y donde el constructor por defecto ha sido reemplazodo
        Computadora dell = new Computadora(8, 512, "DELL");
        System.out.println("La computadora "+ dell.marca +" tiene "+ dell.ram + "GB de RAM, " + dell.rom
                + " de Disco Duro.");

        Computadora hp = new Computadora(16, 1024, "HP");
        System.out.println("La computadora "+ hp.marca +" tiene "+ hp.ram + "GB de RAM, " + hp.rom
                + " de Disco Duro.");
        System.out.println();

        // Instancia de una Clase con un método Constructor vacío, y métodos Constructores
        // sobrecargados.
        Mesa mesaGenerica = new Mesa();
        System.out.println("La Mesa Genérica tiene: " + mesaGenerica.numeroDePatas
                + " patas y es de " + mesaGenerica.material);

        Mesa mesaDePared = new Mesa(2, "Mármol");
        System.out.println("La Mesa de Pared tiene: " + mesaDePared.numeroDePatas
                + " patas y es de " + mesaDePared.material);

        Mesa mesaSofisticada = new Mesa(3);
        System.out.println("La Mesa Sofisticada tiene: " + mesaSofisticada.numeroDePatas
                + " patas y es de " + mesaSofisticada.material);

        Mesa mesaOficina = new Mesa("Plástico");
        System.out.println("La Mesa de Oficina tiene: " + mesaOficina.numeroDePatas
                + " patas y es de " + mesaOficina.material);

        Mesa mesaRedonda = new Mesa("Acrílico",8);
        System.out.println("La Mesa de Redonda tiene: " + mesaRedonda.instanciaDeLaMesa.numeroDePatas
                + " patas y es de " + mesaRedonda.instanciaDeLaMesa.material);
        System.out.println();

        // Instancia de una Clase con un método constructor encadenado (Constructor chaining)
        Vaso vasoParaFiestas = new Vaso();
        System.out.println("El vaso para fiesta tiene una capacidad de " + vasoParaFiestas.capacidad
                + "ml y es de color "+ vasoParaFiestas.color);

        Vaso vasoEntrenador = new Vaso("Azul");
        System.out.println("El vaso entrenador tiene una capacidad de " + vasoEntrenador.capacidad
                + "ml y es de color "+ vasoEntrenador.color);

        Vaso tarro = new Vaso(2000);
        System.out.println("El tarro tiene una capacidad de " + tarro.capacidad
                + "ml y es de color "+ tarro.color);

        Vaso vasoCoctelero = new Vaso(400, "Metálico");
        System.out.println("El vaso para preparar martinis tiene una capacidad de " + vasoCoctelero.capacidad
                + "ml y es de color "+ vasoCoctelero.color);

        // Instancia de una Clase con constructor privado.
        // Es utilizado en el patrón de Diseño Singleton.
        //Llaves misLlaves = new Llaves();
    }
}
