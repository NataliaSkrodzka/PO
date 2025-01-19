public abstract class ComputerGraphic {
    private double width;
    private double height;
    private String fileName;

    public abstract String loadFile();
    public abstract String saveFile(String file);
}
