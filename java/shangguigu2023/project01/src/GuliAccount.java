/**
 * ClassName:GuliAccount
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author: XZY
 * @Create: 2023/5/24 - 14:21
 * @Version: v1.0
 */


public class GuliAccount {

    public static void main(String[] args) {

        boolean isFlag  = true;

        int balance = 10000;

        String info = "";




        while(isFlag){





            System.out.println("-----------记账软件-------------\n");
            System.out.println("          1.收支明细");
            System.out.println("          2.登记收入");
            System.out.println("          3.登记支出");
            System.out.println("          4.退  出\n");
            System.out.println("          请选择(1-4): ");


            char selection = Utility.readMenuSelection();

            switch (selection){

                case '1':
                    System.out.println("------------当前收支明细记录---------");
                    System.out.println("收支      账户金额       收支金额       说 明");
                    System.out.println(info);
                    System.out.println("------------当前收支明细记录---------");
                    break;

                case '2':
                    System.out.println("本次收入金额: ");
                    int money = Utility.readNumber();
                    if (money  > 0){
                        balance +=  money;

                    }

                    System.out.print("本次收入说明: ");
                    String addDesc = Utility.readString();
                    info += "收入      " + balance + "      " + money +  "      " + addDesc + "\n";
                    System.out.println("------------登记完成-------------");

                    break;

                case '3':
                    System.out.println("登记支出:");
                    System.out.print("本次支出金额: ");
                    int money2 = Utility.readNumber();
                    if (money2 >=0 && money2  <= balance ){
                        balance -=  money2;

                    }

                    System.out.println("本次支出说明: ");
                    String addDesc2 = Utility.readString();
                    info += "支出      " + balance + "      " + money2 +  "      " + addDesc2 + "\n";
                    System.out.println("------------登记完成-------------");

                    break;

                case '4':
                    System.out.println("\n退出?(Y/N): ");
                    char isExit = Utility.readConfirmSelection();
                    if(isExit == 'Y'){
                        isFlag =false;
                    }
                    break;
            }


        }

    }

}
