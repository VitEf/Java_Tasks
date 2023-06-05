package other;


import utilities.others.FileReader;

public class ReadFile {

        public static void main(String[] args) {
//            try {
//                File myObj = new File("src/test/resources/files/text.txt");
//                Scanner myReader = new Scanner(myObj);
//                while (myReader.hasNextLine()) {
//                    String data = myReader.nextLine();
//                    System.out.println(data);
//                }
//                myReader.close();
//            } catch (FileNotFoundException e) {
//                System.out.println("An error occurred.");
//                e.printStackTrace();
//            }

//            FileReader.fileReader("src/resources/files/list_of_companies.txt");
            FileReader.fileReaderWithCompare("src/resources/files/list_of_companies.txt", "Yurgos");
        }
    }

