package PreReto;

import java.util.Scanner;

public class Lista {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	
	String[]asignaturas = {"Redes", "DataBase", "Programacion"};
	String[]alumnos = new String[5]; //0 al 4 identifica a cada alumno 
   	double[][] notas = new double[5][3];// 5 alumnos, 3 asignaturas
   	
for(int i = 0; i < 5; i++) {//posicion por posiion del alunmo
	//Pedimos el nombre del alumno
	alumnos[i] = teclado.nextLine();
	for(int j = 0; j < 3 ; j++) { 
		// Pide la nota de la asignatura j para el alumno i
		notas[i] [j] = teclado.nextDouble();
		
	}
	teclado.nextLine();
}


int[] suspensosPorAlumno = new int[5]; // Array acumulador para el informe total posterior

for (int i = 0; i < 5; i++) {
    // Variables locales inicializadas al inicio de CADA alumno
    double suma = 0;
    double maxNota = notas[i][0]; // Asumimos inicialmente que la primera nota es la mayor
    double minNota = notas[i][0]; // Asumimos inicialmente que la primera nota es la menor
    String asigMax = asignaturas[0];
    String asigMin = asignaturas[0];
    String asigSuspensas = "";

    for (int j = 0; j < 3; j++) {
        double notaActual = notas[i][j];
        suma += notaActual;

        // Detectar suspensos (< 5.0)
        if (notaActual < 5.0) {
            suspensosPorAlumno[i]++; // Contabiliza el suspenso del alumno i
            asigSuspensas += asignaturas[j] + " (" + notaActual + ") "; // Concatena el nombre de la asignatura suspensa
        }

        // Búsqueda del máximo
        if (notaActual > maxNota) {
            maxNota = notaActual;
            asigMax = asignaturas[j];
        }

        // Búsqueda del mínimo
        if (notaActual < minNota) {
            minNota = notaActual;
            asigMin = asignaturas[j];
        }
    }

    // Cálculos de salida por alumno
    System.out.printf(" - Media: %.2f\n", (suma / 3.0));
    System.out.println(" - Suspensos (" + suspensosPorAlumno[i] + "): " + (suspensosPorAlumno[i] == 0 ? "Ninguno" : asigSuspensas));
    
}

int[] suspensosPorAsignatura = new int[3];

for (int j = 0; j < 3; j++) { // El bucle exterior fija la ASIGNATURA (columna)
    double suma = 0;
    double maxNota = notas[0][j];
    double minNota = notas[0][j];
    String alumnoMax = alumnos[0];
    String alumnoMin = alumnos[0];

    for (int i = 0; i < 5; i++) { // El bucle interior recorre todos los ALUMNOS (filas)
        double notaActual = notas[i][j];
        suma += notaActual;

        if (notaActual < 5.0) {
            suspensosPorAsignatura[j]++;
        }

        if (notaActual > maxNota) {
            maxNota = notaActual;
            alumnoMax = alumnos[i];
        }

        if (notaActual < minNota) {
            minNota = notaActual;
            alumnoMin = alumnos[i];
        }
    }

    System.out.printf(" - Media: %.2f\n", (suma / 5.0)); // Se divide por 5 (número de alumnos)
    
}
	}

}
