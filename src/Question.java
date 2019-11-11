import java.util.ArrayList;

public abstract class Question {
    QuestionForm questionForm;
    HelpForm helpForm;

    public void getQuestionForm() {
        questionForm.form();
    }

    public void setQuestionForm(QuestionForm questionForm) {
        this.questionForm = questionForm;
    }

    public void getHelpForm() {
        helpForm.help();
    }

    public void setHelpForm(HelpForm helpForm) {
        this.helpForm = helpForm;
    }

    abstract void display();

    abstract void scores();

}
