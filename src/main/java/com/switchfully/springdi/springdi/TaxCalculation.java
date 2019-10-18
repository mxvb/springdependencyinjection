package com.switchfully.springdi.springdi;

import org.springframework.stereotype.Component;

@Component
public interface TaxCalculation {

    double calculateTaxes(double yearlyIncome);
}
