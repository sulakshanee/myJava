class OuterClass {
    int x = 10;

    class InnerClass {
        int y = 20;
    }

    static class StaticInnerClass {
        String name = "Theja";
    }

    class OuterFromInner {
        public int myOuterInner() {
            return x;
        }
    }
}

public class InnerOuter {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();
        System.out.println(outer.x + inner.y);

        // Run Static Inner Class
        OuterClass.StaticInnerClass static_inner = new OuterClass.StaticInnerClass();
        System.out.println(static_inner.name);

        // Run Outer Class from Inner Class
        OuterClass my_outer = new OuterClass();
        OuterClass.OuterFromInner my_inner = my_outer.new OuterFromInner();
        System.out.println(my_inner.myOuterInner());
    }
}
