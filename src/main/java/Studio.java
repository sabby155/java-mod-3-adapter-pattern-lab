public class Studio {

    public static void main(String[] args) {

        CameraFactory myCameraFactory = new CameraFactory();

        Camera myCamera = myCameraFactory.makeCamera(CameraFactory.CameraManufacturer.CANON_FILM);

        DigitalCamera myDigitalCamera = myCameraFactory.makeDigitalCamera(CameraFactory.CameraManufacturer.CANON_FILM);

        Photographer myPhotographer = new Photographer(myCamera);

        myPhotographer.takePhotograph();

    }


}


