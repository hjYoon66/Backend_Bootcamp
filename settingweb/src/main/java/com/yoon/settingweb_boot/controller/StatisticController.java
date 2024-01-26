package com.yoon.settingweb_boot.controller;

import com.yoon.settingweb_boot.dto.*;
import com.yoon.settingweb_boot.service.StatisticService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StatisticController {
    @Autowired
    private StatisticService service;

    @ResponseBody
    @RequestMapping("/yearLogin")
    public StatisticYearDto yearLogin(String year) throws Exception{
        return service.yearLogin(year);
    }

    @ResponseBody
    @RequestMapping("/yearMonthLogin")
    public StatisticYearMonthDto yearMonthLogin(String yearMonth) throws Exception{
        return service.yearMonthLogin(yearMonth);
    }

    @ResponseBody
    @RequestMapping("/yearMonthDayLogin")
    public StatisticYearMonthDayDto yearMonthDayLogin(String yearMonthDay) throws Exception{
        return service.yearMonthDayLogin(yearMonthDay);
    }

    @ResponseBody
    @RequestMapping("/averageLogin")
    public AverageLoginDto averageLogin() throws Exception{
        return service.averageLogin();
    }

    @ResponseBody
    @RequestMapping("/departLogin")
    public DepartmentLoginDto getLoginCountByYearAndDept(String yearMonth,String dept) throws Exception{
        return service.getLoginCountByYearAndDept(yearMonth, dept);
    }
}
