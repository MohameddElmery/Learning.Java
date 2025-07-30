package all;

public class ExceptionHierarchyDemo
{
    public static void main(String[] args) {
        // Example exception object
        ArithmeticException ae = new ArithmeticException();

        // Print its class hierarchy
        Class<?> clazz = ae.getClass();
        while (clazz != null) {
            System.out.println(clazz.getName());
            clazz = clazz.getSuperclass();
        }
    }
}
