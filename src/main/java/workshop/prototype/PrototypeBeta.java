package workshop.prototype;

class PrototypeBeta implements Prototype {
    private String name = "BetaVersion";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Prototype clone() {
        return new PrototypeBeta();
    }

    @Override
    public void execute() {

    }

}