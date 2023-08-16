package ir.kaaveh.data.mapper

import ir.composenews.domain.model.Market
import ir.kaaveh.localdatasource.dto.LocalMarketDto

fun LocalMarketDto.toMarket(): Market = Market(
    id = id,
    name = name,
    currentPrice = currentPrice,
    imageUrl = imageUrl,
    isFavorite = isFavorite,
)

fun Market.toLocalMarketDto(): LocalMarketDto = LocalMarketDto(
    id = id,
    name = name,
    currentPrice = currentPrice,
    imageUrl = imageUrl,
    isFavorite = isFavorite
)
