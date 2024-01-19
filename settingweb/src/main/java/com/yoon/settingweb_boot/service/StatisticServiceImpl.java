package com.yoon.settingweb_boot.service;


import java.util.HashMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yoon.settingweb_boot.dao.StatisticMapper;

@Service
public class StatisticServiceImpl implements StatisticService {


    @Autowired
    private StatisticMapper uMapper;

    @Override
    public HashMap<String, Object> yearloginNum (String year) {
        HashMap<String, Object> retVal = new HashMap<String,Object>();

        try {
            retVal = uMapper.selectYearLogin(year);
            if (retVal == null) {
                System.out.println("selectYearLogin returned null");
            } else {
                System.out.println("selectYearLogin returned: " + retVal.toString());
            }
            retVal.put("year", year);
            retVal.put("is_success", true);

        }catch(Exception e) {
            System.out.println("Error in yearloginNum: " + e.getMessage());
            retVal.put("totCnt", -999);
            retVal.put("year", year);
            retVal.put("is_success", false);
        }

        return retVal;
    }


}