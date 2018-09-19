package com.tjx.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class SqlSessionFactoryUtil {
    //创建需要单例的对象实例
    private static  SqlSessionFactory factory;
    //私有化构造
    private SqlSessionFactoryUtil(){}
    //对外提供一个访问的接口
    public static  synchronized SqlSession getSession(){
        try{
            InputStream is = Resources.getResourceAsStream("mybatis.xml");
            //创建sqlSessionFactory
            if (factory==null){
                factory = new SqlSessionFactoryBuilder().build(is);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        //开启session
        return factory.openSession();
    }
}
