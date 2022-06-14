package ss5_access_modifier_statisc_method_property.thuc_hanh;

public class TestStaticMethod {
    public static void main(String[] args) {


        Student student1 = new Student(11,"Trọng");
        Student student2 = new Student(12, "Bảo");
        Student student3 = new Student(13,"Thanh");
        Student student4 = new Student(14,"Vinh");

        student1.display();
        student2.display();
        student3.display();
        student4.display();

        Student.change();

        student1.display();
        student2.display();
        student3.display();
        student4.display();
    }
}
