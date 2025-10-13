import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args)  {

        ExceptionClass exceptionClass = new ExceptionClass();
        exceptionClass.unCheckedException(null, "1234");
        exceptionClass.arithmaticException();


    }

}