package com.huynhuyn25.etherealapp.Repository;

import com.huynhuyn25.etherealapp.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository  extends JpaRepository<Product,Integer> {

}
