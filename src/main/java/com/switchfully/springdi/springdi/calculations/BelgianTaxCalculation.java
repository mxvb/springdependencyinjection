package com.switchfully.springdi.springdi.calculations;

import com.switchfully.springdi.springdi.TaxCalculation;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BelgianTaxCalculation implements TaxCalculation {

    private static final double BE_TAX_RATE = 0.45;

    public double calculateTaxes(double yearlyIncome) {
        return yearlyIncome * BE_TAX_RATE;
    }
}
