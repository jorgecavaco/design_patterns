public class Main {

    public static void main(String... args){

        User user = User.Builder.aUser()
                .withName("Jorge")
                .withAge(23).build();


        System.out.println(user.toString());
    }
}
