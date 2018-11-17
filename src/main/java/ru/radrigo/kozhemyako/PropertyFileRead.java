package ru.radrigo.kozhemyako;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileRead {
    String path;


    public PropertyFileRead(String path) {
        this.path = path;
        //System.out.println(this.path);
    }

    synchronized void readFile() {

        FileInputStream fis;
        Properties property = new Properties();

        try {
            fis = new FileInputStream(this.path);
            property.load(fis);
            //property.list(System.out);
            boolean isComEnding = this.path.endsWith("personA.properties");
            //System.out.println(isComEnding);
            if (isComEnding == true) {
                System.out.println(new String(property.getProperty("FIO").getBytes("ISO8859-1")));
                System.out.println(new String(property.getProperty("DOB").getBytes("ISO8859-1")));
                System.out.println(new String(property.getProperty("phone").getBytes("ISO8859-1")));
                System.out.println(new String(property.getProperty("email").getBytes("ISO8859-1")));
                System.out.println(new String(property.getProperty("skype").getBytes("ISO8859-1")));
                System.out.println(property.getProperty("avatar"));
            } else {
                System.out.println();
                System.out.println(new String(property.getProperty("target").getBytes("ISO8859-1")));
                System.out.println(new String(property.getProperty("experiences").getBytes("ISO8859-1")));
                System.out.println(new String(property.getProperty("educations").getBytes("ISO8859-1")));
                System.out.println(new String(property.getProperty("additional_educations").getBytes("ISO8859-1")));
                System.out.println(new String(property.getProperty("skills").getBytes("ISO8859-1")));
            }
        } catch (IOException e) {
            System.err.println("ОШИБКА: Один из файлов свойств отсуствует!");
        }
    }
}
