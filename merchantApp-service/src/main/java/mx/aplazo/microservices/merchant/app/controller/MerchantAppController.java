package mx.aplazo.microservices.merchant.app.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.extern.slf4j.Slf4j;
import mx.aplazo.microservices.merchant.app.model.request.MerchantAppRequest;
import mx.aplazo.microservices.merchant.app.model.response.MerchantAppResponse;
import mx.aplazo.microservices.merchant.app.service.MerchantAppServiceClient;

/**
 * @author Aplazo
 *
 * TODO, This is a controller of your Microservice,
 * it has two GET and two POST methods.
 * 
 * 
 */
@Slf4j
@Tag(name="MerchantApp")
@RestController
@RequestMapping( produces = MediaType.APPLICATION_JSON_VALUE)
public class MerchantAppController implements MerchantAppServiceClient {

	public String operation1() {
		return "Hola";
	}
	
	public MerchantAppResponse operation2(MerchantAppRequest request){
		return null;
	}

}
