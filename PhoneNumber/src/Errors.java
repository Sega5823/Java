import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Errors {

    public static void main(String[] args) {

        ErrorHandler errorHandler = new ErrorHandler();
        try {
            openfile(errorHandler);
        } catch (IOException e) {
//            e.printStackTrace();
//            if (errorHandler.errorCode == -1) {
                System.out.println("Unable");

        }
        System.out.println("End of Program");
    }
    public static void openfile(ErrorHandler errorHandler) throws IOException{
        // openfile
        String str = null;
        System.out.println(str.getBytes(StandardCharsets.UTF_8));
        //throw new IOException();
        // errorHandler.errorCode = -1;
    }
}



class ErrorHandler{
    int errorCode;
}
