package ss5_access_modifier_statisc_method_property.bai_tap;

public class Student {

    private String name = "join";
    private String classes = "C02";

    public Student(){

    }

    public String getName() {
        return name;
    }

    public String getClasses() {
        return classes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

}
