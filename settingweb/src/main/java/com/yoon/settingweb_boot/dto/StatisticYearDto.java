package com.yoon.settingweb_boot.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StatisticYearDto {
    private int totCnt;
    private String year;
    private boolean isSuccess;


    public void setYear(String year){
        this.year= year;
    }
    public void setIsSuccess(boolean isSuccess) {
        this.isSuccess = isSuccess;
    }
    public void setTotCnt(int totCnt) {
        this.totCnt = totCnt;
    }

    public int getTotCnt(){
        return totCnt;
    }
    public String getYear(){
        return year;
    }
    public boolean getIsSuccess() {
        return isSuccess;
    }
}
