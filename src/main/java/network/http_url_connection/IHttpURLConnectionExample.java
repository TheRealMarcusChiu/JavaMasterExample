package network.http_url_connection;

public interface IHttpURLConnectionExample {

    String executeGet(String targetURL);

    String executePost(String targetURL, String parameters);

    String executePut(String targetURL, String parameters);

    String executeDelete(String targetURL, String parameters);

}