package ss19_string_regex.bai_tap;

public class ClassExampleTest {
    private static ClassExample classExample;
    public static final String[] validClass = new String[] {"A1111A","A2222A","A3333A"};
    public static final String[] invalidClass= new String[] {"B1111B","B2222B","B3333B"};

    public static void main(String[] args) {
        classExample = new ClassExample();
        for (String classname:validClass) {
            boolean isvalid = classExample.validate(classname);
            System.out.println("Class is " + classname+" is valid "+isvalid);
        }
        for (String classname:invalidClass){
            boolean isvalid = classExample.validate(classname);
            System.out.println("Email is "+ classname+" is valid"+ isvalid);
        }
    }

}
