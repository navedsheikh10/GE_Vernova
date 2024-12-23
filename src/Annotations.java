public class Annotations {
    public static void main(String[] args) {
//        A1 a = ()->{
//            System.out.println("Hey");
//        };
//        a.hello();
    }

    public void demo1(){
        System.out.println("demo");
    }
}

@FunctionalInterface
interface A1{
    public void hello();
//    public void hey();
}

