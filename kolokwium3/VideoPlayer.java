public class VideoPlayer implements MediaPlayer{
    private String trackName;
    @Override
    public void play(String trackName) {
        System.out.printf("oglądasz: "+trackName);
    }

    @Override
    public void pause() {
        System.out.printf("wciśnięto pauzę");
    }

    @Override
    public String getCurrentTrack() {
        return "obecnie oglądasz: "+trackName;
    }
}
