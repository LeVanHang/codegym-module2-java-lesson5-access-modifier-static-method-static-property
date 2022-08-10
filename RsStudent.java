public class RsStudent {
    private int rollno;
    private String name;
    private static String college = "BBDIT";

    public RsStudent(int rollno, String name) {
   this.rollno = rollno;
    this.name = name ;
    }
    static void change(){
       college = "CODEGYM";
    }
    void display(){
        System.out.println(rollno + " " + name + " " + " " + college);
    }

//    @Override
//    public String toString() {
//        return super.toString();
//    }

    public static void main(String[] args) {
        RsStudent.change();
        RsStudent s1 = new RsStudent(111,"Hang");
        RsStudent s2 = new RsStudent(222, "Phong");
        RsStudent s3= new RsStudent(333, "Huy");

        s1.display();
        s2.display();
        s3.display();
    }
}
