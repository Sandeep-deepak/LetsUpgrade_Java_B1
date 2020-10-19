package Day_5_Assignment;

public class Game {

    Question[] questions=new Question[5];
    Player player=new Player();

    String[] questionsdata={"Bytecode is stored in files with which extention?",
                            "java.util.Collections is a?",
                            "How many times can you call a method?",
                            "In Java an array starts counting from...?",
                            "Object variables store...?"
                            };
    String[] options1={".class","Interface","as many as you want","1","Strings"};
    String[] options2={".javac","Class","only two","2","Classes"};
    String[] options3={".bytecode","Object","one","0","Objects"};
    String[] options4={".java","None of the above","Limited","-1","References"};
    int[] answers={1,2,1,3,4};


    public void initGame(){
    // created five objects
        for(int i=0;i<5;i++){
            questions[i]=new Question();
        }

        for(int i=0;i<5;i++){
            questions[i].question="Q" + (i+1) + ". " + questionsdata[i];
            questions[i].option1=options1[i];
            questions[i].option2=options2[i];
            questions[i].option3=options3[i];
            questions[i].option4=options4[i];
            questions[i].correctAnswer=answers[i];
        }
    }


    public void play(){

        player.getDetails();
            for(int i=0;i<5;i++){
                boolean status=questions[i].askQuestion();
                if(status==true){
                    System.out.println("Correct!");
                    player.score=player.score + 10;
                    System.out.println("---------------------------");
                }
                else{
                    System.out.println("Incorrect!");
                    player.score=player.score - 5;
                    System.out.println("---------------------------");
                }
            }
        System.out.println(player.name+" your score is "+player.score);
        System.out.println("---------------------------");
    }

}