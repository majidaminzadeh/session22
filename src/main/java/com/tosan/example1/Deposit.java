package com.tosan.example1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Deposit {
    private int balance;
    private String depositNumber;
    private String depositName;
    private String customerName;

}
