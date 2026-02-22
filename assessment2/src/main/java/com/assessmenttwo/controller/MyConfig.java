package com.assessmenttwo.controller;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan(basePackages = {"com.assessmenttwo.controller","com.assessmenttwo.dao","com.assessmenttwo.service"})
@Configuration
public class MyConfig {}
