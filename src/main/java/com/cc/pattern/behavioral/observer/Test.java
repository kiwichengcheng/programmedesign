package com.cc.pattern.behavioral.observer;

public class Test {
    public static void main(String[] args) {
        Course course = new Course("Java设计模式");
        Teacher teacher = new Teacher("Alpha");
        course.addObserver(teacher);

        Question question = new Question();
        question.setUserName("abc");
        question.setQuestionContent("java主函数如何编写");
        course.produceQuestion(course, question);
    }
}
