package Inner_Classes.InnerAccessOuter;

public class OuterClass {
    int x = 10;

    class InnerClass {
        public int myInnerMethod() {
            return x;
        }
    }
}
