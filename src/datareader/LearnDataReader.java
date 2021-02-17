package datareader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LearnDataReader {

    //Path/Location
    //Absolute Path: Full path (right click on File>> Copy Path>> Absolute path
    //is Static
    //C:\Users\Nikolay\IdeaProjects\LearnInClass\DataTest\Text
    //will work only in my computer

    //Relative Path: Partial path(will work for each PC), it is Dynamic
    //
    //DataTest/Text
    public static void main(String[] args) throws IOException {
        readData();
    }
        public static void readData() {
            FileReader fileReader= null;
            BufferedReader bufferedReader=null;// Class extends Reader
            String filePath="../LearnInClass/DataTest/Text/Text.txt";// ../ProjectName/Relative path/fileName.txt;
            // ../ -means system will look everywhere inside PC

            try{
                fileReader=new FileReader(filePath);
                bufferedReader=new BufferedReader(fileReader);//then we need to Iterete the data
                String data;
                while((data =bufferedReader.readLine())!= null){//
                    System.out.println(data);
                }
            }catch(FileNotFoundException e) {
                System.out.println("File not found Exception");
            }catch (IOException e){
                e.printStackTrace();
            }finally {
                try{
                    fileReader.close();
                    bufferedReader.close();
                }catch(Exception e){
                    System.out.println("File closed");
                }
            }
        }
    }













