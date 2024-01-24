package com.yoon.settingweb_boot.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StatisticYearMonthDayDto {
    private int totCnt;
    private boolean isSuccess;
    private String yearMonthDay;

    public void setIsSuccess(boolean isSuccess) {
        this.isSuccess = isSuccess;
    }
    public boolean getIsSuccess() {
        return isSuccess;
    }

}
