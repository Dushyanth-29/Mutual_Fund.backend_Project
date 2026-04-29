package com.dushyanth.mutualfund.service;

import com.dushyanth.mutualfund.entity.MutualFund;
import com.dushyanth.mutualfund.repository.MutualFundRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MutualFundService {

    private final MutualFundRepository repository;

    public MutualFundService(MutualFundRepository repository) {
        this.repository = repository;
    }

    public MutualFund addFund(MutualFund fund) {
        return repository.save(fund);
    }

    public List<MutualFund> getAllFunds() {
        return repository.findAll();
    }

    public MutualFund updateFund(Long id, MutualFund fund) {
        MutualFund existing = repository.findById(id).orElseThrow();

        existing.setFundName(fund.getFundName());
        existing.setCategory(fund.getCategory());
        existing.setRiskLevel(fund.getRiskLevel());
        existing.setNav(fund.getNav());
        existing.setReturnsPercentage(fund.getReturnsPercentage());
        existing.setMinimumSip(fund.getMinimumSip());

        return repository.save(existing);
    }

    public void deleteFund(Long id) {
        repository.deleteById(id);
    }
}