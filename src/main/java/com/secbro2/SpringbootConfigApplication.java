package com.secbro2;

import com.secbro2.beans.ArgsBean;
import com.secbro2.configuration.WithoutAnnotationConfiguration;
import com.secbro2.initializer.LearnApplicationContextInitializer;
import com.secbro2.listener.LearnListener;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.HashSet;
import java.util.Set;

//@SpringBootApplication(exclude= DataSourceAutoConfiguration.class)
@SpringBootApplication
public class SpringbootConfigApplication {

	public static void main(String[] args) {
//		SpringApplication.run(OtherApplication.class, args);
//		SpringApplication.run(SpringbootConfigApplication.class, args);

//		SpringApplication app = new SpringApplication(SpringbootConfigApplication.class);
//		app.addInitializers(new LearnApplicationContextInitializer());
//		app.run(args);

/*		SpringApplication app = new SpringApplication(SpringbootConfigApplication.class);
		app.addListeners(new LearnListener());
		app.run(args);*/

/*
		SpringApplication app = new SpringApplication(SpringbootConfigApplication.class);
		app.setBannerMode(Banner.Mode.OFF);
		app.run(args);
*/

/*		SpringApplication app = new SpringApplication(SpringbootConfigApplication.class);
		Set<String> set = new HashSet<>();
		set.add(WithoutAnnotationConfiguration.class.getName());
		app.setSources(set);
		ConfigurableApplicationContext context = app.run(args);
		WithoutAnnotationConfiguration bean = context.getBean(WithoutAnnotationConfiguration.class);
		System.err.println(bean.getName());*/

		SpringApplication app = new SpringApplication(SpringbootConfigApplication.class);
		ConfigurableApplicationContext context = app.run(args);
		ArgsBean bean = context.getBean(ArgsBean.class);
		bean.printArgs();

	}

}
