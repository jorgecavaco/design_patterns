package workshop.proxy;

interface I{
    String doIt();
}

class M implements I{
    @Override
    public String doIt() {
        try {
            Thread.sleep(120L);
        } catch (InterruptedException ignore) { }

        return "Random value: " + 20;
    }
}

class ProxyM implements I{

    private I service;

    public ProxyM(I service) {
        this.service = service;
    }

    @Override
    public String doIt() {
        long startTime = System.currentTimeMillis();
        String response = service.doIt();
        System.out.println("Response time: " + (System.currentTimeMillis() - startTime));
        return response;
    }
}

public class ProxyMain {

    public static void main(String[] args) {
        System.out.println(new ProxyM(new M()).doIt());
    }
}
