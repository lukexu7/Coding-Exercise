package com.ssm.test;

import java.io.InputStream;
import java.util.List;

import com.ssm.po.User;
import com.ssm.util.MybatisUtils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

public class MybatisTest {
    @Test 
    public void findUserByNameAndJobsTest() throws Exception{
        SqlSession sqlSession = MybatisUtils.getSession();
        User user = new User();
        user.setUsername("zhangsan");
        user.setJobs("teacher");
        
        List<User> users = sqlSession.selectList("com.ssm.mapper.UserMapper.findUserByNameAndJobs",user);
        
        for(User u: users){
            System.out.println(u.toString());
        }
        
        sqlSession.close();
    }
    
    @Test
    public void findUserByNameOrJobsTest() throws Exception{
        
        SqlSession sqlSession = MybatisUtils.getSession();
        User user = new User();
        // user.setUsername("zhangsan");
        // user.setJobs("teacher");
        
        List<User> users = sqlSession.selectList("com.ssm.mapper.UserMapper.findUserByNameOrJobs",user);
        
        for (User u: users){
            System.out.println(u.toString());
        }
        
        sqlSession.close();
    }
  
}
