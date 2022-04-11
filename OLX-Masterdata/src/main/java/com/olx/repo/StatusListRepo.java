package com.olx.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.olx.entity.StatusListEntity;

public interface StatusListRepo extends JpaRepository<StatusListEntity, Integer>{

}
