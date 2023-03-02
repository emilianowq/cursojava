import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner ingresos = new Scanner(System.in);
        System.out.println("Ingrese el total de los ingresos mensuales del hogar: ");
        float ingresosMensuales = ingresos.nextFloat();
        System.out.println("el total de ingresos del hogar es: " + ingresosMensuales);

        Scanner cantVehiculos = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de vehiculos con una antiguedad menor a 5 años que posee: ");
        int cantidadVehiculos = cantVehiculos.nextInt();
        System.out.println("la cantidad de vehiculos con una antiguedad menor a 5 años que posee es: " + cantidadVehiculos);

        Scanner cantInmuebles = new Scanner(System.in);
        System.out.println("ingrese la cantidad de inmuebles que posee: ");
        int cantidadInmuebles = cantInmuebles.nextInt();
        System.out.println("la cantidad de inmuebles que posee es: " + cantidadInmuebles);

        Scanner Preg = new Scanner(System.in);
        System.out.println("Posee una embarcacion, aeronave de lujo, o es titular de activos societarios?: Si o No");
        char pregunta = Preg.next().charAt(0);
        System.out.println("su respuesta es: " + pregunta);


        if (ingresosMensuales >= 489083 || cantidadVehiculos >= 3 || cantidadInmuebles >= 3 || pregunta == 's') {
            System.out.println("Usted pertenece al segmento de ingresos altos");
        }
        else {
            System.out.println("usted no pertenece al segmento de ingresos altos");
        }
    }
}