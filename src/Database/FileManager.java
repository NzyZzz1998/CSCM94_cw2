package Database;

import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

public class FileManager {

    public static void writeToFile(String filename, String data) {
        try {
            FileWriter writer = new FileWriter(filename, true);
            BufferedWriter bw = new BufferedWriter(writer);
            bw.newLine();
            bw.write(data);
            bw.flush();
            bw.close();
            System.out.println("Successfuly wrote " + data + " to " + filename);
        } catch (IOException e) {
            System.out.println("An error occurred");
        }
    }


    public static void readOrderHistory(String filename, String customerID) throws IOException {
        ArrayList<String> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(filename));
        Scanner reader = new Scanner(br);
        while (reader.hasNextLine()) {
            list.add(reader.nextLine());
        }
        reader.close();
        for (int i = 0; i < list.size(); i++) {
            String[] split = list.get(i).split(" ");
            if (split[1].equals(customerID)){
                System.out.println(split[3]);
                System.out.println(split[8]);
            }
        }
    }

    public static String[][] readFromFile(String filename, int n) {
        ArrayList<String> list = new ArrayList<>();
        try {
            File myObj = new File(filename);
            Scanner reader = new Scanner(myObj);
            while (reader.hasNextLine()) {
                list.add(reader.nextLine());
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }

        for (int i = 0; i < list.size(); i++) {
            //System.out.println("Line read: " + list.get(i));
        }

        String[][] output = new String[list.size()][n];
        //String[] temp = new String[n];
        for (int i = 0; i < list.size(); i++){
            String[] temp = list.get(i).split("\\|");
            for (int j = 0; j < n; j++){
                //System.out.println(temp[j]);
                output[i][j] = temp[j];
            }
        }
        return output;
    }
}
