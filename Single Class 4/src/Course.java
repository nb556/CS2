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

    public String getName() {
        return name;
    }

    public String getTopic() {
        return topic;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public int getParticipantsAmount() {
        return participantsAmount;
    }

    public boolean hasParticipants() {
        if (participantsAmount <= 0)
            return false;
        else
            return true;
    }

    public String toString()
    {
        return (name + " " + topic + " " + teacherName + " " +participantsAmount);
    }
}