public class Calculator {
    
    public int add(int a, int b) {
        

        return a + b;
    }
    public int requirement1_withoutparameter(int a, int... arg){
        int count = 1;
        for(int i: arg){
            count ++;

        }
        return count;
    }
    /*
    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }
    
    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a / b;
    }
    */
}
