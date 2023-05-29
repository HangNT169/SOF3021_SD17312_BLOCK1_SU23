package com.poly.hangnt169.B9_JPA.repository;

import com.poly.hangnt169.B9_JPA.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
    // CRUD 1 bang => Khong can phai viet
    // Co 2 cach custom SQL
    // C1: Query Creation
    // C2: @Query

    // C1
    Category findCategoryByIdAndCategoryCode(Long id, String categoryCode1);

    // C2
    @Query("SELECT c FROM Category c WHERE c.id = ?1 AND c.categoryCode = ?2")
    Category findCategory1(Long id, String categoryCode);

    @Query("SELECT c FROM Category c WHERE c.id = :id AND c.categoryCode = :category_code")
    Category findCategory2(@Param("id") Long id, @Param("category_code") String categoryCode);

    @Query(value = "SELECT * FROM category c " +
            "WHERE c.id = ?1 AND c.category_code =?2", nativeQuery = true)
    Category findCategory1Native(Long id, String categoryCode);

    @Query(value = "SELECT * FROM category c " +
            "WHERE c.id = :id AND c.category_code =:category_code", nativeQuery = true)
    Category findCategory2Native(@Param("id") Long id, @Param("category_code") String categoryCode);

    // CRUD 1 bang => Khong can phai viet
    // Co 2 cach custom SQL
    // C1: Query Creation
    // C2: Raw SQL

    // C1 => Khong can cau SQL => Ten ham dai
    List<Category> findCategoryByCategoryNameOrCategoryCode(String categoryName, String categoryCode);

    // C2: Raw SQl => Bat buoc su dung cau SQL => K can care toi ten ham
    // C2.1: Truy van tren thuc the => JPQL(JPA Query Language) <=> Tuong tu HQL(Hibernate Query Language)
    @Query("SELECT c FROM Category c WHERE c.categoryName = ?2 AND c.categoryCode =?1")
    List<Category> search1(String categoryCode, String categoryName);

    // C2.2: Truy van tren SQL => Native query = true
    @Query(value = "SELECT * FROM category c WHERE c.category_name = ?1 AND c.category_code = ?2", nativeQuery = true)
    List<Category> search2(String categoryCode, String categoryName);
}
