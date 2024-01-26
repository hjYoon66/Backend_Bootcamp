package com.yoon.settingweb_boot.service;

import com.yoon.settingweb_boot.dto.*;

public interface StatisticService {
    public StatisticYearDto yearLogin (String year);
    public StatisticYearMonthDto yearMonthLogin (String year);
    public StatisticYearMonthDayDto yearMonthDayLogin(String yearMonthDay);
    public AverageLoginDto averageLogin();

    public DepartmentLoginDto getLoginCountByYearAndDept(String yearMonth,String dept );

}