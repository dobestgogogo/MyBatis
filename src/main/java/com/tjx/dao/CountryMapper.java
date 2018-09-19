package com.tjx.dao;

import com.tjx.entity.Country;
import com.tjx.entity.Provincial;

public interface CountryMapper {
    //根据id查找国家
    Country selectCountryById(Integer id);
    //根据countryId 查找国家
    Provincial selectProvincialById(Integer id);
}
