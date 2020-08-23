package edu.ecnu;

import com.wf.captcha.ChineseCaptcha;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException {

        File directory = new File("");//参数为空
        String author =directory.getAbsolutePath();//绝对路径;
        System.out.println(
               author
        );
        File dir = new File(author+"/capt");//参数为空
        dir.mkdir();

        for (int i = 0; i < 100; i++) {
            ChineseCaptcha captcha = new ChineseCaptcha();
            System.out.println(captcha.text());
            File file = new File(author+"/capt",captcha.text()+".png");

            captcha.out(new FileOutputStream(file));
        }

    }
}
