package com.switchfully.springdi.springdi;

import configuration.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TaxCalculatorApp {
    public static void main(String[] args) {

    ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        TaxCalculator americanCalculator = applicationContext.getBean("american", TaxCalculator.class);
        TaxCalculator belgianCalculator = applicationContext.getBean("belgian", TaxCalculator.class);
        TaxCalculator frenchCalculator = applicationContext.getBean("french", TaxCalculator.class);

        System.out.println(americanCalculator.calculateTaxesWith(23000));
        System.out.println(belgianCalculator.calculateTaxesWith(23000));
        System.out.println(frenchCalculator.calculateTaxesWith(23000));
    }

}
