public class CanonFilm implements FilmOperations {

    @Override
    public void engageFilmMechanism() {
        Logger.getInstance().log(getName() + " has engaged");
    }

    @Override
    public void rollFilm() {
        Logger.getInstance().log(getName() + " has rolled");
    }

    @Override
    public void releaseFilmMechanism() {
        Logger.getInstance().log(getName() + " has been released");
    }

    @Override
    public String getName() {
        return "Canon Film";
    }
}
