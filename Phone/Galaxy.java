public class Galaxy extends Phone implements Ringable {
    public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
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
        System.out.println("This phone is a Galaxy "+this.getVersionNumber()+" with "+this.getBatteryPercentage()+"% battery remaining from "+this.getCarrier()+".");
    }
}