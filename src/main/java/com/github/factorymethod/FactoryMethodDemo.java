package com.github.factorymethod;

import com.github.factorymethod.model.DecodedImage;
import com.github.factorymethod.model.GifReader;
import com.github.factorymethod.model.ImageReader;

public class FactoryMethodDemo {
    public static void main(String[] args) throws CloneNotSupportedException {

        GifReader g = new GifReader("");

        g.clone();

        DecodedImage decodedImage;
        ImageReader reader = null;
        String image = args[0];
        String format = image.substring(image.indexOf('.') + 1, (image.length()));

        reader = new ImageFactory().makeObject(format , image);

        assert reader != null;
        decodedImage = reader.getDecodeImage();
        System.out.println(decodedImage);
    }
}
