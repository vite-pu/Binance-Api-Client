package com.binance.api.client.domain.event;

import com.binance.api.client.domain.market.OrderBookEntry;

import java.util.List;

public class DepthEvent5 {
    private long lastUpdateId;
    private List<OrderBookEntry> bids;
    private List<OrderBookEntry> asks;

    public long getLastUpdateId() {
        return lastUpdateId;
    }

    public void setLastUpdateId( long lastUpdateId ) {
        this.lastUpdateId = lastUpdateId;
    }

    public List<OrderBookEntry> getBids() {
        return bids;
    }

    @Override
    public String toString() {
        return "DepthEvent5{" +
                "lastUpdateId=" + lastUpdateId +
                ", bids=" + bids +
                ", asks=" + asks +
                '}';
    }

    public void setBids( List<OrderBookEntry> bids ) {
        this.bids = bids;
    }

    public List<OrderBookEntry> getAsks() {
        return asks;
    }

    public void setAsks( List<OrderBookEntry> asks ) {
        this.asks = asks;
    }
}
