package com.byildiz.springboot.springkotlinexample.datasource

import com.byildiz.springboot.springkotlinexample.model.Bank

interface BankDataSource {
    fun retrieveBanks(): Collection<Bank>
}