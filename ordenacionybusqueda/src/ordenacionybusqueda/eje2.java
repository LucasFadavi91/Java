package ordenacionybusqueda;

import java.util.Scanner;

public class eje2 {

	public static void main(String[] args) {

		try (Scanner entrada = new Scanner(System.in)) {
			String arrayDepart[] = { "Informatica", "Contabilidad", "Recursos Humanos", "Administracion", "Logistica",
					"Desarrollo", "Investigacion", "Direccion" };

			int arrayPresu[] = { 80000, 50000, 40000, 12000, 20000, 30000, 20000, 55000 };

			int i = 0;

//Apartado A: 

			System.out.println("Mostrar los Arrays: ");
			System.out.println();

			mostrarArrayString(arrayDepart);
			System.out.println();
			mostrarArray(arrayPresu);
			System.out.println();

//Apartado B: Directa

			for (i = 0; i < arrayDepart.length - 1; i++)
				for (int j = i + 1; j < arrayDepart.length; j++)

					if (arrayDepart[i].compareToIgnoreCase(arrayDepart[j]) > 0) {

						String aux = arrayDepart[i];
						int auxPres = arrayPresu[i];

						arrayDepart[i] = arrayDepart[j];
						arrayDepart[j] = aux;

						arrayPresu[i] = arrayPresu[j];
						arrayPresu[j] = auxPres;

					}
			System.out.println();
			System.out.println("El Array de departamentos ordenado alfabeticamente es : ");
			System.out.println();

			for (i = 0; i < arrayDepart.length; i++) {

				System.out.print(arrayDepart[i] + " ");
			}
			System.out.println();
			System.out.println();

			System.out.println("El Array de presupuestos es : ");
			System.out.println();

			for (i = 0; i < arrayPresu.length; i++) {

				System.out.print(arrayPresu[i] + " ");
			}
			System.out.println();

//Apartado C: Binaria

			System.out.println("Introduce el nombre del departamento");
			String dpto = entrada.next();

			int limiteSuperior = arrayDepart.length;
			int limiteInferior = 0;
			boolean encontrado = false;
			int posicion = 0;

			while (limiteInferior <= limiteSuperior && !encontrado) {

				int mitad = (limiteSuperior + limiteInferior) / 2;

				if (arrayDepart[mitad].equalsIgnoreCase(dpto)) {

					encontrado = true;
					posicion = mitad;
					break;

				} else if (limiteSuperior == mitad || limiteSuperior == mitad) {
					break;

				} else if (dpto.compareTo(arrayDepart[mitad]) > 0) {
					limiteInferior = mitad;
				} else {
					limiteSuperior = mitad;
				}

			}

			System.out.println();
			System.out.println("El departamento " + dpto + " se ha encontrado en la posicion " + (posicion + 1));

			System.out.println("y el presupuesto es de : " + arrayPresu[posicion] + " precio");

//Apartado D: Mayor presupuesto

			for (i = 0; i < arrayPresu.length - 1; i++)
				for (int j = i + 1; j < arrayPresu.length; j++)

					if (arrayPresu[i] < (arrayPresu[j])) {

						int auxPres = arrayPresu[i];
						String auxDep = arrayDepart[i];

						arrayPresu[i] = arrayPresu[j];
						arrayPresu[j] = auxPres;

						arrayDepart[i] = arrayDepart[j];
						arrayDepart[j] = auxDep;

					}

			System.out.println();
			System.out.println();
			System.out.println("Array ordenado por presupuesto de mayor a menor");

			for (i = 0; i < arrayDepart.length; i++) {

				System.out.print(arrayDepart[i] + " ");
			}
			System.out.println();
			System.out.println();

			System.out.println("El Array de presupuestos es : ");
			System.out.println();

			for (i = 0; i < arrayPresu.length; i++) {

				System.out.print(arrayPresu[i] + " ");
			}
			System.out.println();

			System.out.println("El presupuesto mas alto es : " + arrayPresu[0]);
			System.out.print("y pertenece al departamento de: " + arrayDepart[0]);
		}

	}

	// Metodos Mostrar

	public static void mostrarArray(int array[]) {
		for (int i = 0; i < array.length; i++) {

			System.out.print(array[i] + " ");
		}
	}

	public static void mostrarArrayString(String array[]) {
		for (int i = 0; i < array.length; i++) {

			System.out.print(array[i] + " ");
		}
	}

}// Cierre