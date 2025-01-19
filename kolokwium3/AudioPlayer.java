public class AudioPlayer implements MediaPlayer{
    private String trackName;
    @Override
    public void play(String trackName) {
        System.out.printf("sluchasz: "+trackName);
    }

    @Override
    public void pause() {
        System.out.printf("wciśnięto pauzę");
    }

    @Override
    public String getCurrentTrack() {
        return "obecnie słuchasz: "+trackName;
    }
}
