package Mathslib;

public class ServiceFactory {
    public static mathService getMathService(String operand){

        if(operand.equalsIgnoreCase("add"))
        {
            return new Add();
        }
        else if(operand.equalsIgnoreCase("sub"))
        {
            return new Sub();
        }
        else if(operand.equalsIgnoreCase("div")){
            return new Div();
        }
        else if(operand.equalsIgnoreCase("mul")){
            return new Mul();
        }
        else
        {
            throw new RuntimeException("Not found any service for : "+operand);
        }
    }
}
