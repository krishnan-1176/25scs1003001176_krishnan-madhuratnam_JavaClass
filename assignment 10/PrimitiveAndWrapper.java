// Assignment 10 - Program 1
// Primitive variables and their Wrapper Class variables
// Roll No: 25SCS1003001176
public class PrimitiveAndWrapper {
    public static void main(String[] args) {
        byte byteValue = 12;
        short shortValue = 240;
        int intValue = 1500;
        long longValue = 987654321L;
        float floatValue = 18.75f;
        double doubleValue = 256.48;
        char charValue = 'K';
        boolean booleanValue = true;

        Byte byteObject = byteValue;
        Short shortObject = shortValue;
        Integer intObject = intValue;
        Long longObject = longValue;
        Float floatObject = floatValue;
        Double doubleObject = doubleValue;
        Character charObject = charValue;
        Boolean booleanObject = booleanValue;

        System.out.println("Primitive and Wrapper Class values");
        System.out.println("----------------------------------");
        System.out.println("byte      : " + byteValue + "    | Byte      : " + byteObject);
        System.out.println("short     : " + shortValue + "   | Short     : " + shortObject);
        System.out.println("int       : " + intValue + "  | Integer   : " + intObject);
        System.out.println("long      : " + longValue + " | Long      : " + longObject);
        System.out.println("float     : " + floatValue + "  | Float     : " + floatObject);
        System.out.println("double    : " + doubleValue + "  | Double    : " + doubleObject);
        System.out.println("char      : " + charValue + "      | Character : " + charObject);
        System.out.println("boolean   : " + booleanValue + "  | Boolean   : " + booleanObject);
    }
}
