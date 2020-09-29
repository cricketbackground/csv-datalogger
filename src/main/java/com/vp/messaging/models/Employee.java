package com.vp.messaging.models;

import com.opencsv.bean.CsvBindByName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@RequiredArgsConstructor
public class Employee {

    @CsvBindByName
    private long id;

    @CsvBindByName(column = "name")
    private String name;

    @CsvBindByName
    private String email;

    @CsvBindByName
    private String gender;

}
