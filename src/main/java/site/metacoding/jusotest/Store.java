package site.metacoding.jusotest;

//Redis를 사용해야한다. 혹은 세션 저장소
// 모든 클라이언트들이 공유해서 쓰기 때문에 이렇게 하면 안된다.
// 지금은 연습이니까!
public class Store {
    public static String roadFullAddr;
}
