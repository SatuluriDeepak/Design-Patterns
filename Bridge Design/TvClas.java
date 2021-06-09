
abstract class TV{
	RemoteClass remote;
	public TV(RemoteClass r) {
		super();
		this.remote = r;
	}
	abstract void on();
	abstract void off();
}
class SonyTv extends TV{
	RemoteClass remote;
	public SonyTv(RemoteClass r) {
		super(r);
		this.remote = r;
	}

	@Override
	void on() {
		System.out.print("Sony Tv on : ");
		remote.on();
		
	}

	@Override
	void off() {
		System.out.print("Sony Tv off : ");
		remote.off();
		
	}
	
}
class PhilipsTv extends TV{
	RemoteClass remote;
	public PhilipsTv(RemoteClass r) {
		super(r);
		this.remote = r;
	}

	@Override
	void on() {
		System.out.print("Philips Tv on : ");
		remote.on();
		
	}

	@Override
	void off() {
		System.out.print("Philips Tv off : ");
		remote.off();
		
	}
	
}

