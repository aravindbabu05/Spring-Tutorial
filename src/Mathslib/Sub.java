package Mathslib;

public class Sub implements mathService{
    @Override
    public int operate(int a, int b) {
        return a>b?a-b:b-a;
    }
}
