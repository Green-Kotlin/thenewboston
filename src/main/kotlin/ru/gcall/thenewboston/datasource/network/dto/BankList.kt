package ru.gcall.thenewboston.datasource.network.dto

import ru.gcall.thenewboston.model.Bank

data class BankList(
    val results: Collection<Bank>
)
