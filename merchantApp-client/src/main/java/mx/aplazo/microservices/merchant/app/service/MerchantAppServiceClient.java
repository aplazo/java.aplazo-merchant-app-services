package mx.aplazo.microservices.merchant.app.service;



import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import mx.aplazo.microservices.merchant.app.model.response.MerchantAppResponse;
import mx.aplazo.microservices.merchant.app.model.request.MerchantAppRequest;

/**
 * @author Aplazo
 *
 * TODO, This is a service of your microservice and it's
 * impemented on a controller.
 * 
 * 
 */

@FeignClient(name="MerchantApp",url="${aplazo.url.api.group.apiname}")
public interface MerchantAppServiceClient{
	
	@GetMapping("/api/v1")
	public String operation1();
		
	@PostMapping("/api/v1")
	public MerchantAppResponse operation2(MerchantAppRequest request);
	
}
