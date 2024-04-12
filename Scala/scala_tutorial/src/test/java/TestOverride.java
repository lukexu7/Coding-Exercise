public class TestOverride {

    public static void main(String[] args) {

        DD dd = new DD();

        System.out.println(dd.sum());

        CC cc = new DD();
        System.out.println(cc.sum());


    }
}


class CC{
    public int i = 10;
    public int sum(){
        return getI()+10;
    }

    public int getI(){
        return i;
    }
}

class DD extends CC{
    public int i = 20;
//    public int sum(){
//        return i+20;
//    }

    public int getI(){
        return i;
    }
}
