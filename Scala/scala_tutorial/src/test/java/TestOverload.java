public class TestOverload {

    public static void main(String[] args) {

        test(new AA());
        test(new BB());

        AA aa1 = new BB();
        test(aa1);



    }

    public static void test(AA aa){
        System.out.println("aa");
    }

    public static void test(BB bb){
        System.out.println("bb");
    }
}


class AA{

}


class BB extends AA{


}