import Mathslib.ServiceFactory;
import Mathslib.mathService;

public class Hello {
    public static void main(String []args)
    {

        mathService ms=ServiceFactory.getMathService("add");
        System.out.println(ms.operate(29,48));
    }
}
