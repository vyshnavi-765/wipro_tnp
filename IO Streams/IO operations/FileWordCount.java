import java.io.*;
import java.util.*;

public class FileWordCount {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter input file name: ");
        String inputFile = sc.nextLine();

        System.out.print("Enter output file name: ");
        String outputFile = sc.nextLine();

        TreeMap<String, Integer> map = new TreeMap<>();

        try {

            BufferedReader br = new BufferedReader(new FileReader(inputFile));

            String line;

            while ((line = br.readLine()) != null) {

                String words[] = line.split("\\s+");

                for (String word : words) {

                    word = word.replaceAll("[^a-zA-Z]", "");

                    if (!word.isEmpty()) {

                        if (map.containsKey(word))
                            map.put(word, map.get(word) + 1);
                        else
                            map.put(word, 1);
                    }
                }
            }

            br.close();

            BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile));

            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                bw.write(entry.getKey() + " : " + entry.getValue());
                bw.newLine();
            }

            bw.close();

            System.out.println("Word count written successfully to " + outputFile);

        } catch (IOException e) {
            System.out.println("Error processing file.");
        }

        sc.close();
    }
}