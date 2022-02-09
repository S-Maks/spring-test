package core;

import java.io.File;
import java.io.IOException;

public class FileWrapper {
    private String nameFile;

    public FileWrapper(String name) {
        nameFile = name;
    }

    public static void createFile(String name) {
        File file = new File(name);
        try {
            file.createNewFile();
        } catch (IOException e) {
            System.err.println("Ошибка создания файла " + name);
        }
    }

    public boolean checkFile() {
        File file = new File(nameFile);
        return file.exists();
    }

    public void showCanonicalPath() {
        File file = new File(nameFile);
        try {
            System.out.println(file.getCanonicalPath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
