package workshop.factorymethod_pattern;

import workshop.factorymethod_pattern.model.ImageReader;

public interface Factory {
    ImageReader makeObject(String format, String image);
}
