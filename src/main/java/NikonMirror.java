public class NikonMirror implements MirrorOperations {
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
        return "Nikon Mirror";
    }
}
