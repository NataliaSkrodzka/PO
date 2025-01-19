public class Bitmap extends ComputerGraphic{
    private String file="Bitmapa";
    @Override
    public String loadFile() {
        return file;
    }

    @Override
    public String saveFile(String file) {
        this.file=file;
        return "Zapisano";
    }
}
