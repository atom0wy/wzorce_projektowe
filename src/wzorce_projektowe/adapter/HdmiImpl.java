package wzorce_projektowe.adapter;

public class HdmiImpl implements Hdmi {
    @Override
    public void connect() {
        System.out.println("Sygnał z HDMI");
    }
}