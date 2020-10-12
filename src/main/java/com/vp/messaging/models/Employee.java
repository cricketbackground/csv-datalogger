package com.vp.messaging.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@RequiredArgsConstructor
public class Employee {

    private long id;

    private String name;

    private String email;

    private String gender;

}
