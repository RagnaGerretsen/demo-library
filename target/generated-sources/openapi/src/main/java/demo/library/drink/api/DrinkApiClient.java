package demo.library.drink.api;

import org.springframework.cloud.openfeign.FeignClient;
import demo.library.client.config.drink.ClientConfiguration;

@FeignClient(name="${drink.name:drink}", url="${drink.url:http://dummy}", configuration = ClientConfiguration.class)
public interface DrinkApiClient extends DrinkApi {
}
