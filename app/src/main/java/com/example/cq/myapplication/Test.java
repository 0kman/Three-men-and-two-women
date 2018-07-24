package com.example.cq.myapplication;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by cq on 2018/7/24.
 */

public class Test {
    private List<Student> students = new ArrayList();

    public void getAInfo() {
        Student a = new Student();
        Student b = new Student();
        Student c = new Student();
        Student d = new Student();
        Student e = new Student();
        students.add(a);
        students.add(b);
        students.add(c);
        students.add(d);
        students.add(e);

        while (true) {
            try {
                Thread.sleep(10);
                a.setMajor(majors[new Random().nextInt(2)]);
                a.setSex(sexs[new Random().nextInt(2)]);
                b.setMajor(majors[new Random().nextInt(2)]);
                b.setSex(sexs[new Random().nextInt(2)]);
                c.setMajor(majors[new Random().nextInt(2)]);
                c.setSex(sexs[new Random().nextInt(2)]);
                d.setMajor(majors[new Random().nextInt(2)]);
                d.setSex(sexs[new Random().nextInt(2)]);
                e.setMajor(majors[new Random().nextInt(2)]);
                e.setSex(sexs[new Random().nextInt(2)]);
                if (
                        ((a.getSex() + b.getSex() + c.getSex() + d.getSex() + e.getSex()) == 7)
                                && ((a.getMajor() + b.getMajor() + c.getMajor() + d.getMajor() + e.getMajor()) == 7)
                                && a.getSex() == b.getSex()
                                && c.getSex() != d.getSex()
                                && d.getMajor() == e.getMajor()
                                && b.getMajor() != c.getMajor()
                        ) {
                    for (Student student : students) {
                        if (student.getMajor() == 2 && student.getSex() == 2) {
                            Log.d("log", "A:" + a.toString() + "--" + "B:" + b.toString() + "--" + "C:" + c.toString() + "--" + "D:" + d.toString() + "--" + "E:" + e.toString());
                        }

                    }
                }
                Log.d("----log----", "---------------");
            } catch (InterruptedException e1) {
                e1.printStackTrace();
            }


        }
    }

    private int[] sexs = {1, 2};
    private int[] majors = {1, 2};

    class Student {
        private int sex;//1男,2女
        private int major;//1文科,2理科

        public Student() {

        }

        @Override
        public String toString() {
            return "{" +
                    "性别 = " + (sex == 1 ? "男" : "女") +
                    ", 专业 = " + (major == 1 ? "文科" : "理科") +
                    '}';
        }

        public int getSex() {
            return sex;
        }

        public void setSex(int sex) {
            this.sex = sex;
        }

        public void setMajor(int major) {
            this.major = major;
        }

        public int getMajor() {
            return major;
        }
    }
}

