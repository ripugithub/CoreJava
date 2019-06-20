package com.hitachi.topics.designPatterns.adapterPattern;

public class SocketClassAdapterImpl extends Socket implements SocketAdapter {

	@Override
	public Volts get120Volts() {
		return getVoltage();
	}

	@Override
	public Volts get12Volts() {
		Volts v = new Volts();
		return convertVolt(v, 10);
	}

	@Override
	public Volts get3Volts() {
		return null;
	}
	
	private Volts convertVolt(Volts v, int i) {
		return new Volts(v.getVolts()/i);
	}

}
