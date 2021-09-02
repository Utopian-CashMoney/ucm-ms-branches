package com.ucm.ms.branches.dao;

import com.ucm.ms.branches.entities.Branch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BranchDAO extends JpaRepository<Branch, Integer>{
}
