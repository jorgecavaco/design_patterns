package workshop.singleton;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        Singleton.getInstance().getDbConnection();
    }
}
