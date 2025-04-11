package solid_principle;

public class OpenClosePrinciple2 implements OpenClosable {

    @Override
    public Integer add(Integer a, Integer b) {
        return a + b;
    }


    @Override
    public Integer divide(Integer a, Integer b) {
        if (b == 0) {
            throw new ArithmeticException("Divide by zero");
        }
        return a / b;
    }
}
