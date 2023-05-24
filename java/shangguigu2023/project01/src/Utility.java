import java.util.Scanner;

/**
 * ClassName:Utility
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author: XZY
 * @Create: 2023/5/24 - 14:46
 * @Version: v1.0
 */


public class Utility {

    private static Scanner scanner =  new Scanner(System.in);

    public static char readMenuSelection(){
        char c;
        while(true){

            String str = readKeyboard(1);
            c = str.charAt(0);
            if(c != '1' && c != '2' && c != '3' && c != '4'){
                System.out.println("错误，请重新输入");
            } else
                break;


        }
        return c;



    }

    public static String readKeyboard(int limit){

        String line = "";

        while(scanner.hasNext()){
            line = scanner.nextLine();
            if(line.length() < 1 || line.length() > limit){
                System.out.println("输入长度（不大于" + limit + ")错误，请重新输入:");
                continue;
            }
            break;
        }
        return line;




    }


    public static int readNumber(){
        int n;
        for(;;){
            String str = readKeyboard(4);
            try {
                n = Integer.parseInt(str);
                break;
            } catch (NumberFormatException e){
                System.out.println("数字输入错误，请重新输入");
            }
        }
        return n;
    }

    public static String readString(){
        String s = readKeyboard(8);
        return s;
    }

    public static char readConfirmSelection(){
        char c;
        for(;;){
            String str = readKeyboard(1).toUpperCase();
            c = str.charAt(0);
            if( c == 'Y' || c == 'N'){
                break;

            } else {
                System.out.println("选择错误，重新输入");
            }
        }
        return c;
    }






}
