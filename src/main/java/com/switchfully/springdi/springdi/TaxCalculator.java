package com.switchfully.springdi.springdi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TaxCalculator {

    private TaxCalculation taxCalculation;

    @Autowired
    public TaxCalculator(TaxCalculation taxCalculation) {
        this.taxCalculation = taxCalculation;
    }

    public double calculateTaxesWith(double yearlyIncome) {
        return taxCalculation.calculateTaxes(yearlyIncome);
    }
}
