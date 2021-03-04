package pe.com.peru.main;


import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.util.IOUtils;

public class CommonUtil {

    public static final String PREFIX = "tempfile";
    public static final String SUFFIX = ".xlsx";

    public static File stream2file (InputStream in) throws IOException {
        final File tempFile = File.createTempFile(PREFIX, SUFFIX);
        tempFile.deleteOnExit();
        try (FileOutputStream out = new FileOutputStream(tempFile)) {
            IOUtils.copy(in, out);
        }
        return tempFile;
    }

    public static Date convertStringToDate(String dateInString, String format) {
        DateFormat dateFormat = new SimpleDateFormat(format);
        Date date = null;
        try {
            date = dateFormat.parse(dateInString);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

    public static String convertDateToString(Date stringInDate, String format) {
        DateFormat dateFormat = new SimpleDateFormat(format);
        String strDate = "Date not valid";

        try {
            strDate = dateFormat.format(stringInDate);
        } catch (Exception e) {
            // TODO: handle exception
        }

        return strDate;
    }

    public static String fmt(double d)
    {
        if(d == (long) d)
            return String.format("%d",(long)d);
        else
            return String.format("%s",d);
    }

    public static String validStringNull(Object object) {
        if(object instanceof String)
            return (String) object;

        return "";
    }

    public static String getCurrentTime() {
        return new SimpleDateFormat("ddMMyyyyHHmmssSSS").format(new Date());
    }
}
