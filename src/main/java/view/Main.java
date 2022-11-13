package view;

import models.MyMath;
import models.loggers.filelogger.FileLogger;

/*
 *
 * @author Roman Netesa
 *
 */
public class Main {
    public static void main(String[] args) {
        MyMath mm = new MyMath();

        System.out.println(mm.min(6.5, 7));
        System.out.println(mm.pow(2, 4));

        FileLogger filelogger;


        filelogger = new FileLogger();


        filelogger.info("hello my name is Gorogo");
        filelogger.info("hello my name is Gorogo");
        filelogger.info("hello my name is Gorogo");
        filelogger.info("hello my name is Gorogo");
        System.out.println(filelogger.getFileLoggerConfig().getFile());

    }
}
