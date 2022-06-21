package files;

import java.io.*;

public class FileAccess{
    public static boolean StoreClass(String fileName,ScoreSheet scoreSheet){
        try{
            FileOutputStream fileOutputStream = new FileOutputStream(fileName);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(scoreSheet);
            objectOutputStream.close();
            fileOutputStream.close();
            return true;
        }
        catch(Exception e){
            return false;
        }
    }

    public static ScoreSheet LoadClass(String fileName){
        ScoreSheet scoreSheet = new ScoreSheet();
        try{
            FileInputStream fileInputStream = new FileInputStream(fileName);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            scoreSheet = (ScoreSheet) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        if (scoreSheet.getMatchName() == null) {
            return new ScoreSheet();
        }
        return scoreSheet;
    }
}