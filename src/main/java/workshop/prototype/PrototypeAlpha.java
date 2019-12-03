package workshop.prototype;

import java.util.ArrayList;
import java.util.List;

class PrototypeAlpha implements Prototype {
    private String name = "AlphaVersion";

    String actorName;
    List<String> movies;

    public PrototypeAlpha(PrototypeAlpha prototypeAlpha) {
        actorName = prototypeAlpha.actorName;
        movies = new ArrayList<>(prototypeAlpha.movies);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Prototype clone() {
        return new PrototypeAlpha(this);
    }

    @Override
    public void execute() {

    }

}
