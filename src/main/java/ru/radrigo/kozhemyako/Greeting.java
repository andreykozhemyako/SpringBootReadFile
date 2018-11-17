package ru.radrigo.kozhemyako;


public class Greeting {
    private String file, file2;
    private String content;

    public String getFile() {
        return this.file;
    }

    public void setFile(String file) throws InterruptedException {
        this.file = file;
        PropertyReader readerOne = new PropertyReader("D:\\Users\\AKozhemyako\\IdeaProjects\\HelloWordSpringBoot\\src\\main\\resources\\properties\\" + this.file);
        readerOne.start();
        readerOne.join();
    }

    public String getFile2() {
        return this.file2;

    }

    public void setFile2(String file2) throws InterruptedException {
        this.file2 = file2;
        PropertyReader readerTwo = new PropertyReader("D:\\Users\\AKozhemyako\\IdeaProjects\\HelloWordSpringBoot\\src\\main\\resources\\properties\\" + this.file2);
        readerTwo.start();
        readerTwo.join();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }


}
