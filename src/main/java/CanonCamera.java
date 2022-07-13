public class CanonCamera extends Camera implements CameraAdapter {

    public CanonCamera(FilmOperations filmOps, ShutterOperations shutterOps, MirrorOperations mirrorOps) {
        super(filmOps, shutterOps, mirrorOps);
    }

    @Override
    public String getName() {
        return "Canon";
    }
}
