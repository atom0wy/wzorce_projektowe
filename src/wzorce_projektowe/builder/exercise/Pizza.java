package wzorce_projektowe.builder.exercise;

import wzorce_projektowe.builder.Computer;

public class Pizza {
    private String skladnik;
    private String ciasto;
    private String sos;
    private boolean czyBiala;
    private boolean ostra;
    private int dodatkowaWielkosc;
    private Size size;

    private Pizza(PizzaBuilder pizzaBuilder) {
        this.skladnik = pizzaBuilder.skladnik;
        this.ciasto = pizzaBuilder.ciasto;
        this.sos = pizzaBuilder.sos;
        this.czyBiala = pizzaBuilder.czyBiala;
        this.ostra = pizzaBuilder.ostra;
        this.dodatkowaWielkosc = pizzaBuilder.dodatkowaWielkosc;
        this.size = pizzaBuilder.size;
    }

    public String getSkladnik() {
        return skladnik;
    }

    public String getCiasto() {
        return ciasto;
    }

    public String getSos() {
        return sos;
    }

    public boolean isCzyBiala() {
        return czyBiala;
    }

    public boolean isOstra() {
        return ostra;
    }

    public int getDodatkowaWielkosc() {
        return dodatkowaWielkosc;
    }

    public Size getSize() {
        return size;
    }

    public Pizza setSize(Size size) {
        this.size = size;
        return this;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "skladnik='" + skladnik + '\'' +
                ", ciasto='" + ciasto + '\'' +
                ", sos='" + sos + '\'' +
                ", czyBiala=" + czyBiala +
                ", ostra=" + ostra +
                ", dodatkowaWielkosc=" + dodatkowaWielkosc +
                ", size=" + size +
                ", diameter=" + size.diameter +
                '}';
    }

    public static class PizzaBuilder {
        //wymagane elementy
        private String skladnik;
        private String ciasto;
        private String sos;

        //dodatkowe (opcjonalne) elementy
        private boolean czyBiala;
        private boolean ostra;
        private int dodatkowaWielkosc;
        private Size size;

        public PizzaBuilder(String skladnik, String ciasto, String sos) {
            this.skladnik = skladnik;
            this.ciasto = ciasto;
            this.sos = sos;
        }

        public PizzaBuilder setCzyBiala(boolean czyBiala) {
            this.czyBiala = czyBiala;
            return this;
        }

        public PizzaBuilder setOstra(boolean ostra) {
            this.ostra = ostra;
            return this;
        }

        public PizzaBuilder setDodatkowaWielkosc(int dodatkowaWielkosc) {
            this.dodatkowaWielkosc = dodatkowaWielkosc;
            return this;
        }

        public PizzaBuilder setSize(wzorce_projektowe.builder.exercise.Size size) {
            this.size = size;
            return this;
        }

        public Pizza build() {
            return new Pizza(this);
        }

    }
}