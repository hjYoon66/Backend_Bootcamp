package com.yoon.settingweb_boot.service;

import com.yoon.settingweb_boot.dto.StatisticYearDto;
import com.yoon.settingweb_boot.dto.StatisticYearMonthDayDto;
import com.yoon.settingweb_boot.dto.StatisticYearMonthDto;

public interface StatisticService {
    public StatisticYearDto yearLogin (String year);
    public StatisticYearMonthDto yearMonthLogin (String year);
    public StatisticYearMonthDayDto yearMonthDayLogin(String yearMonthDay);

}