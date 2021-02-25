package com.model.day1.company;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@Data
@AllArgsConstructor
public class Company {
    private String name; // nazwa firmy
    private String cityHeadquarters; // siedziba firmy
    private int employees; // ilość pracowników
    private List<Purchase> purchaseList; // lista zakupów wykonanych przez firmę (co firma kupiła)
}

