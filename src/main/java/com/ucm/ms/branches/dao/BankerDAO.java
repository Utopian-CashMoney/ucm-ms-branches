package com.ucm.ms.branches.dao;

import com.ucm.ms.branches.entities.Banker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankerDAO extends JpaRepository<Banker, Integer>{
}
