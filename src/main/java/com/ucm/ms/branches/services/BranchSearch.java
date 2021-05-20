package com.ucm.ms.branches.services;

import java.util.Collection;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ucm.ms.branches.dao.BranchDAO;
import com.ucm.ms.branches.entities.Branch;

/*
 * Services designed to fetch collections of Branches
 */
@Service
@Transactional
public class BranchSearch {
	private final BranchDAO branchDAO;

	/**
     * Uses constructor-based dependency injection.
     * @param branchDAO The Branch DAO
     */
	@Autowired
	public BranchSearch(BranchDAO branchDAO) {
		this.branchDAO = branchDAO;
	}

	/*
	 * Get all Branches in DB
	 * 
	 * @return Collection of all branches
	 */
	public Collection<Branch> getAll() {
		return branchDAO.findAll();
	}

}
