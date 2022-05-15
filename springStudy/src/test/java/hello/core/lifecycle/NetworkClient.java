package hello.core.lifecycle;

public class NetworkClient {
    private String url;


    public NetworkClient() {
        System.out.println("NetworkClient.NetworkClient = " + url);
        connect();
        call("초기화 연결 메세지");
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void connect() {
        System.out.println("NetworkClient.connect = " + url);
    }

    public void call(String message) {
        System.out.println("call = " + url + " message = " + message);
    }


    public void disconnect() {
        System.out.println("close: " + url);
    }
}
