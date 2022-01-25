package ru.gcall.thenewboston.service

import io.mockk.mockk
import io.mockk.verify
import org.junit.jupiter.api.Test
import ru.gcall.thenewboston.datasource.BankDataSource

internal class BankServiceTest {

    private val dataSource: BankDataSource = mockk(relaxed = true)

    private val bankService = BankService(dataSource)

    @Test
    fun `should call its data source to retrieve data`() {
//        every { dataSource.retrieveBanks() } returns emptyList()

        bankService.getBanks()

        verify(exactly = 1) { dataSource.retrieveBanks() }
    }
}