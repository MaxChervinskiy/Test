package Chervinskiy.Maxim;

import java.util.concurrent.ExecutionException;

/**
 * Created by maxch on 10.11.2016.
 */
public class Multip implements Iactions {

    @Override
    public Integer func(Integer a, Integer b) {
        return a*b;
    }

    @Override
    public Double func(Double a, Double b) {
        return a*b;
    }

    @Override
    public Float func(Float a, Float b) {
        return a*b;
    }

    @Override
    public String func(String a, String b) throws Exception {
        throw new Exception();
    }
}
