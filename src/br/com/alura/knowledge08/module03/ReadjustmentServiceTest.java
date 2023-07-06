package br.com.alura.knowledge08.module03;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ReadjustmentServiceTest {
    // TDD (Test Driven Development)
    // Test -> Develop -> Refactor -> ..
    @Test
    public void readjustmentShouldBeThreePercentRegularPerformance(){
        ReadjustmentService service = new ReadjustmentService();
        Employee employee = new Employee("Ana", LocalDate.now(), new BigDecimal("1000"));
        service.giveReadjustment(employee, Performance.REGULAR);

        Assertions.assertEquals(new BigDecimal("1030.00"), employee.getSalary());
    }

    @Test
    public void readjustmentShouldBeFifteenPercentGoodPerformance(){
        ReadjustmentService service = new ReadjustmentService();
        Employee employee = new Employee("Ana", LocalDate.now(), new BigDecimal("1000"));
        service.giveReadjustment(employee, Performance.GOOD);

        Assertions.assertEquals(new BigDecimal("1150.00"), employee.getSalary());
    }
    @Test
    public void readjustmentShouldBeTwentyPercentGoodPerformance(){
        ReadjustmentService service = new ReadjustmentService();
        Employee employee = new Employee("Ana", LocalDate.now(), new BigDecimal("1000"));
        service.giveReadjustment(employee, Performance.EXCELENT);

        Assertions.assertEquals(new BigDecimal("1200.00"), employee.getSalary());
    }
}
