package com.springboot.ex02;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

// 시작 클래스
@SpringBootApplication
// mapper 자동 스캔 -> DataSource 설정을 자동으로 해준다. 
// 반드시 패키지를 먼저 만들고, 아래처럼 추가해야 자동으로 설정을 해준다.
// dataSource-config.xml 파일과 동일.
@MapperScan("com.springboot.ex02.dao")
public class SpringBootThymeleafTApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootThymeleafTApplication.class, args);
	}
	
	@Bean // 자바 소스로 bean 등록, DataSource : javax.sql.DataSource
	public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {
		
		SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
		bean.setDataSource(dataSource); // 데이터 소스 설정
		
		// org.springframework.core.io.Resource
		// 마이바티스 xml mapper를 사용할 경우 아래 2줄 추가
		Resource[] res = new PathMatchingResourcePatternResolver().getResources("classpath:mappers/*Mapper.xml"); // src/main/resources/mappers
		bean.setMapperLocations(res);
		
		return bean.getObject();
	}
}