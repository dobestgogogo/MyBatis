package com.tjx;

import com.tjx.dao.CountryMapper;
import com.tjx.entity.Country;
import com.tjx.entity.Provincial;
import com.tjx.utils.SqlSessionFactoryUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Before;
import org.junit.Test;

public class CountryTest {

    SqlSession sqlSession = null;
    CountryMapper mapper = null;

    @Before
    public void before(){
        sqlSession = SqlSessionFactoryUtil.getSession();
        mapper = sqlSession.getMapper(CountryMapper.class);
    }

    @Test
    public void testSelectCountryById(){
        Country country = mapper.selectCountryById(1);
        System.out.println(country.getcName());
    }

    @Test
    public void testSelectProvincialById(){
        Provincial provincial = mapper.selectProvincialById(1);
        System.out.println(provincial.getpName());
    }


}
