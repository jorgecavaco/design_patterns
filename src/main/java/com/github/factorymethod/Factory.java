package com.github.factorymethod;

import com.github.factorymethod.model.ImageReader;

public interface Factory {
    ImageReader makeObject(String format, String image);
}
