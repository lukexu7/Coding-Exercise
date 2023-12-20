package com.atguigu02.selfdefine.exer1;

/**
 * ClassName: DaoTest
 * Package: com.atguigu02.selfdefine.exer1
 * Description:
 *
 * @Author: XZY
 * @Create: 2023/12/20 - 16:52
 * @Version: v1.0
 */


public class DaoTest {

    public static void main(String[] args) {


        DAO<User> dao = new DAO<>();

        dao.save("1001",new User("fucn",33,1));
        dao.save("1002",new User("fu34n",33,1));
        dao.save("1003",new User("fsdfcn",33,1));




    }
}
