package telephone;

public class Mobilephone extends TwoWayCommunication{
	private String number;
	
	public Mobilephone (String number) {
		this.number = number;
	}
	
	@Override
	public void call () {
    	System.out.println(number);
    }
	
	public void videocall () {
		System.out.println("Wajah anda tidak layak ditampilkan");
	}
}
