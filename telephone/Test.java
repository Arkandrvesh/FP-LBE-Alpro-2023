package telephone;

public class Test {
TwoWayCommunication [] twc;
	
	void setUp() throws Exception {
		twc = new TwoWayCommunication[2];
		
		twc[0] = new Telephone("777");
		twc[1] = new Mobilephone("666");
	}

	Mobilephone mobile = new Mobilephone ("69696");
	
	void main() {
		twc[0].call();
		twc[1].call();
		mobile.videocall();
	}
}
