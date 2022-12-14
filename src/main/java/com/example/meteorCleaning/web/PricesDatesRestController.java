package com.example.meteorCleaning.web;

import com.example.meteorCleaning.model.OrderPrices;
import com.example.meteorCleaning.service.EstimateDataService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class PricesDatesRestController {
    private final EstimateDataService service;

    public PricesDatesRestController(EstimateDataService service) {
        this.service = service;
    }


    @GetMapping("/prices")
    OrderPrices getPrices(){
      return   service.getPrices();
    }

    @GetMapping("/dates")
    Map<Object, Long> getAllDates(){
        return service.getAllDates();
    }
}
