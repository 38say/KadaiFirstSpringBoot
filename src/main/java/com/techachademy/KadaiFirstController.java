package com.techachademy;

import java.util.Calendar;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KadaiFirstController {

    @GetMapping("/plus/{val1}/{val2}")
    public String calcPlus(@PathVariable int val1, @PathVariable int val2) {
        int res = 0;
        res = val1 + val2;
        return "実行結果：" + res;}

        @GetMapping("/minus/{val1}/{val2}")
        public String calcMinus(@PathVariable int val1, @PathVariable int val2) {
            int res = 0;
            res = val1 - val2;
            return "実行結果：" + res;}

        @GetMapping("/times/{val1}/{val2}")
        public String calcTimes(@PathVariable int val1, @PathVariable int val2) {
            int res = 0;
            res = val1 * val2;
            return "実行結果：" + res;}

        @GetMapping("/divide/{val1}/{val2}")
        public String calcDivide(@PathVariable int val1, @PathVariable int val2) {
            int res = 0;
            res = val1 / val2;
            return "実行結果：" + res;}

       @GetMapping("dayofweek/{val1}")
       public static String main(@PathVariable String val1) {
           String yyyymmdd = val1;

           int year = Integer.parseInt(yyyymmdd.substring(0, 4));
           int month = Integer.parseInt(yyyymmdd.substring(4, 6));
           int day = Integer.parseInt(yyyymmdd.substring(6, 8));


           Calendar cal = Calendar.getInstance();
            cal.set(year, month - 1, day);

            int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);

            String[] weekDays = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Suturday" };
              return weekDays[dayOfWeek - 1];
       }






       }
