package hello.core.singleton;

public class SingletonService {

    // 실생시 한번만 생성됨
    private static final SingletonService instance = new SingletonService();

    public static SingletonService getInstance(){
        return instance;
    }

    // 외부에서 만들지 못하도록 생성자를 private로 만들기
    private SingletonService() {
    }

    public void logic() {
        System.out.println("싱글톤 객체 로직 호출");
    }
}

