package com.sawyer.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Blog {
    private Integer bid;
    private String title;
    private String userId;
    private String userName;
    private Date date;
    private String context;
}
