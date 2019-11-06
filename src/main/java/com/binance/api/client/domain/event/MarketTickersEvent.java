package com.binance.api.client.domain.event;

import com.binance.api.client.constant.BinanceApiConstants;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MarketTickersEvent {
    @JsonProperty("s")
    private String symbol;

    @JsonProperty("a")
    private String bestAskPrice;

    @JsonProperty("A")
    private String bestAskQuantity;

    @JsonProperty("b")
    private String bestBidPrice;

    @JsonProperty("B")
    private String bestBidQuantity;

    @JsonProperty("u")
    private long lastUpdateId;

    @Override
    public String toString() {
        return new ToStringBuilder(this, BinanceApiConstants.TO_STRING_BUILDER_STYLE)
                .append("symbol", symbol)
                .append("bestAskPrice", bestAskPrice)
                .append("bestAskQuantity", bestAskQuantity)
                .append("bestBidPrice", bestBidPrice)
                .append("bestBidQuantity", bestBidQuantity)
                .append("lastUpdateId", lastUpdateId)
                .toString();
    }
}
