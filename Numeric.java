public class Numeric<T extends Number>{

    private T value;
    public Numeric(T value){
        this.value = value;
    }

    public double reciprocal(){
        return 1.0 / value.doubleValue();
    }

    public double fractionalpart(){
        double val = value.doubleValue();
        return val - Math.floor(val);
    }
    public static <T extends Number, U extends Number> boolean compareAbsolute(T a, U b) {
        return Math.abs(a.doubleValue()) == Math.abs(b.doubleValue());
    }

    public static void main(String[] args){
        Numeric<Double> num1 = new Numeric<>(9.76);
        Numeric<Integer> num2 = new Numeric<>(-5);

        System.out.println("Reciprocal: " + num1.reciprocal());
        System.out.println("Fractional part: " + num1.fractionalpart());

        boolean result = Numeric.compareAbsolute(-5.0, 5);
        System.out.println("Absolute equal: " + result);

    }


}