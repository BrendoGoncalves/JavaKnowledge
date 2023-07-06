package br.com.alura.knowledge08.module05;

import java.math.BigDecimal;

public class ReadjustmentService {

    public void giveReadjustment(Employee employee, Performance performance){
        BigDecimal raise = employee.getSalary().multiply(performance.readjustmentPercent());
        employee.readjustmentSalary(raise);
    }
}
