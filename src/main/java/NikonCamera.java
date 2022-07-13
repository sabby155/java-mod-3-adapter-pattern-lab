public class NikonCamera extends Camera implements CameraAdapter {

    public NikonCamera(FilmOperations filmOps, ShutterOperations shutterOps, MirrorOperations mirrorOps) {
        super(filmOps, shutterOps, mirrorOps);
    }

    @Override
    public String getName() {
        return "Nikon";
    }
}
