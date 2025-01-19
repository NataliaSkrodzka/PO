public class Vector extends ComputerGraphic{
    private String vector;
    @Override
    public String loadFile() {
        return vector;
    }

    @Override
    public String saveFile(String vector) {
       return "Zapisano";
    }
}
