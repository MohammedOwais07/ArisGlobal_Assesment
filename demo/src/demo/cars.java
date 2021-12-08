package demo;

public class cars {
	private String doors;
	private String engine;
	private String driver;
	private int speed;
	
	
	public void setDoor(String doors) {
		this.doors=doors;
	}
	public String getDoor() {
		return doors;
	}
	public String getEngine() {
		return engine;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	public String getDriver() {
		return driver;
	}
	public void setDriver(String driver) {
		this.driver = driver;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	@Override
	public String toString() {
		return "cars {doors=" + doors + " ,engine=" +engine+ " ,speed="+speed+",driver="+driver+" }";
	}
	
	

}
