package workshop.prototype;

public class Main {

    public static void main(String... args) throws CloneNotSupportedException {
        initializePrototypes();
        PrototypeModule.createPrototype("BetaVersion").execute();
        PrototypeModule.createPrototype("BetaVersion").execute();
        PrototypeModule.createPrototype("BetaVersion").execute();
    }


    public static void initializePrototypes() {
    //    PrototypeModule.addPrototype(new PrototypeAlpha());
        PrototypeModule.addPrototype(new PrototypeBeta());
    }
}
