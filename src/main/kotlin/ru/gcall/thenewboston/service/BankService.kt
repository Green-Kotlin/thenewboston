package ru.gcall.thenewboston.service

import org.springframework.stereotype.Service
import ru.gcall.thenewboston.datasource.BankDataSource
import ru.gcall.thenewboston.model.Bank

@Service
class BankService(private val dataSource: BankDataSource) {

    fun getBanks(): Collection<Bank> = dataSource.retrieveBanks()

    fun getBank(accountNumber: String): Bank = dataSource.retrieveBank(accountNumber)
    fun addBank(bank: Bank): Bank = dataSource.createBank(bank)

}