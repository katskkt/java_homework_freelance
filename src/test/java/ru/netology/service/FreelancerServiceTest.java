package ru.netology.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.netology.services.FreelancerService;

import static org.junit.jupiter.api.Assertions.*;

class FreelancerServiceTest {
    @ParameterizedTest
    @CsvFileSource(resources = "test_data.csv")
    public void testCalculateParams(int income, int expenses, int threshold, int expected) {
        FreelancerService service = new FreelancerService();
        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }
}
