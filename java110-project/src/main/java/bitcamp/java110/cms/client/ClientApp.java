package bitcamp.java110.cms.client;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientApp {
    
    static Scanner keyIn = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
       
        
        while (true) {
            //사용자로 부터 명령어를 입력 받는다
            String requestLine = prompt();
            if(requestLine.toLowerCase().equals("exit"))
              break;
        try (
            // 서버에 연결하기
            Socket socket = new Socket("localhost", 8888);
            
            // 서버에 데이터를 보내고 읽을 도구를 준비하기
            PrintStream out = new PrintStream(
                                new BufferedOutputStream(
                                        socket.getOutputStream()));
            BufferedReader in = new BufferedReader(
                               new InputStreamReader(
                                  socket.getInputStream()));
        ) {
           //입력받은 명령어를 서버에 보낸다
                out.println(requestLine); 
                out.flush();
                while (true) {
                    String responseLine = in.readLine();
                    System.out.println(responseLine);
                    if (responseLine.length() == 0)
                        break;
                }
            }
     
        }
        
        keyIn.close();
    }

    private static String prompt() {
        System.out.print("입력> ");
        return keyIn.nextLine();
    }
}






















