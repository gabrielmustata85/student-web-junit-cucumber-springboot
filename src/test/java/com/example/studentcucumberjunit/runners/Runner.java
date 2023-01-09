package com.example.studentcucumberjunit.runners;


import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasspathResource("features/")
public class Runner {
}
