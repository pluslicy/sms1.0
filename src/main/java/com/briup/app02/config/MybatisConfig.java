package com.briup.app02.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.briup.app02.dao")
public class MybatisConfig {

}
