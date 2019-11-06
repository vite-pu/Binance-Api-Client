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

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol( String symbol ) {
        this.symbol = symbol;
    }

    public String getBestAskPrice() {
        return bestAskPrice;
    }

    public void setBestAskPrice( String bestAskPrice ) {
        this.bestAskPrice = bestAskPrice;
    }

    public String getBestAskQuantity() {
        return bestAskQuantity;
    }

    public void setBestAskQuantity( String bestAskQuantity ) {
        this.bestAskQuantity = bestAskQuantity;
    }

    public String getBestBidPrice() {
        return bestBidPrice;
    }

    public void setBestBidPrice( String bestBidPrice ) {
        this.bestBidPrice = bestBidPrice;
    }

    public String getBestBidQuantity() {
        return bestBidQuantity;
    }

    public void setBestBidQuantity( String bestBidQuantity ) {
        this.bestBidQuantity = bestBidQuantity;
    }

    public long getLastUpdateId() {
        return lastUpdateId;
    }

    public void setLastUpdateId( long lastUpdateId ) {
        this.lastUpdateId = lastUpdateId;
    }

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
