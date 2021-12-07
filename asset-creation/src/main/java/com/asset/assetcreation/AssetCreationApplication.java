package com.asset.assetcreation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@EnableKafka
@SpringBootApplication
public class AssetCreationApplication {

	public static void main(String[] args) {
		SpringApplication.run(AssetCreationApplication.class, args);
	}

}
