package com.yoon.settingweb_boot.service;

import com.yoon.settingweb_boot.dto.StatisticYearDto;
import com.yoon.settingweb_boot.dto.StatisticYearMonthDayDto;
import com.yoon.settingweb_boot.dto.StatisticYearMonthDto;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yoon.settingweb_boot.dao.StatisticMapper;

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
}
