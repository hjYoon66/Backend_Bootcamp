package com.yoon.settingweb_boot.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ExceptHolidayDto {
    private int exceptHoliday;
    private boolean isSuccess;

    public void setIsSuccess(boolean isSuccess) {
        this.isSuccess = isSuccess;
    }
    public boolean getIsSuccess() {
        return isSuccess;
    }
}
