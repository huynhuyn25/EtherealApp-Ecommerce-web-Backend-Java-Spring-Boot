package com.huynhuyn25.etherealapp.Repository;

import com.huynhuyn25.etherealapp.Model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address,Integer> {
}
