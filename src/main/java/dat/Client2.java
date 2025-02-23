package dat;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client2
{

    private static final String IP = "192.168.7.191";
    public static void main(String[] args)
    {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        System.out.println("Starting extra ChatClient");
        Client client = new Client(IP, 9090, executorService);
        executorService.submit(client);
    }
}
