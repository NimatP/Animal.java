package Lesson_1.Marathon.Let;

import Lesson_1.Marathon.Competitor;
import Lesson_1.Marathon.Member.Team;

public class Course {
    private Obstacle[] obstakles;

    public Course(Obstacle...obstakles) {
        this.obstakles = obstakles;
    }

    public void doIt (Team team) {
        for (Competitor c : team.getMembers()) {
            for (Obstacle o : obstakles) {
                o.doIt(c);
                if (!c.isOnDistance()) break;
            }
        }
    }
}
