import static java.lang.System.currentTimeMillis;
import static java.lang.System.getenv;

public class SystemFeauters {
    public static void main(String[] args) {
        System.out.println(currentTimeMillis());
        //System.exit(0);//немедленная остановка программы
        System.out.println(getenv("JAVA_HOME"));
    }
}
