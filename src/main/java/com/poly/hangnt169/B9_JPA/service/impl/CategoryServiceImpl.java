package com.poly.hangnt169.B9_JPA.service.impl;

import com.poly.hangnt169.B9_JPA.entity.Category;
import com.poly.hangnt169.B9_JPA.repository.CategoryRepository;
import com.poly.hangnt169.B9_JPA.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public List<Category> getAll() {
        return categoryRepository.findAll();
    }

    @Override
    public Page<Category> getCategoryByPage(Integer page, Integer size) {
        Pageable pageable = PageRequest.of(page, size);
        return categoryRepository.findAll(pageable);
    }

    @Override
    public void addCategory(Category category) {
        categoryRepository.save(category);
    }

    @Override
    public void deleteCategory(Long id) {
        categoryRepository.deleteById(id);
    }

    @Override
    public void updateCategory(Long id, Category category) {

    }

    @Override
    public Category findCategoriesByIdAndCategoryCode(Long id, String categoryCode) {
        return categoryRepository.findCategoryByIdAndCategoryCode(id, categoryCode);
    }

    @Override
    public Category findCategory1(Long id, String categoryCode) {
        return categoryRepository.findCategory1(id, categoryCode);
    }

    @Override
    public Category findCategory2(Long id, String categoryCode) {
//        return categoryRepository.findCategory2(id,categoryCode);
        return categoryRepository.findCategory1Native(id, categoryCode);
//        return categoryRepository.findCategory2Native(id,categoryCode);
    }
}
