package Lesson_1.Marathon;

import Lesson_1.Marathon.Let.Course;
import Lesson_1.Marathon.Let.Cross;
import Lesson_1.Marathon.Let.Obstacle;
import Lesson_1.Marathon.Let.Wall;
import Lesson_1.Marathon.Member.Cat;
import Lesson_1.Marathon.Member.Dog;
import Lesson_1.Marathon.Member.Human;
import Lesson_1.Marathon.Member.Team;

public class Main {
    public static void main(String[] args) {

        Team team = new Team(new Human("Вася"), new Cat("Дуся"), new Dog("Bobic"));
        Course course = new Course(new Cross(100), new Wall(2));
        course.doIt(team);
        team.showWinners();
    }
}