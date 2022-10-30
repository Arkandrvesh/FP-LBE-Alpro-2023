package telephone;

class Telephone extends TwoWayCommunication{
    private String number;
    
    
    public Telephone (String number) {
    	this.number = number;
    }
    
    @Override
	public void call () {
    	System.out.println(number);
    }
}