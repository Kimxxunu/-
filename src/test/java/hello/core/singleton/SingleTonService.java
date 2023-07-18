package hello.core.singleton;

public class SingleTonService {

    private static final SingleTonService instance = new SingleTonService();
    public static SingleTonService getInstance(){
        return instance;
    }

    private SingleTonService(){

    }

    public static void main(String[] args) {
        SingleTonService singleTonService1 = new SingleTonService();
        SingleTonService singleTonService2 = new SingleTonService();
    }

}
