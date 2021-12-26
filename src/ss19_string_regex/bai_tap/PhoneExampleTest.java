package ss19_string_regex.bai_tap;

public class PhoneExampleTest {
    private static PhoneExample phoneExample;
    public static final String[] validPhone = new String[] {"(84)-(0942260399)"};
    public static final String[] invalidPhone = new String[] {"(a8)-(0101010101)"};
    public static void main(String args[]) {
        phoneExample = new PhoneExample();
        for (String phone : validPhone) {
            boolean isvalid = phoneExample.validate(phone);
            System.out.println("Phone is " + phone  +" is valid: "+ isvalid);
        }
        for (String phone : invalidPhone) {
            boolean isvalid = phoneExample.validate(phone);
            System.out.println("Email is " + phone +" is valid: "+ isvalid);
        }
    }
}