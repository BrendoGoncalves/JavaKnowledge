package br.com.alura.knowledge08.module04;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

public class BonusServiceTest {
    @Test
    public void zeroBonusWhenHighSalary(){
        BonusService bonusSer = new BonusService();
        Assertions.assertThrows(IllegalArgumentException.class, () -> bonusSer.calculateBonus(new Employee("Brendo", LocalDate.now(), new BigDecimal("25000"))));
        /*
        try{
            bonusSer.calculateBonus(new Employee("Brendo", LocalDate.now(), new BigDecimal("25000"))));
            Assertions.fail("Not Exception");
        }catch(Exception e){
            Assertions.assertEquals("Salary bigger than R$ 10000.00", e.getMessage());
        }
        */
    }

    @Test
    public void tenPercentBonusWhenLowSalary(){
        BonusService bonusSer = new BonusService();
        BigDecimal bonus = bonusSer.calculateBonus(new Employee("Brendo", LocalDate.now(), new BigDecimal("2500")));
        Assertions.assertEquals(new BigDecimal("250.00"), bonus);
    }

    @Test
    public void tenPercentBonusWhenTenThousandSalary(){
        BonusService bonusSer = new BonusService();
        BigDecimal bonus = bonusSer.calculateBonus(new Employee("Brendo", LocalDate.now(), new BigDecimal("10000")));
        Assertions.assertEquals(new BigDecimal("1000.00"), bonus);
    }
}
