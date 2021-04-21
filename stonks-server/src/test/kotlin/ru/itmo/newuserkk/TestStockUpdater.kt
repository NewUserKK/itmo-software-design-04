package ru.itmo.newuserkk

import ru.itmo.newuserkk.stocks.StockStorage
import ru.itmo.newuserkk.stocks.StockUpdater

class TestStockUpdater(stockStorage: StockStorage) : StockUpdater(stockStorage) {
    override val updateTimeoutMs = 0L
    override val updateDeltas: DoubleArray = doubleArrayOf(1.0)
}
