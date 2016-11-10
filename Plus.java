package Chervinskiy.Maxim;

/**
 * Created by maxch on 10.11.2016.
 */
public class Plus implements Iactions {
    @Override
    public Integer func(Integer a, Integer b) {
        return a+b;
    }

    @Override
    public Double func(Double a, Double b) {
        return a+b;
    }

    @Override
    public Float func(Float a, Float b) {
        return a+b;
    }

    @Override
    public String func(String a, String b) {
        return a+b;
    }

}
