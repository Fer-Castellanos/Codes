package ExampleCompatorvsComparable;

import java.util.ArrayList;
import java.util.Collections;

public class StudentApplication {

    public static void main(String [] args) {
        ArrayList<Student> listaStudent = new ArrayList<Student>();
        listaStudent.add(new Student(18, "Maria Carranza Espinoza", 1));
        listaStudent.add(new Student(24, "Carla Guzman Trujillo", 2));
        listaStudent.add(new Student(33, "Jovana Cisneros Games", 3));
        listaStudent.add(new Student(35, "Patricia Ruiz Castillo", 4));
        listaStudent.add(new Student(40, "Carlos Jimenez Torres", 5));

        Collections.sort(listaStudent); // Ejemplo uso ordenación natural
        System.out.println("Estudiantes Ordenados por orden natural: " + listaStudent);

    }

}

