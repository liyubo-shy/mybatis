package com.bobo;

import com.bobo.pojo.Sys_user;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @Author: bo
 * @DATE: 2022/10/14 2:14
 **/
public class MybatisTest {
    public static void main(String[] args) throws IOException {
        //加载mybatis核心配置文件，获取SqlSessionFactory类
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //获取SqlSession对象，用于执行Sql
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //执行Sql
        List<Sys_user> sysUser = sqlSession.selectList("com.bobo.mapper.UserMapper.selectAll");
        System.out.println(sysUser);

        //释放资源
        sqlSession.close();
    }
}
