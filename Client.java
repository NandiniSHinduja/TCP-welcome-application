
    
import java.io.*;
import java.util.*;
import java.net.*;
public class Client{
    public static void main(String[] args) throws Exception{
        Socket s=new Socket("localhost",6666);
        DataInputStream din=new DataInputStream(s.getInputStream());
        DataOutputStream dout=new DataOutputStream(s.getOutputStream());
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the username:");
        String username=sc.nextLine();
        System.out.println("Enter the password:");
        String password=sc.nextLine();
        dout.writeUTF(username);
        dout.writeUTF(password);
        String response=din.readUTF();
        System.out.println(response);
        sc.close();
        s.close();
        


    }
    
}    