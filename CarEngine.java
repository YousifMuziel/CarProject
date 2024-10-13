public class CarEngine {
    private static final int CC_FROM_HP = 15;
    private static final int RADIANS_PER_SECOND = 5252;

    private String companyName;
    private float horsePower;
    private float engineDisplacement;
    private int numCylinders;
    private int stroke;
    private int boreSize;
    private int speed;
    private int torque;

    public CarEngine() {
        companyName = "Unknown";
        horsePower = 0;
        engineDisplacement = 0;
        numCylinders = 0;
        stroke = 0;
        boreSize = 0;
        speed = 0;
        torque = 0;
    }

    public CarEngine(String companyName, int torque, int speed, int boreSize, int stroke, int numCylinders) {
        this();
        this.companyName = (companyName != null) ? companyName : "Unknown";
        setTorque(torque);
        setSpeed(speed);
        setBoreSize(boreSize);
        setStroke(stroke);
        setNumCylinders(numCylinders);
        setHorsePower(true);
    }

    private float calculateHorsePowerFromTorque() {
        return torque * speed / RADIANS_PER_SECOND;
    }

    private float calculateEngineDisplacement() {
        float radiusSquared = (boreSize / 2f) * (boreSize / 2f);
        return (float) (Math.PI * radiusSquared * stroke * numCylinders);
    }

    private float calculateHorsepowerFromDisplacement() {
        return engineDisplacement / CC_FROM_HP;
    }

    public void setCompanyName(String companyName) {
        this.companyName = (companyName != null) ? companyName : "Unknown";
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setHorsePower(boolean fromDisplacement) {
        if (fromDisplacement) {
            engineDisplacement = calculateEngineDisplacement();
            horsePower = calculateHorsepowerFromDisplacement();
        } else {
            horsePower = calculateHorsePowerFromTorque();
        }
    }

    public void setTorque(int torque) {
        this.torque = (torque >= 0) ? torque : 0;
    }

    public int getTorque() {
        return torque;
    }

    public void setBoreSize(int boreSize) {
        this.boreSize = (boreSize >= 0 && boreSize <= 100) ? boreSize : 0;
    }

    public int getBoreSize() {
        return boreSize;
    }

    public void setStroke(int stroke) {
        this.stroke = (stroke >= 0 && stroke <= 100) ? stroke : 0;
    }

    public int getStroke() {
        return stroke;
    }

    public void setSpeed(int speed) {
        this.speed = (speed >= 0) ? speed : 0;
    }

    public int getSpeed() {
        return speed;
    }

    public void setNumCylinders(int numCylinders) {
        this.numCylinders = (numCylinders >= 0 && numCylinders <= 8) ? numCylinders : 0;
    }

    public int getNumCylinders() {
        return numCylinders;
    }

    public float getHorsePower() {
        return horsePower;
    }

    public float getEngineDisplacement() {
        return engineDisplacement;
    }
}
