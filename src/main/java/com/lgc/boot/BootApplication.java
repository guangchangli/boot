package com.lgc.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootApplication {

<<<<<<< HEAD
    public static void main(String[] args) {
        //use yml
//	      SpringApplication springApplication = new SpringApplication(BootApplication.class);
//        springApplication.setBannerMode(Banner.Mode.OFF);
//        springApplication.run(args);
        SpringApplication.run(BootApplication.class, args);
    }
=======
	public static void main(String[] args) {
		SpringApplication.run(BootApplication.class, args);
	}
>>>>>>> 1c7a9d35f91a8a639dcf10e377225f369c9c039f

}
