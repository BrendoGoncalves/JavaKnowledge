package br.com.alura.knowledge08.module05;

import org.junit.jupiter.api.*;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ReadjustmentServiceTest {
    private ReadjustmentService service;
    private Employee employee;
    @BeforeEach
    public void initializer(){
        service = new ReadjustmentService();
        employee = new Employee("Ana", LocalDate.now(), new BigDecimal("1000"));
    }
    @AfterEach
    public void finisher(){}
    @BeforeAll
    public static void end(){}
    @AfterAll
    public static void beginning(){}
    @Test
    public void readjustmentShouldBeThreePercentRegularPerformance(){
        service.giveReadjustment(employee, Performance.REGULAR);
        Assertions.assertEquals(new BigDecimal("1030.00"), employee.getSalary());
    }

    @Test
    public void readjustmentShouldBeFifteenPercentGoodPerformance(){
        service.giveReadjustment(employee, Performance.GOOD);
        Assertions.assertEquals(new BigDecimal("1150.00"), employee.getSalary());
    }
    @Test
    public void readjustmentShouldBeTwentyPercentGoodPerformance(){
        service.giveReadjustment(employee, Performance.EXCELENT);
        Assertions.assertEquals(new BigDecimal("1200.00"), employee.getSalary());
    }
}
