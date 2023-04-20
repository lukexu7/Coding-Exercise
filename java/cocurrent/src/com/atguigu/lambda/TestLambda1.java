package com.atguigu.lambda;

public class TestLambda1 {

    static class Like2 implements  ILike{

        @Override
        public void lambda() {
            System.out.println("I like lambda 2");
        }
    }
    public static void main(String[] args){
        ILike like = new Like();
        like.lambda();

        ILike like2 = new Like2();
        like2.lambda();



        class Like3 implements ILike{

            @Override
            public void lambda() {
                System.out.println("I like lambda3");
            }
        }

        ILike like3 = new Like3();
        like3.lambda();


        like = new ILike(){
            @Override
            public void lambda(){
                System.out.println("I like lambda5");
            }
        };
        like.lambda();

        ILike like5 = () -> {
            System.out.println("I like lambda6");
        };
        like.lambda();
    }
}

interface ILike{
    void lambda();
}

class Like implements ILike{
    @Override
    public void lambda(){
        System.out.println("I like lambda");
    }
}
