package workshop.prototype;

import java.util.ArrayList;
import java.util.List;

class PrototypeModule {
    // 2. "registry" of prototypical objs
    private static List<Prototype> prototypes = new ArrayList<>();

    // Adds a feature to the Prototype attribute of the PrototypesModule class
    // obj  The feature to be added to the Prototype attribute
    public static void addPrototype(Prototype p) {
        prototypes.add(p);
    }

    public static Prototype createPrototype(String name) {
        for (Prototype p : prototypes) {
            if (p.getName().equals(name)) {
                return p.clone();
            }
        }
        throw new RuntimeException (name + ": doesn't exist");
    }
}