package com.odentJava.SpringBootWithService.repository;

import com.odentJava.SpringBootWithService.model.Assets;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssetRep extends JpaRepository<Assets,Long> {
}
