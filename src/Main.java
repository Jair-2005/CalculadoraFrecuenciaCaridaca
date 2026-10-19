import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Primer nombre: ");
        String nombre = entrada.nextLine();
        System.out.print("Apellido: ");
        String apellido = entrada.nextLine();
        System.out.print("Mes de nacimiento: ");
        int mes = entrada.nextInt();
        System.out.print("Día de nacimiento: ");
        int dia = entrada.nextInt();
        System.out.print("Año de nacimiento: ");
        int año = entrada.nextInt();

        FrecuenciasCardiacas persona = new FrecuenciasCardiacas(nombre, apellido, mes, dia, año);

        System.out.println("\n Datos de la persona ");
        System.out.printf("Nombre: %s %s%n", persona.getNombre(), persona.getApellido());
        System.out.printf("Fecha de nacimiento: %d/%d/%d%n", persona.getDia(), persona.getMes(), persona.getAño());

        System.out.println("\n Resultados ");
        System.out.printf("Edad: %d años%n", persona.calcularEdad());
        System.out.printf("Frecuencia cardíaca máxima: %d ppm%n", persona.calcularFrecuenciaMaxima());
        System.out.printf("Frecuencia cardíaca esperada: %.1f - %.1f ppm%n",
                persona.calcularFrecuenciaEsperadaMinima(), persona.calcularFrecuenciaEsperadaMaxima());

        entrada.close();
    }
}