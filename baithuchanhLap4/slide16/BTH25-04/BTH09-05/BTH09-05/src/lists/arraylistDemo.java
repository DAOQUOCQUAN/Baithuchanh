package lists;

import java.util.ArrayList;
import java.util.Scanner;
import Student.student;

public class arraylistDemo extends student {
    private static Object student;

    public static void main(String[] args) throws Exception {
        ArrayList<student> stdList = new ArrayList<>();
        student std = new student();

        std.Add(stdList, 4);
        std.hienthithongtin(stdList);
        std.SuaThongTin(stdList);
        std.XoaThongTin(stdList);

    }
}
