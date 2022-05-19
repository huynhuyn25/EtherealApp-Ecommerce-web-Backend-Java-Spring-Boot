package com.huynhuyn25.etherealapp.Repository;

import com.huynhuyn25.etherealapp.Model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Integer> {
}
