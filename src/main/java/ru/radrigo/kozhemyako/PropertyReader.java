package ru.radrigo.kozhemyako;

public class PropertyReader extends Thread {
    String path;

    //PropertyReader(PropertyFileRead propertyFileRead){
    //   this.propertyFileRead=propertyFileRead;
    //  //this.start();
    //}
    void statrreadFile() {
        PropertyFileRead propertyFileRead = new PropertyFileRead(this.path);
        propertyFileRead.readFile();
    }

    public PropertyReader(String path) {
        this.path = path;
    }


    @Override
    public void run() {

        try {
            statrreadFile();
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


}