public class Question {
    private int id;
    private String question;
    private String opt1;
    private String opt2;
    private String opt3;
    private String opt4;
    private String Answer;
    public String[] selection;

    public Question(int id, String question, String opt1, String opt2, String opt3, String opt4, String answer) {
        this.id = id;
        this.question = question;
        this.opt1 = opt1;
        this.opt2 = opt2;
        this.opt3 = opt3;
        this.opt4 = opt4;
        Answer = answer;
    }

    /**
     * @return int return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return String return the question
     */
    public String getQuestion() {
        return question;
    }

    /**
     * @param question the question to set
     */
    public void setQuestion(String question) {
        this.question = question;
    }

    /**
     * @return String return the opt1
     */
    public String getOpt1() {
        return opt1;
    }

    /**
     * @param opt1 the opt1 to set
     */
    public void setOpt1(String opt1) {
        this.opt1 = opt1;
    }

    /**
     * @return String return the opt2
     */
    public String getOpt2() {
        return opt2;
    }

    /**
     * @param opt2 the opt2 to set
     */
    public void setOpt2(String opt2) {
        this.opt2 = opt2;
    }

    /**
     * @return String return the opt3
     */
    public String getOpt3() {
        return opt3;
    }

    /**
     * @param opt3 the opt3 to set
     */
    public void setOpt3(String opt3) {
        this.opt3 = opt3;
    }

    /**
     * @return String return the opt4
     */
    public String getOpt4() {
        return opt4;
    }

    /**
     * @param opt4 the opt4 to set
     */
    public void setOpt4(String opt4) {
        this.opt4 = opt4;
    }

    /**
     * @return String return the Answer
     */
    public String getAnswer() {
        return Answer;
    }

    /**
     * @param Answer the Answer to set
     */
    public void setAnswer(String Answer) {
        this.Answer = Answer;
    }

    @Override
    public String toString() {
        return "Question [id=" + id + ", question=" + question + ", opt1=" + opt1 + ", opt2=" + opt2 + ", opt3=" + opt3
                + ", opt4=" + opt4 + ", Answer=" + Answer + "]";
    }

}
