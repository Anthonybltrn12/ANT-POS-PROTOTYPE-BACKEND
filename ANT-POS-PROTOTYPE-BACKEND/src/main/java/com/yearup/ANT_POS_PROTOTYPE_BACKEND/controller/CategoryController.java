package com.yearup.ANT_POS_PROTOTYPE_BACKEND.controller;


import com.yearup.ANT_POS_PROTOTYPE_BACKEND.model.Category;
import com.yearup.ANT_POS_PROTOTYPE_BACKEND.service.CategoryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("category")
public class CategoryController {

    private CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }
    //getting all of the categorys through an aoi
    @GetMapping
    public ResponseEntity<List<Category>> getAll(){
        return ResponseEntity.ok(categoryService.getAllCategories());
    }
}
