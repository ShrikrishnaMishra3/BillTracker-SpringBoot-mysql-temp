package com.billTracker.FsePaBillTracker.service;
 
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.billTracker.FsePaBillTracker.dtos.BillTrackerDetailsDTO;
import com.billTracker.FsePaBillTracker.entitys.BillTrackerDetails;
import com.billTracker.FsePaBillTracker.repo.BillRepository;

@Service
@Transactional
public class BillServiceImpl implements BillService {

	@Autowired
	private BillRepository repository;

	@Override
	public List<BillTrackerDetailsDTO> getAllBilles() {
		
		return null;
	}

	@Override
	public BillTrackerDetailsDTO addBill(BillTrackerDetailsDTO bill) {

		return null;
	}

	@Override
	public BillTrackerDetailsDTO deleteBill(BillTrackerDetailsDTO bill) {
	
           return null;
	}

	@Override
	public Long updateBill(BillTrackerDetailsDTO bill) {
	
		return null;

	}
	@Override
	public BillTrackerDetailsDTO createBill(BillTrackerDetailsDTO bill) {
	
		return null;

	
	}
}
