public class Course
{
    String name, topic, teacherName;
    int participantsAmount;

    public Course(String name, String topic, String teacherName, int participantsAmount) {
        this.name = name;
        this.topic = topic;
        this.teacherName = teacherName;
        this.participantsAmount = participantsAmount;
    }

    public boolean hasParticipants() {
        if (participantsAmount <= 0)
            return false;
        else
            return true;
    }
}
