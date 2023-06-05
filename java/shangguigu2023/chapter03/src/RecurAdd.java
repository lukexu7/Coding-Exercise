/**
 * ClassName:recurAdd
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author: XZY
 * @Create: 2023/5/25 - 10:56
 * @Version: v1.0
 */


public class RecurAdd {

    public static void main(String[] args) {
        System.out.println(recurAdd(100));
    }

    static int recurAdd(int  num){
        if(num == 1){
            return num;
        }
        return num+recurAdd(num -1);

    }
}


