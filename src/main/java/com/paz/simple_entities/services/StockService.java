package com.paz.simple_entities.services;

import com.paz.simple_entities.model.Stock;
import com.paz.simple_entities.repository.StockRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List

public class StockService {
    @Autowired
    StockRepository stockRepository;

    public List<Stock> getAllStocks() {
        return stockRepository.findAll();
    }
}
