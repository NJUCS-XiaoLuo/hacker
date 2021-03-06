package cn.nju.edu.hacker.form;

import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Setter
@Getter
public class OrderForm {

    private int id;

    private int studentId;

    private int vendorId;

    private String sequence;

    private Double money;

    private String remarks;

    private String description;

    private Date getMealTime;

}
