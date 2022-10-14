/*
 * 1. Elabore un algoritmo que permita averiguar cuál es el nombre del mayor de
 * 2 hermanos no gemelos. Como datos de entrada se tiene el nombre y la edad de
 * las 2 personas.
 * 
 * 2. Elabore un algoritmo que lea el nombre, el salario bruto, las deducciones
 * y las bonificaciones de dos trabajadores, e imprima el nombre del que más
 * salario neto tiene.
 * 
 * 3. Crear un algoritmo que le permita al usuario ingresar los datos de dos
 * buses así: Placa, El número de pasajeros transportado y el valor del pasaje,
 * y el computador le muestre la placa del bus que más dinero recogió.
 * 
 * 4. Elaborar un algoritmo donde el usuario ingrese la placa de un bus, el
 * número de pasajeros transportados y la ruta donde prestó el servicio ( A o B)
 * el computador le debe mostrar el dinero que recolectó sabiendo que en la ruta
 * A el pasaje es a $1.200.oo y en la B a $1.000.oo
 * 
 * 5. Crear un algoritmo que le permita al usuario ingresar el tipo de
 * trabajador (FIJO o TEMPORAL) y con base en esto pueda imprimir el nombre y el
 * salario neto, sabiendo que si es FIJO debe leer el nombre, el número de horas
 * trabajadas, el salario básico hora,
 * el total de deducciones y el total de bonificaciones y si es TEMPORAL solo
 * debe leer el nombre y el número de horas trabajadas; estos trabajadores
 * tienen un salario básico hora fijo de $6.000.oo y no tienen deducciones ni
 * bonificaciones.
 */

import java.util.Scanner;

/**
 *
 * @author FX6300
 * 
 */
public class taller3 {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		/*------------------------------------Menu-------------------------------------------------------------
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Digita un número del taller o digita 0(cero)para salir");
		int i = sc.nextInt();
		/*------------------------------------Menu-------------------------------------------------------------
		 */
		/*------------------------------------1)punto------------------------------------------------------------
		 */
		if (i == 1) {
			System.out.print(i + ") "
					+ "Elabore un algoritmo que permita averiguar cuál es el nombre del mayor de 2 hermanos no gemelos. Como datos de entrada se tiene el nombre y la edad de las 2 personas.");

			Scanner a = new Scanner(System.in);
			System.out.println("\n Digita nombre hermano 1");
			String he = a.next();

			Scanner aa = new Scanner(System.in);
			System.out.println("\n Digita la edad");
			int e = aa.nextInt();

			Scanner b = new Scanner(System.in);
			System.out.println("\n Digita nombre hermano 2");
			String her = b.next();

			Scanner bb = new Scanner(System.in);
			System.out.println("\n Digita la edad");
			int ed = bb.nextInt();

			if (e > ed) {
				System.out.print("\n el hermano mayor es " + he);
				System.out.print("\n edad:" + e + "\n \n");
			} else {
				System.out.print("\n el hermano mayor es :" + her);
				System.out.print("\n edad:" + ed + "\n \n");
			}

			taller3.main(null);

		}

		if (i == 2) {
			System.out.print(i + ") "
					+ "Elabore un algoritmo que lea el nombre, el salario bruto, las deducciones y las bonificaciones de dos trabajadores, e imprima el nombre del que más salario neto tiene.");

			Scanner a = new Scanner(System.in);
			System.out.println("\n Digita el nombre 1");
			String e = a.next();

			Scanner aa = new Scanner(System.in);
			System.out.println("\n Digita el salario");
			int ee = aa.nextInt();

			Scanner aaa = new Scanner(System.in);
			System.out.println("\n Digita las deducciones");
			int eee = aaa.nextInt();

			Scanner aaaa = new Scanner(System.in);
			System.out.println("\n Digita las bonificaciones");
			int eeee = aaaa.nextInt();

			Scanner b = new Scanner(System.in);
			System.out.println("\n Digita el nombre 2");
			String o = b.next();

			Scanner bb = new Scanner(System.in);
			System.out.println("\n Digita el salario");
			int oo = bb.nextInt();

			Scanner bbb = new Scanner(System.in);
			System.out.println("\n Digita las deducciones");
			int ooo = bbb.nextInt();

			Scanner bbbb = new Scanner(System.in);
			System.out.println("\n Digita las bonificaciones");
			int oooo = bbbb.nextInt();

			int total1 = (ee - eee + eeee);
			int total2 = (oo - ooo + oooo);

			if (total1 > total2) {
				System.out.print("\n el salario mayor es de " + e + " con " + total1 + "\n\n");

			} else {
				System.out.print("\n el salario mayor es de " + o + " con " + total2 + "\n\n");

			}

			taller3.main(null);
		}
		if (i == 3) {
			System.out.print(i + ") "
					+ "Crear un algoritmo que le permita al usuario ingresar los datos de dos buses así: Placa, El número de pasajeros transportado y el valor del pasaje,y el computador le muestre la placa del bus que más dinero recogió.");
			Scanner a = new Scanner(System.in);
			System.out.println("\n Digita la placa del bus 1");
			String e = a.next();

			Scanner aa = new Scanner(System.in);
			System.out.println("\n Digita el numero de pasajeros");
			int ee = aa.nextInt();

			Scanner aaa = new Scanner(System.in);
			System.out.println("\n Digita el valor del pasaje");
			int eee = aaa.nextInt();

			Scanner b = new Scanner(System.in);
			System.out.println("\n Digita la placa dele bus 2 ");
			String o = b.next();

			Scanner bb = new Scanner(System.in);
			System.out.println("\n Digita el numero de pasajeros");
			int oo = bb.nextInt();

			Scanner bbb = new Scanner(System.in);
			System.out.println("\n Digita el valor del pasaje");
			int ooo = bbb.nextInt();

			int total1 = oo * ooo;
			int total2 = ee * eee;

			if (ooo > eee) {
				System.out.print("\n el dinero realizado es " + total1 + " del bus: " + o + "\n\n");

			} else {
				System.out.print("\n el dinero realizado es " + total2 + " del bus: " + e + "\n\n");

			}

			taller3.main(null);
		}
                if (i == 4) {
			System.out.print(i + ") "
					+ "Elaborar un algoritmo donde el usuario ingrese la placa de un bus,número de pasajeros transportados y la ruta donde prestó el servicio ( A o B)\n el computador le debe mostrar el dinero que recolectó sabiendo que en la ruta\n A el pasaje es a $1.200.oo y en la B a $1.000.oo");
			Scanner a = new Scanner(System.in);
			System.out.println("\n Digita la placa del bus 1");
			String e = a.next();

			Scanner aa = new Scanner(System.in);
			System.out.println("\n Digita el numero de pasajeros");
			int ee = aa.nextInt();

			Scanner aaa = new Scanner(System.in);
			System.out.println("\n Digita el tipo de ruta ");
			String eee = aaa.next();

			Scanner b = new Scanner(System.in);
			System.out.println("\n Digita la placa dele bus 2 ");
			String o = b.next();

			Scanner bb = new Scanner(System.in);
			System.out.println("\n Digita el numero de pasajeros");
			int oo = bb.nextInt();

			Scanner bbb = new Scanner(System.in);
			System.out.println("\n Digita el tipo de ruta");
			String ooo = bbb.next();
                        
                        int  pasaje1= 1200;
                        int  pasaje2= 2000;
                        
                        int total1=pasaje1*ee;
                        int total2=pasaje2*oo;
                        

	 		

			if(eee.equals("A")) {
				System.out.print("\n realizado " + total1 +" del bus: " + o + "\n\n");

			} 
                        
                        if(ooo.equals("B")) {
				System.out.print("\n bbbbb es " + total2 + " del bus: " + o + "\n\n");

			} 
                                
                        else {
				System.out.print("\n  Digita A o B  \n\n");

			}

			taller3.main(null);
		}
                
                
	}
}
