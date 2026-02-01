package com.assignment.search.service;
import com.assignment.search.model.Product;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class InventoryService {
    public List<Product> getAllProducts(){
        return List.of(
                new Product("Apple",30),
                new Product("Orange",60),
                new Product("Banana",10),
                new Product("Mango",45),
                new Product("Grapes",55),
                new Product("Strawberry",50)
        );
    }

}
