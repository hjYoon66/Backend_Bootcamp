package com.yoon.settingweb_boot.dao;

import com.yoon.settingweb_boot.dto.StatisticYearDto;
import com.yoon.settingweb_boot.dto.StatisticYearMonthDayDto;
import com.yoon.settingweb_boot.dto.StatisticYearMonthDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper

public interface  StatisticMapper {
    public StatisticYearDto selectYearLogin(String year);
    public StatisticYearMonthDto selectYearMonthLogin(String yearMonth);
    public StatisticYearMonthDayDto selectYearMonthDayLogin(String yearMonthDay);

}