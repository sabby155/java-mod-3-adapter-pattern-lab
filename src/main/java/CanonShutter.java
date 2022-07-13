public class CanonShutter implements ShutterOperations {
    @Override
    public void setShutterSpeedSetting(double shutterSpeed) {
        Logger.getInstance().log(getName() + " has set its speed to " + shutterSpeed + " seconds");
    }

    @Override
    public void initializeShutter() {
        Logger.getInstance().log(getName() + " has been initialized");
    }

    @Override
    public void activateShutter() {
        Logger.getInstance().log(getName() + " has been activated");
    }

    @Override
    public void releaseShutter() {
        Logger.getInstance().log(getName() + " has been released");
    }

    @Override
    public String getName() {
        return "Canon Shutter";
    }
}
