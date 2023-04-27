package Inner_Classes;

public class Main {
    public static void main(String[] args) {
        OuterClass myOuter = new OuterClass();
        OuterClass.InnerClass myInner = myOuter.new InnerClass();

        /* If you make the inner class static, you can access it
        without creating object of the outer class
         */
        //OuterClass1.InnerClass myNewIn = new OuterClass1.InnerClass();


        System.out.println(myOuter.x + myInner.y); // Output 15
        //System.out.println(myOuter.x + myNewIn.y);
    }
}
