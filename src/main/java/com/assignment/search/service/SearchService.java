package com.assignment.search.service;
import com.assignment.search.model.Product;
import org.springframework.stereotype.Service;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class SearchService {

    private final InventoryService inventoryService;
    public SearchService(InventoryService inventoryService){
        this.inventoryService=inventoryService;
    }
    public List<String> searchAffordableProducts(){
        return inventoryService.getAllProducts()
                .stream()
                .filter(product ->product.getPrice() <50)
                .sorted(Comparator.comparing(Product::getName))
                .map(Product::getName)
                .collect(Collectors.toList());
    }
    public List<String> search(double maxPrice){
        return inventoryService.getAllProducts()
                .stream()
                .filter(p -> p.getPrice() < maxPrice)
                .sorted(Comparator.comparing(Product::getName))
                .map(Product::getName)
                .toList();
    }
}
