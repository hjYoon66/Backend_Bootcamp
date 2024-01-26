package com.yoon.settingweb_boot.dao;

import com.yoon.settingweb_boot.dto.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper

public interface  StatisticMapper {
    public StatisticYearDto selectYearLogin(String year);
    public StatisticYearMonthDto selectYearMonthLogin(String yearMonth);
    public StatisticYearMonthDayDto selectYearMonthDayLogin(String yearMonthDay);
    public AverageLoginDto getAvgDailyLogin();
    public DepartmentLoginDto getLoginCountByYearAndDept(@Param("yearMonth") String yearMonth, @Param("dept") String dept );

}