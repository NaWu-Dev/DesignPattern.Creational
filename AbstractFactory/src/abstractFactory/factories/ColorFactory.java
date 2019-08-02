package abstractFactory.factories;

import abstractFactory.colorFamily.Black;
import abstractFactory.colorFamily.Brown;
import abstractFactory.colorFamily.Color;
import abstractFactory.colorFamily.White;

public class ColorFactory implements AbstractFactory<Color> {
    @Override
    public Color create(String color) {

        if ("White".equalsIgnoreCase(color)) {
            return  new White();
        } else if ("Brown".equalsIgnoreCase(color)) {
            return new Brown();
        } else if ("Black".equalsIgnoreCase(color)) {
            return new Black();
        }

        return null;
    }
}
