package mx.aplazo.microservices.merchant.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;
import mx.aplazo.annotation.EnableAplazoFeingClientInterceptor;
import mx.aplazo.annotation.EnableAplazoFilterModule;
import mx.aplazo.annotation.EnableErrorHandlerModule;
import mx.aplazo.security.annotation.EnableSecurityModule;




/**
 * @author Aplazo
 * 
 * TODO, This is a main class of your Microservice.
 * 
 *
 */
@SpringBootApplication
@EnableAplazoFilterModule
@EnableErrorHandlerModule
@EnableSecurityModule
@EnableAplazoFeingClientInterceptor
@Slf4j
public class MerchantAppApp {
	/**
	 * Main method of MerchantApp.
	 * @param args type of String[]
	 */
	public static void main(String[] args) {
		SpringApplication.run(MerchantAppApp.class, args);
		log.info("MerchantAppApp start ok!");
	}
}
