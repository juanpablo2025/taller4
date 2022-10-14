/*
 *1. ELABORAR UN ALGORITMO QUE LE PERMITA AL USUARIO LEER 3 NÚMERO Y EL COMPUTADOR LE IMPRIMA EL MENOR DE ELLOS.

2. CREAR UN ALGORITMO QUE LE PERMITA AL USUARIO INGRESAR EL NOMBRE DE UN ESTUDIANTE Y LAS 4 NOTAS QUE OBTUVO EN UNA MATERIA Y EL COMPUTADOR LE IMPRIMA EL NOMBRE, 
LA NOTA DEFINITIVA Y UN MENSAJE QUE LE INDIQUE SI “GANA“, “HABILITA” O “PIERDE” .

3. CREAR UN ALGORITMO QUE LE PERMITA AL USUARIO INGRESAR 3 NÚMEROS Y EL COMPUTADOR SE LOS MUESTRE EN ORDEN ASCENDENTE

4. Se necesita un programa que diga si una persona es apta para un equipo de baloncesto o no, para que sea apto debe cumplir 
que si es hombre sea mayor de edad, que mida mas de 1.70 mts., que pese menos de 75 kg., o si es mujer que tenga más de 16 años,
que mida como mínimo 1.70 y que pese como máximo 60 kg. Se debe leer el nombre, el sexo (F = femenino, M = masculino), la edad, la estatura y el peso.

5. LABORAR UN PROGRAMA QUE LE PERMITA A UN USUARIO INGRESAR EL NOMBRE DE UN TRABAJADOR, Y EL NÚMERO DE HORAS TRABAJADAS, SE PIDE QUE EL PROGRAMA LE IMPRIMA
EL SALARIO BRUTO, LAS BONIFICACIONES, LAS DEDUCCIONES Y EL SALARIO NETO; TENIENDO EN CUENTA QUE LAS BONIFICACIONES SERÁN DE $20.000.OO SI TRABAJÓ COMO MÁXIMO 48 HORAS,
DE $50.000.OO SI TRABAJO ENTRE 49 Y 58 HORAS Y DE $100.000 SI TRABAJÓ MÁS DE 58 HORAS. LAS DEDUCCIONES SON DE $10.000 SI EL SALARIO BÁSICO HORA ES MENOR DE $5.000.OO, DE $20.000.OO
SI EL SALARIO BÁSICO HORA ES MAYOR DE $5.000.OO Y MENOR DE $8.000.OO Y DE $ 50.000.OO SI SU SALARIO BÁSICO HORA ES DE $8.000.OO O MAS.

6. PARA LA MATERIA DE DESTREZAS SE DETERMINÓ CON LOS ESTUDIANTES QUE, SI LA NOTA DEL PRIMER QUIZ ERA MENOR QUE LA DEL SEGUNDO, SE SUSTITUÍA LA PRIMERA NOTA POR LA SEGUNDA. 
ELABORE UN ALGORITMO QUE LE PERMITA AL PROFESOR INGRESAR LAS 4 NOTAS QUE OBTUVO UN ALUMNO Y EL COMPUTADOR LE MUESTRE LA NOTA DEFINITIVA Y LA CALIFICACIÓN CUALITATIVA QUE ES: 
“E” SI ES MAYOR O IGUAL A 4.5, “S” SI ES MAYOR O IGUAL A 4.0 Y MENOR DE 4.5, “B” SI ES MAYOR O IGUAL A 3.5 Y MENOR DE 4.0, “A” SI ES MAYOR O IGUAL A 3.0 Y MENOR DE 3.5, “D” SI ES MAYOR O IGUAL A 2.0 
Y MENOR DE 3.0 E “I” SI ES MENOR DE 2.0
 */

import java.util.Scanner;

/**
 *
 * @author FX6300
 * 
 */
public class taller4 {

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
					+ "ELABORAR UN ALGORITMO QUE LE PERMITA AL USUARIO LEER 3 NÚMERO Y EL COMPUTADOR LE IMPRIMA EL MENOR DE ELLOS.");

			

			Scanner a = new Scanner(System.in);
			System.out.println("\n Ingresa un numero");
			int numero1 = a.nextInt();

			Scanner b = new Scanner(System.in);
			System.out.println("\n ingresa el segundo numero ");
			int numero2 = b.nextInt();

			Scanner c = new Scanner(System.in);
			System.out.println("\n ingresa el tercer numero");
			int numero3 = c.nextInt();

			if ((numero1 > numero3) && (numero1 > numero2)) {
				System.out.print("\n El numero mayor es " + numero1 +"\n\n");
				
			}
			if ((numero2 > numero1 )&& (numero2 > numero3) ) {
				System.out.print("\n El numero mayor es " + numero2 +"\n\n");
				
			}
			 else {
				System.out.print("\n El numero mayor es " + numero3 +"\n\n");
			}

			taller4.main(null);

		}

		if (i == 2) {
			System.out.print(i + ") "
					+ "CREAR UN ALGORITMO QUE LE PERMITA AL USUARIO INGRESAR EL NOMBRE DE UN ESTUDIANTE Y LAS 4 NOTAS QUE OBTUVO EN UNA MATERIA Y EL COMPUTADOR LE IMPRIMA EL NOMBRE,LA NOTA DEFINITIVA Y UN MENSAJE QUE LE INDIQUE SI “GANA“, “HABILITA” O “PIERDE” .");

			Scanner a = new Scanner(System.in);
			System.out.println("\n Ingresa el nombre del estudiante");
			String nestu = a.next();

			Scanner b = new Scanner(System.in);
			System.out.println("\n ingresa la nota 1");
			double nota1 = b.nextDouble();

			Scanner c = new Scanner(System.in);
			System.out.println("\n ingresa la nota 2");
			double nota2 = c.nextDouble();

			Scanner d = new Scanner(System.in);
			System.out.println("\n ingresa la nota 3");
			double nota3 = d.nextDouble();
                        
                        Scanner e = new Scanner(System.in);
			System.out.println("\n ingresa la nota 4");
			double nota4 = e.nextDouble();

			double total= (nota1+nota2+nota3+nota4)/4;



			if (total >= 3.0) {
				System.out.print("\n Nombre:" +nestu+ "nota : " +total+" Gana "+ "\n \n");
			}
			if(total < 2.9 && total >= 2.0) 
                        {
				System.out.print("\n Nombre:" +nestu+ "nota : " +total+" Habilita "+ "\n \n");
			}
                        else if(total<1.9){
				System.out.print("\n Nombre:" +nestu+ "nota : " +total+" Pierde "+ "\n \n");
			}

			
			taller4.main(null);

		}
		if (i == 3) {
			System.out.print(i + ") "
					+ "CREAR UN ALGORITMO QUE LE PERMITA AL USUARIO INGRESAR 3 NÚMEROS Y EL COMPUTADOR SE LOS MUESTRE EN ORDEN ASCENDENTE");

			Scanner a = new Scanner(System.in);
			System.out.println("\n Ingresa un numero");
			int numero1 = a.nextInt();

			Scanner b = new Scanner(System.in);
			System.out.println("\n ingresa el segundo numero ");
			int numero2 = b.nextInt();

			Scanner c = new Scanner(System.in);
			System.out.println("\n ingresa el tercer numero");
			int numero3 = c.nextInt();

			if (numero1 > numero2) {
				System.out.print("\n e" + "");
				System.out.print("\n :" + "" + "\n \n");
			} else {
				System.out.print("\n " + "");
				System.out.print("\n " + "" + "\n \n");
			}

			taller4.main(null);

		}
                if (i == 4) {
			System.out.print(i + ") "
					+ "");

			Scanner a = new Scanner(System.in);
			System.out.println("\n ");
			String he = a.next();

			Scanner aa = new Scanner(System.in);
			System.out.println("\n ");
			int e = aa.nextInt();

			Scanner b = new Scanner(System.in);
			System.out.println("\n ");
			String her = b.next();

			Scanner bb = new Scanner(System.in);
			System.out.println("\n ");
			int ed = bb.nextInt();

			if (e > ed) {
				System.out.print("\n e" + "");
				System.out.print("\n :" + "" + "\n \n");
			} else {
				System.out.print("\n " + "");
				System.out.print("\n " + "" + "\n \n");
			}

			taller4.main(null);

		}
                if (i == 5) {
			System.out.print(i + ") "
					+ "");

			Scanner a = new Scanner(System.in);
			System.out.println("\n ");
			String he = a.next();

			Scanner aa = new Scanner(System.in);
			System.out.println("\n ");
			int e = aa.nextInt();

			Scanner b = new Scanner(System.in);
			System.out.println("\n ");
			String her = b.next();

			Scanner bb = new Scanner(System.in);
			System.out.println("\n ");
			int ed = bb.nextInt();

			if (e > ed) {
				System.out.print("\n e" + "");
				System.out.print("\n :" + "" + "\n \n");
			} else {
				System.out.print("\n " + "");
				System.out.print("\n " + "" + "\n \n");
			}

			taller4.main(null);

		}
                if (i == 6) {
			System.out.print(i + ") "
					+ "");

			Scanner a = new Scanner(System.in);
			System.out.println("\n ");
			String he = a.next();

			Scanner aa = new Scanner(System.in);
			System.out.println("\n ");
			int e = aa.nextInt();

			Scanner b = new Scanner(System.in);
			System.out.println("\n ");
			String her = b.next();

			Scanner bb = new Scanner(System.in);
			System.out.println("\n ");
			int ed = bb.nextInt();

			if (e > ed) {
				System.out.print("\n e" + "");
				System.out.print("\n :" + "" + "\n \n");
			} else {
				System.out.print("\n " + "");
				System.out.print("\n " + "" + "\n \n");
			}

			taller4.main(null);

		}
                 if (i == 0) {
            System.out.print("Cerrando...");
            System.exit(0);
        }
                
                
                
	}
}
