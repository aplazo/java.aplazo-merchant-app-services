package mx.aplazo.microservices.merchant.app.service;


import mx.aplazo.microservices.merchant.app.model.response.MerchantAppResponse;
import mx.aplazo.microservices.merchant.app.model.request.MerchantAppRequest;

/**
 * @author Aplzo
 *
 * TODO, This is a service of your microservice and it's
 * impemented on a controller.
 * 
 * 
 */
public interface MerchantAppService {
	
	
	public MerchantAppResponse operation3(MerchantAppRequest inputObject);
		
	public MerchantAppResponse operation4(MerchantAppRequest inputObject);
}
