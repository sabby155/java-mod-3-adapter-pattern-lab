public class CanonMirror implements MirrorOperations {
    @Override
    public void openMirror() {
        Logger.getInstance().log((getName() + " is open"));
    }

    @Override
    public void closeMirror() {
        Logger.getInstance().log((getName() + " is closed"));
    }

    @Override
    public String getName() {
        return "Canon Mirror";
    }
}
