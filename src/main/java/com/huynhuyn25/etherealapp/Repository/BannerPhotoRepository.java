package com.huynhuyn25.etherealapp.Repository;

import com.huynhuyn25.etherealapp.Model.AvaPhoto;
import com.huynhuyn25.etherealapp.Model.BannerPhoto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BannerPhotoRepository extends JpaRepository<BannerPhoto,Integer> {
}
