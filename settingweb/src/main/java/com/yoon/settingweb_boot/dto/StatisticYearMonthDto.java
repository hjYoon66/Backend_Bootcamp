package com.yoon.settingweb_boot.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StatisticYearMonthDto {
    private int totCnt;
    private boolean isSuccess;
    private String yearMonth;


    public void setIsSuccess(boolean isSuccess) {
        this.isSuccess = isSuccess;
    }
    public void setTotCnt(int totCnt) {
        this.totCnt = totCnt;
    }
    public void setYearMonth(String yearMonth){
        this.yearMonth= yearMonth;
    }
    public int getTotCnt(){
        return totCnt;
    }
    public boolean getIsSuccess() {
        return isSuccess;
    }
}
