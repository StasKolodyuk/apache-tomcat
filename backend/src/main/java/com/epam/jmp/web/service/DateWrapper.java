package com.epam.jmp.web.service;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.wordnik.swagger.annotations.ApiModel;

import java.time.LocalDate;

/**
 * Created by Aspire on 07.03.2016.
 */
@ApiModel
public class DateWrapper {
    private LocalDate currentDate;

    @JsonFormat(pattern = "dd/MM/yyyy")
    public LocalDate getCurrentDate() {
        return currentDate;
    }

    public void setCurrentDate(LocalDate currentDate) {
        this.currentDate = currentDate;
    }
}
