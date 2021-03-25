package wzorce_projektowe.adapter;

public class HdmiToUsbAdapter implements HdmiToUsb {
    private Hdmi hdmi;

    public HdmiToUsbAdapter(Hdmi hdmi) {
        this.hdmi = hdmi;
    }

    // metody wykorzystujące obiekt niepasujący (wejściowy)
    @Override
    public void connect() {
        hdmi.connect();
        System.out.println("Sygnał przetworzony");
    }
}