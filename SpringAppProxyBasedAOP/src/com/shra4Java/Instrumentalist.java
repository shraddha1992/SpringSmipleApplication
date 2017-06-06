package com.shra4Java;

public class Instrumentalist implements Performer{

	private Instrument instrument;
	
	public Instrument getInstrument() {
		return instrument;
	}

	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}

	public void perform() throws PerformanceException {
		// TODO Auto-generated method stub
		
		instrument.play();
		// throw new PerformanceException("Money Back!!");
		
	}
	

}
