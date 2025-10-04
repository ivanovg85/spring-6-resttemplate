package art.cookedincode.spring6resttemplate.client;

import art.cookedincode.spring6resttemplate.model.BeerDTO;
import art.cookedincode.spring6resttemplate.model.BeerStyle;
import org.springframework.data.domain.Page;

import java.util.UUID;

/**
 * Created by Georgi Ivanov
 */
public interface BeerClient {

    BeerDTO createBeer(BeerDTO newDto);

    BeerDTO getBeerById(UUID beerId);

    Page<BeerDTO> listBeers();

    Page<BeerDTO> listBeers(String beerName, BeerStyle beerStyle, Boolean showInventoryOnHand, Integer pageNumber, Integer pageSize);

    BeerDTO updateBeer(BeerDTO beerDto);

    void deleteBeer(UUID beerId);
}
