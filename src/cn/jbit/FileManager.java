package cn.jbit;

import java.io.File;

public class FileManager {
    private String name;//alt+Enter
    private String pwd;//alt+insert

    public FileManager(String name, String pwd) {
        this.name = name;
        this.pwd = pwd;
    }

    public FileManager() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public void copy(File file1, File file2 ){
        System.out.println();
    }

    public static void main(String[] args) {

    }
}
