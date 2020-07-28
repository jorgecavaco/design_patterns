package com.github.factorymethod;

import com.github.factorymethod.model.GifReader;
import com.github.factorymethod.model.ImageReader;
import com.github.factorymethod.model.JpegReader;

public class ImageFactory implements Factory{

    @Override
    public ImageReader makeObject(String format, String image){
        if (format.equals("gif")) {
            return new GifReader(image);
        }
        return new JpegReader(image);
    }
}
