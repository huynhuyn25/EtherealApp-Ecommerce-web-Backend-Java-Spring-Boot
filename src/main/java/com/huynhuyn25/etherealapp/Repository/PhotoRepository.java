package com.huynhuyn25.etherealapp.Repository;

import com.huynhuyn25.etherealapp.Model.Photo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhotoRepository  extends JpaRepository<Photo,Integer> {
}
