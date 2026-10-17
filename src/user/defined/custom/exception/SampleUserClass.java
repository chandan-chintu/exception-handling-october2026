package user.defined.custom.exception;

public class SampleUserClass {
    public static void main(String[] args) {
        try {
            String user = null; // search user from database
            if (user == null) {
                throw new UserNotFoundException("User is not present!");
            } else {
                System.out.println("User is present");
            }
        } catch (Exception e){
            System.out.println("Exception occurred : "+e.getMessage()+"---"+e.getClass());
        }
    }
}
