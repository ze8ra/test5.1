public class ListTester {
    public static void main(String[] args)
    {
        MyList<Double> testOne = new MyList<Double>();
        testOne.add(new Double("3.14"));

        testOne.add(new Double("113.7"));

        testOne.add(new Double("999.9"));
        System.out.println("The largest is " + testOne.largest());

        System.out.println("The smallest is " + testOne.smallest());
    }
}//end

