package br.com.alura.knowledge08.module02;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class BonusService {
    public BigDecimal calculateBonus(Employee employee) {
        BigDecimal valueBonus = employee.getSalary().multiply(new BigDecimal("0.1"));
        if (valueBonus.compareTo(new BigDecimal("1000")) > 0) {
            valueBonus = BigDecimal.ZERO;
        }
        return valueBonus.setScale(2, RoundingMode.HALF_UP);
    }
}
