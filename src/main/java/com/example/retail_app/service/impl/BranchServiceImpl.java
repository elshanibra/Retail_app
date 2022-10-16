package com.example.retail_app.service.impl;

import com.example.retail_app.dao.entity.BranchEntity;
import com.example.retail_app.dao.entity.StorageEntity;
import com.example.retail_app.dao.repository.BranchRepository;
import com.example.retail_app.model.BranchDto;
import com.example.retail_app.model.StorageDto;
import com.example.retail_app.service.BranchService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BranchServiceImpl implements BranchService {
private final BranchRepository branchRepository;

    public BranchServiceImpl(BranchRepository branchRepository) {
        this.branchRepository = branchRepository;
    }

    @Override
    public void add(BranchDto branchDto) {
        BranchEntity branchEntity = new BranchEntity();
        branchEntity.setName(branchDto.getName());
        branchEntity.setAddress(branchDto.getBranchAddress());
        branchEntity.setSaleType(branchDto.getTypeOfSale());
        branchEntity.setAcceptPayment(branchDto.getAcceptPayment());
        branchEntity.setStorage((List<StorageEntity>) branchDto.getStorage());
        branchRepository.save(branchEntity);


    }

    @Override
    public List<StorageDto> findById(Long id) {
        return null;
    }
}
