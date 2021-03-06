package com.nlhui.eduservice.config;

import com.baomidou.mybatisplus.core.MybatisDefaultParameterHandler;
import com.baomidou.mybatisplus.core.injector.ISqlInjector;
import com.baomidou.mybatisplus.extension.injector.LogicSqlInjector;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@MapperScan("com.nlhui.eduservice.mapper")
@Configuration
public class EduConfig {

    //逻辑删除插件
    @Bean
    public ISqlInjector sqlInjector() { return new LogicSqlInjector();
    }

}
