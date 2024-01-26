package com.yoon.settingweb_boot.service;

import com.yoon.settingweb_boot.dao.StatisticMapper;
import com.yoon.settingweb_boot.dto.*;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Log4j
@Service
public class StatisticServiceImpl implements StatisticService {
    @Autowired
    private StatisticMapper uMapper;

    @Override
    public StatisticYearDto yearLogin(String year) {
        StatisticYearDto retVal = new StatisticYearDto();

        try {
            retVal = uMapper.selectYearLogin(year);
            if (retVal == null) {
                log.info("selectYearLogin returned null");

            } else {
                log.info("selectYearLogin returned: " + retVal.toString());
            }
            retVal.setYear(year);
            retVal.setIsSuccess(true);

        } catch (Exception e) {
            log.error("Error in yearloginNum: " + e.getMessage());
            retVal.setTotCnt(-999);
            retVal.setYear(year);
            retVal.setIsSuccess(false);
        }

        return retVal;
    }

    @Override
    public StatisticYearMonthDto yearMonthLogin(String yearMonth) {
        StatisticYearMonthDto retVal = new StatisticYearMonthDto();

        try {
            retVal = uMapper.selectYearMonthLogin(yearMonth);
            if (retVal == null) {
                log.info("selectYearMonthLogin returned null");

            } else {
                log.info("selectYearMonthLogin returned: " + retVal.toString());
            }
            retVal.setYearMonth(yearMonth);
            retVal.setIsSuccess(true);

        } catch (Exception e) {
            log.error("Error in : yearMonthLogin" + e.getMessage());
            retVal.setTotCnt(-999);
            retVal.setYearMonth(yearMonth);
            retVal.setIsSuccess(false);
        }

        return retVal;
    }
    @Override
    public StatisticYearMonthDayDto yearMonthDayLogin(String yearMonthDay) {
        StatisticYearMonthDayDto retVal = new StatisticYearMonthDayDto();

        try {
            retVal = uMapper.selectYearMonthDayLogin(yearMonthDay);
            if (retVal == null) {
                log.info("selectYearMonthDayLogin returned null");

            } else {
                log.info("selectYearMonthDayLogin returned: " + retVal.toString());
            }
            retVal.setYearMonthDay(yearMonthDay);
            retVal.setIsSuccess(true);

        } catch (Exception e) {
            log.error("Error in : yearMonthDayLogin" + e.getMessage());
            retVal.setTotCnt(-999);
            retVal.setYearMonthDay(yearMonthDay);
            retVal.setIsSuccess(false);
        }

        return retVal;
    }

    @Override
    public AverageLoginDto averageLogin(){
        AverageLoginDto retVal = new AverageLoginDto(-999, false); // 기본 생성자에서 totCnt와 isSuccess를 설정

        try {
            retVal = uMapper.getAvgDailyLogin();

            if (retVal == null) {
                log.info("getAvgDailyLogin returned null");
            } else {
                log.info("getAvgDailyLogin successfully returned: " + retVal.toString());
                retVal.setIsSuccess(true);
            }
        } catch (Exception e) {
            log.error("Error in getAvgDailyLogin: ", e); // 예외 메시지 외에 스택 추적을 포함
        }

        return retVal;
    }

    @Override
    public DepartmentLoginDto getLoginCountByYearAndDept( String yearMonth,String dept) {
        DepartmentLoginDto retVal = new DepartmentLoginDto();

        try {
            retVal = uMapper.getLoginCountByYearAndDept(yearMonth,dept);

            if (retVal == null) {
                log.info("getLoginCountByYearAndDept returned null");
            } else {
                log.info("getLoginCountByYearAndDept successfully returned: " + retVal.toString());
                retVal.setIsSuccess(true);
            }
        } catch (Exception e) {
            log.error("Error in getLoginCountByYearAndDept: ", e);
        }

        return retVal;
    }



}
