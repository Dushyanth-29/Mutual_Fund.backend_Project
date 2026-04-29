package com.dushyanth.mutualfund.controller;

import com.dushyanth.mutualfund.entity.MutualFund;
import com.dushyanth.mutualfund.service.MutualFundService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/funds")
@CrossOrigin(origins = "*")
public class MutualFundController {

    private final MutualFundService service;

    public MutualFundController(MutualFundService service) {
        this.service = service;
    }

    @PostMapping
    public MutualFund addFund(@RequestBody MutualFund fund) {
        return service.addFund(fund);
    }

    @GetMapping
    public List<MutualFund> getAllFunds() {
        return service.getAllFunds();
    }

    @PutMapping("/{id}")
    public MutualFund updateFund(@PathVariable Long id, @RequestBody MutualFund fund) {
        return service.updateFund(id, fund);
    }

    @DeleteMapping("/{id}")
    public String deleteFund(@PathVariable Long id) {
        service.deleteFund(id);
        return "Deleted";
    }
}