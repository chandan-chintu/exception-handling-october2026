package exception.handled.example;

public class ThrowExample {
    public static void main(String[] args) {
        try {
            int age = 14;
            if (age >= 18) {
                System.out.println("Age is valid to vote");
            } else {
                throw new RuntimeException("Age is not valid to vote");
            }
        } catch (Exception e){
            System.out.println("Exception occurred : "+e.getMessage()+"---"+e.getClass());
        }
    }
}
