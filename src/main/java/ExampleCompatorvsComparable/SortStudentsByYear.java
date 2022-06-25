package ExampleCompatorvsComparable;

import java.util.Comparator;

public class SortStudentsByYear implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getIdYears() - o2.getIdYears(); // Devuelve un entero positivo si la altura de o1 es mayor que la de o2;
    }
}
