package com.yoon.settingweb_boot.dao;
import java.util.HashMap;

import com.yoon.settingweb_boot.dto.StatisticDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper

public interface  StatisticMapper {
    public HashMap<String, Object> selectYearLogin(String year);

}