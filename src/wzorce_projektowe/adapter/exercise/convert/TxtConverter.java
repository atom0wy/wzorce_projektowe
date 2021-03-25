package wzorce_projektowe.adapter.exercise.convert;

import wzorce_projektowe.adapter.exercise.Converter;

public class TxtConverter implements Converter {
    @Override
    public void convert() {
        System.out.println("Convert txt");
    }
}