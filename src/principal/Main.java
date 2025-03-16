package principal;

import java.util.Scanner;

public class Main {
    public static void  main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite su nombre: ");
        String nombreEmpleado = scanner.nextLine();

        System.out.print("Digite su edad: ");
        byte edadEmpleado = scanner.nextByte();

        System.out.print("Digite su salario: ");
        long salarioEmpleado = scanner.nextLong();

        System.out.print("¿Es jefe de departamento? (s/n): ");
        char esJefeDepartamento = scanner.next().charAt(0);

        boolean jefeDepartamento = Character.toLowerCase(esJefeDepartamento) != 'n';

        System.out.println("Nombre empelado: " + nombreEmpleado);
        System.out.println("Nombre edad: " + edadEmpleado);
        System.out.println("Nombre salario: " + salarioEmpleado);
        System.out.println("Nombre jefe de departamento: " + jefeDepartamento);
    }
}
