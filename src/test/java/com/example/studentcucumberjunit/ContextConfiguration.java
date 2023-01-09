package com.example.studentcucumberjunit;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = {StudentCucumberJunitApplication.class})
public class ContextConfiguration {
}
