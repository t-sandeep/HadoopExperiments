package com.NYSE.parsers;

public class NYSEParser {
	private String stockTicker;
	private String tradeDate;
	private Float openPrice;
	private Float closePrice;
	private Float highPrice;
	private Float lowPrice;
	private Long volume;
	
	public void parse(String record){
		String[] fields = record.split(",");
		
		stockTicker = fields[0];
		tradeDate = fields[1];
		openPrice = new Float(fields[2]);
		highPrice = new Float(fields[3]);
		lowPrice = new Float(fields[4]);
		closePrice = new Float(fields[5]);
		volume = new Long(fields[6]);
		
	}

	public String getStockTicker() {
		return stockTicker;
	}
	public void setStockTicker(String stockTicker) {
		this.stockTicker = stockTicker;
	}
	public String getTradeDate() {
		return tradeDate;
	}
	public void setTradeDate(String tradeDate) {
		this.tradeDate = tradeDate;
	}
	public Float getOpenPrice() {
		return openPrice;
	}
	public void setOpenPrice(Float openPrice) {
		this.openPrice = openPrice;
	}
	public Float getClosePrice() {
		return closePrice;
	}
	public void setClosePrice(Float closePrice) {
		this.closePrice = closePrice;
	}
	public Float getHighPrice() {
		return highPrice;
	}
	public void setHighPrice(Float highPrice) {
		this.highPrice = highPrice;
	}
	public Float getLowPrice() {
		return lowPrice;
	}
	public void setLowPrice(Float lowPrice) {
		this.lowPrice = lowPrice;
	}
	public Long getVolume() {
		return volume;
	}
	public void setVolume(Long volume) {
		this.volume = volume;
	}

}
