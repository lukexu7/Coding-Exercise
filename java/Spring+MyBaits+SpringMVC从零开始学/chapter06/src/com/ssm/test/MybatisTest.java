package com.ssm.test;

import java.io.InputStream;
import java.util.List;

import com.ssm.po.User;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

public class MybatisTest {
    @Test 
    public void findUserById() throws Exception{
        String resource="mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
        
        SqlSession sqlSession=sqlSessionFactory.openSession();
        
        User user = sqlSession.selectOne("com.ssm.mapper.UserMapper.findUserById",2);
        
        System.out.println(user.toString());
        
        sqlSession.close();
    }
    
    @Test 
    public void findUserByName() throws Exception{
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
        
        SqlSession sqlSession=sqlSessionFactory.openSession();
        
        List<User> users = sqlSession.selectList("com.ssm.mapper.UserMapper.findUserByName","g");
        
        
        for (User user:users){
            System.out.println(user.toString());
        }
        
        sqlSession.close();
    }
    
    @Test 
    public void addUserTest() throws Exception{
        String resource = "mybatis-config.xml";
        InputStream inputStream=Resources.getResourceAsStream(resource);
        
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
        
        SqlSession sqlSession = sqlSessionFactory.openSession();
        
        User user = new User();
        user.setUsername("tom");
        user.setJobs("worker");
        user.setPhone("13459807624");
        
        int rows = sqlSession.insert("com.ssm.mapper.UserMapper.addUser",user);
        
        if (rows > 0){
            System.out.println("成功添加"+rows+"条数据");
        } else {
            System.out.println("添加失败");
        }
        
        sqlSession.commit();
        sqlSession.close();
    }
    
    @Test 
    public void updateUserTest() throws Exception{
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        
        User user = new User(); 
        user.setId(4);
        user.setUsername("tom");
        user.setPhone("110");
        user.setJobs("police officer");
        
        int rows = sqlSession.update("com.ssm.mapper.UserMapper.updateUser",user);
        
        if (rows > 0){
            System.out.println("成功修改了"+rows+"条数据");
        } else {
            System.out.println("修改失败");
        }
        sqlSession.commit();
        sqlSession.close();
        
    }
    
    @Test
    public void deleteUserTest() throws Exception{
        String resource = "mybatis-config.xml";
        
        InputStream inputStream=Resources.getResourceAsStream(resource);
        
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        
        int rows = sqlSession.delete("com.ssm.mapper.UserMapper.deleteUser",4);
        
        if(rows > 0 ){
            System.out.println("删除了"+rows+"条数据");
        } else {
            System.out.println("删除数据失败");
        }
        sqlSession.commit();
        
        sqlSession.close();
    }
}
