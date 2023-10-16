public class Question {
    private String question, answer, type;
    private int point;

    public Question(String question, String answer, String type, int point){
        this.setQuestion(question);
        this.setAnswer(answer);
        this.setType(type);
        this.setPoint(point);
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return "Question{" +
                "question='" + question + '\'' +
                ", answer='" + answer + '\'' +
                ", point=" + point +
                '}';
    }
}