package com.huynhuyn25.etherealapp.Repository;

import com.huynhuyn25.etherealapp.Model.Manufacturer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ManufacturerRepository extends JpaRepository<Manufacturer,Integer> {
}
