public class IPhone extends Phone implements Ringable {
    public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    
    @Override
    public String ring() {
        return this.getRingTone();
    }

    @Override
    public String unlock() {
    	return "Unlocked!";
    }

    @Override
    public void displayInfo() {
    	System.out.println("This phone is an iPhone "+this.getVersionNumber()+" with "+this.getBatteryPercentage()+"% battery remaining from "+this.getCarrier()+".");          
    }
}