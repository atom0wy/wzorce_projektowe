package wzorce_projektowe.adapter.exercise;

public class AdapterImpl implements Adapter{

    // obiekt wejściowy w naszym przypadku DocConverter, HtmlConverter lub TxtConverter
    private final Converter converter;

    public AdapterImpl(Converter converter) {
        this.converter = converter;
    }

    @Override
    public void convert() {

    }
}
