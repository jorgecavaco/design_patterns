package workshop.factorymethod_pattern;

import workshop.factorymethod_pattern.model.GifReader;
import workshop.factorymethod_pattern.model.ImageReader;
import workshop.factorymethod_pattern.model.JpegReader;

public class ImageFactory implements Factory{

    @Override
    public ImageReader makeObject(String format, String image){
        if (format.equals("gif")) {
            return new GifReader(image);
        }
        return new JpegReader(image);
    }
}
