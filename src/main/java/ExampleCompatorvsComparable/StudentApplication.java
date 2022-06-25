package ExampleCompatorvsComparable;

import java.util.ArrayList;
import java.util.Collections;

public class StudentApplication {

    public static void main(String [] args) {
        ArrayList<Student> listaStudent = new ArrayList<Student>();
        listaStudent.add(new Student(18, "Maria Carranza Espinoza", 18));
        listaStudent.add(new Student(24, "Carla Guzman Trujillo", 15));
        listaStudent.add(new Student(33, "Jovana Cisneros Games", 17));
        listaStudent.add(new Student(35, "Patricia Ruiz Castillo", 13));
        listaStudent.add(new Student(40, "Carlos Jimenez Torres", 20));

        Collections.sort(listaStudent); // Ejemplo uso ordenación natural
        System.out.println("Estudiantes Ordenados por orden natural: " + listaStudent);

    }

}

