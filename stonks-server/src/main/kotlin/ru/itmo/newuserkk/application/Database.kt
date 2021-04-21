package ru.itmo.newuserkk.application

import io.ktor.application.*
import org.jetbrains.exposed.sql.Database
import org.jetbrains.exposed.sql.SchemaUtils
import org.jetbrains.exposed.sql.transactions.transaction
import ru.itmo.newuserkk.stocks.OrganizationTable
import ru.itmo.newuserkk.stocks.StockTable
import ru.itmo.newuserkk.user.UserStocksTable
import ru.itmo.newuserkk.user.UserTable

fun Application.configureDatabase() {
    Database.connect(
        url = "jdbc:h2:mem:stonks;DB_CLOSE_DELAY=-1;",
        driver = "org.h2.Driver"
    )

    transaction {
        SchemaUtils.create(
            OrganizationTable,
            UserTable,
            StockTable,
            UserStocksTable
        )
    }
}
