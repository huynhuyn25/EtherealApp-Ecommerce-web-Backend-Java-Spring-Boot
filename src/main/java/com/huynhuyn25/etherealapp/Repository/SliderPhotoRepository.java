package com.huynhuyn25.etherealapp.Repository;

import com.huynhuyn25.etherealapp.Model.Address;
import com.huynhuyn25.etherealapp.Model.SliderPhoto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SliderPhotoRepository  extends JpaRepository<SliderPhoto,Integer> {
}
