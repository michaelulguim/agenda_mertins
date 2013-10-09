package util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Data {

    private String data;

    public Data(String data) {
        String[] dataNova = data.split("-");
        this.data = dataNova[0] + "/" + dataNova[1] + "/" + dataNova[2];
    }

    public static Date strToData(String data) throws ParseException {

        SimpleDateFormat fd = new SimpleDateFormat("yyyy-mm-dd");
        return fd.parse(data);

    }
}
