package ExampleCompatorvsComparable;

public class Student implements Comparable<Student>{

    private String name;
    private int years;
    private int courses;

    public Student(int years, String name, int courses) {

        this.years = years;
        this.name = name;
        this.courses = courses;
    }

    @Override
    public String toString(){
        return "Student-> Name:"+name+" Years:"+years+" Courses:"+courses;

    }
    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);

    }

    public int getIdYears() {
        return years;
    }
    public String getName() {
    return name;}

    public int getCourses() {
        return courses;
    }

}
