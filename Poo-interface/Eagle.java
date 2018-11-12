public class Eagle extends Bird implements Fly{

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }
    
    
    //interface

	
    @Override
	public int ascend(int meters) {
    	 if (this.flying) {
             this.altitude = Math.max(this.altitude + meters, 120);
             System.out.printf("%s flies upward, altitude : %d%n", this.getName(), this.altitude);
         }
         return this.altitude;
     }


	@Override
	public int descend(int meters) {
		if (this.flying) {
            this.altitude = Math.min(this.altitude - meters, 10);
            System.out.printf("%s flies downward, altitude : %d%n", this.getName(), this.altitude);
        }
        return this.altitude;
    }

	@Override
	public void land() {
		if (this.flying && this.altitude == 0) {
            System.out.printf("%s land on the ground.%n", this.getName());
        } else {
            System.out.printf("%s is too high, it can't land.%n", this.getName());
        }
    }
		

	@Override
	public void glide() {
		System.out.println("it glides into the air");
	}
        

	@Override
	public void takeOff() {
		if (!this.flying && this.altitude == 0) {
            this.flying = true;
            System.out.println(this.getName() + " take off in the sky");
		}
	}
}	

