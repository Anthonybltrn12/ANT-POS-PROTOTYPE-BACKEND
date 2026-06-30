package com.yearup.ANT_POS_PROTOTYPE_BACKEND.service;


import com.yearup.ANT_POS_PROTOTYPE_BACKEND.model.Category;
import com.yearup.ANT_POS_PROTOTYPE_BACKEND.repository.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    private final CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository){
        this.categoryRepository = categoryRepository;
    }

    public List<Category> getAllCategories(){
        return this.categoryRepository.findAll();
    }
}
