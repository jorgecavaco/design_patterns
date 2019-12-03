package workshop.factorymethod_pattern.model;

public class GifReader implements ImageReader, Cloneable {
    private DecodedImage decodedImage;

    public GifReader(String image) {
        this.decodedImage = new DecodedImage(image);
    }

    @Override
    public DecodedImage getDecodeImage() {
        return decodedImage;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}