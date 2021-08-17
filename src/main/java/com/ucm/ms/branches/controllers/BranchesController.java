package com.ucm.ms.branches.controllers;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ucm.ms.branches.entities.Branch;
import com.ucm.ms.branches.services.BranchSearch;

@CrossOrigin
@RestController
@RequestMapping("branches")
public class BranchesController {
	private final BranchSearch branchSearch;

	@Autowired
	public BranchesController(BranchSearch branchSearch) {
		this.branchSearch = branchSearch;
	}

	/**
	 * GET /api/branches - Return all branches
	 * 
	 * @return All branches
	 */
	@GetMapping
	public ResponseEntity<Collection<Branch>> get() {
		try {
			Collection<Branch> branches = branchSearch.getAll();
			return new ResponseEntity<>(branches, HttpStatus.valueOf(200));
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}