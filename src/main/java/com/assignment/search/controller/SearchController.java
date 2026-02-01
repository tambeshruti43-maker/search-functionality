package com.assignment.search.controller;

import com.assignment.search.service.SearchService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/search")
public class SearchController {

    private final SearchService searchService;

    public SearchController(SearchService searchService) {
        this.searchService=searchService;
    }

    @GetMapping("/{maxPrice}")
    public List<String>searchProducts(
            @PathVariable double maxPrice
    ){
        return searchService.search(maxPrice);
    }
}

