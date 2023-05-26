package com.poly.hangnt169.B9_JPA.service;

import com.poly.hangnt169.B9_JPA.entity.Category;
import org.springframework.data.domain.Page;

import java.util.List;

public interface CategoryService {


    List<Category>getAll();

    Page<Category> getCategoryByPage(Integer page, Integer size);

    void addCategory(Category category);

    void deleteCategory(Long id);

    void updateCategory(Long id, Category category);

    Category findCategoriesByIdAndCategoryCode(Long id, String categoryCode);

    Category findCategory1(Long id, String categoryCode);

    Category findCategory2(Long id, String categoryCode);
}
