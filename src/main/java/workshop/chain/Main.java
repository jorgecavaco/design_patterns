package workshop.chain;


import java.util.Random;

class HandlerChain {
    private final static Random RANDOM = new Random();
    private static int nextID = 1;
    private int id = nextID++;
    private HandlerChain nextInChain;

    public void add(HandlerChain next) {
        if (nextInChain == null) {
            nextInChain = next;
        } else {
            nextInChain.add(next);
        }
    }

    public void wrapAround(HandlerChain root) {
        if (nextInChain == null) {
            nextInChain = root;
        } else {
            nextInChain.wrapAround(root);
        }
    }

    public void execute(int num) {
        if (RANDOM.nextInt(4) != 0) {
            System.out.println("   " + id + "-busy  ");
            nextInChain.execute(num);
        } else {
            System.out.println(id + "-handled-" + num);
        }
    }
}
public class Main {

    public static void main(String[] args) {
        HandlerChain rootChain = new HandlerChain();
        rootChain.add(new HandlerChain());
        rootChain.add(new HandlerChain());
        rootChain.add(new HandlerChain());
        rootChain.wrapAround(rootChain);

        for (int i = 1; i < 6; i++) {
            System.out.println("Operation #" + i + ":");
            rootChain.execute(i);
            System.out.println();
        }
    }
}
