public class Mbti {
    public String[] optionA = {
        "expend energy, enjoy groups",
        "interpret literally",
        "logical, thinking, questioning",
        "organized, orderly",
        "more outgoing, think out loud",
        "practical, realistic experiential",
        "candid, straight forward, frank",
        "plan, schedule",
        "seek many tasks, public activities, interaction with others",
        "standard, usual, conventional",
        "firm, tend to criticize, hold the line",
        "regulated, structure",
        "external, communicative, express yourself",
        "focus on here-and-now",
        "tough-minded, just",
        "preparation, plan ahead",
        "active, initiate",
        "acts, things, what is",
        "matter of fact, issue-oriented",
        "control, govern"
    };

    public String[] optionB = {
        "conserve energy, enjoy one-on-one",
        "look for meaning and possibilities",
        "empathetic, feeling, accommodating",
        "flexible, adaptable",
        "more reserved, think to yourself",
        "imaginative, innovative, theoretical",
        "frank tacful, kind, encouraging",
        "unplanned, spontaneous",
        "seek private, solitary activities with quite to concentrate",
        "different, novel, unique",
        "gentle tend to appreciate, conciliate",
        "easygoing, live-and-let-live",
        "internal, reticent, keep to yourself",
        "look to the future, global perspective, big picture",
        "tender-hearted, merciful",
        "go with the flow, adapt as you go",
        "reflextive, deliberate",
        "ideas, dreams, what could be, philosophical",
        "sensitive, people-oriented, compassionate",
        "latitude, freedom"
    };

    // COLLECTION OF ANSWERS
    public String[] userAnswers = new String[20];

    public String getQuestion(int number) {
        for (int index = 0; index < 20; index = index + 1) {
            if ((index + 1) == number) {
                return "A. " + optionA[index] + "\nB. " + optionB[index];
            }
        }
        return "";
    }

    public void saveAnswer(int questionNumber, String answer) {
        if (!answer.equals("A") &&!answer.equals("B")) {
            System.out.println("Expecting A or B as Response");
            System.out.println("Error, please try again");
            return;
        }

        for (int index = 0; index < 20; index = index + 1) {
            if ((index + 1) == questionNumber) {
                userAnswers[index] = answer;
                return; // stop after saving
            }
        }
    }

    public String getSavedAnswer(int questionNumber) {
        for (int index = 0; index < 20; index = index + 1) {
            if ((index + 1) == questionNumber) {
                return userAnswers[index]; // returns text found
            }
        }
        return "";
    }
}

