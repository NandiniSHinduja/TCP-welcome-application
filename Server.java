import java.io.*;
import java.util.*;
import java.net.*;
public class Server{
    public static void main(String[] args) throws Exception{
        ServerSocket ss=new ServerSocket(6666);
        Socket s=ss.accept();
        DataInputStream din=new DataInputStream(s.getInputStream());
        DataOutputStream dout=new DataOutputStream(s.getOutputStream());
        String password="meow123";
        String username="Charlotte";
        String uname=din.readUTF();
        String pword=din.readUTF();
        if(uname.equals(username)){
            if(pword.equals(password)){
                dout.writeUTF("WELCOME");
            }
            else{
                dout.writeUTF("Invalid password");
            }
        }
        else{
            dout.writeUTF("Invalid username");
        }
        s.close();
        ss.close();

        
    }
}