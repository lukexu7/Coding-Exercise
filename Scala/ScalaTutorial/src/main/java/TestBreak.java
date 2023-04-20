/**
 * @author Zhengyang Xu
 * @version 1.0
 * @date 2021/8/15 16:54
 */
public class TestBreak {
    public static void main(String[] args) {
        for (int i = 0;i < 5; i++){
            if (i == 3) break;
            System.out.println(i);
        }
        System.out.println("break");
    }
}
