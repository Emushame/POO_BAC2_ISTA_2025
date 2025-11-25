import  java.io.*;

public class Main {
    public static void main(String[] args) {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        double temperaturePiece;
        try {
            temperaturePiece = Double.parseDouble(rd.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(temperaturePiece);
    }
}