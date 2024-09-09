package com.pcwk.ehr.di02;

import com.pcwk.ehr.cmn.PLog;

public class SamsungTv implements PLog, Tv {

	final String brand = "삼성 Tv";
	
	public SamsungTv() {
		log.debug("SamsungTv() 생성자 호출!");
	}
	
	@Override
	public void powerOn() {
		log.debug(brand+" power on!");
	}
	
	@Override
	public void powerOff() {
		log.debug(brand+" power off!");
	}
	
	@Override
	public void volumeUp() {
		log.debug(brand +" volume up!");
	}
	
	
	@Override
	public void volumeDown() {
		log.debug(brand +" volume down!");
	}	
	
	
}
