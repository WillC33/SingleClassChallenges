import java.util.Scanner;

public class JokeTool {
    //handling user input to ask for joke
    private static void pressEnterToContinue() {

        Scanner myObj = new Scanner(System.in);
        String consent = myObj.nextLine();

        if (consent.equals("y")){
            System.out.println("Great!");

        } else if (consent.equals("n")){
            System.out.println("No problem, let's try again soon");
            System.exit(0);

        } else {
            System.out.println("My programmer isn't very good yet and I didn't understand, please enter y or n...");
            pressEnterToContinue();
        }
    }

    //generate a random number 0-19 to return a joke
    public static int numGen() {
        return (int) (Math.abs(Math.round(Math.random() * 20) - 1));
    }

    //body to define and return jokes
    public static void tellJoke(){
        System.out.println("Do you want to hear a joke? (y or n)");
        pressEnterToContinue();

        String[] setUp = {"Why couldn't the bicycle stand up by itself?","Why was the math book sad?","What do you get when you cross a snowman and a vampire?","Why couldn't the leopard play hide and seek?","Why did the tomato turn red?","Why was the computer cold?","Why was the calendar popular?","Why did the scarecrow win an award?","Why did the cookie go to the doctor?","What did the big flower say to the little flower?","Why did the chicken go to outer space?","What do you get when you cross a sheep and a kangaroo?","Why was the cat sitting on the computer?","Why did the golfer wear two pairs of pants?","Why did the banana go to the doctor?","What did the grape say when it got stepped on?","Why couldn't the bicycle stand up by itself?","What do you get when you cross a snake and a pie?","Why did the tomato turn red?","Why was the math book unhappy?"};
        String[] punchline = {"Because it was two-tired.","It had too many problems.","Frostbite.","Because he was always spotted.","Because it saw the salad dressing!","It left its Windows open.","It had a lot of dates.","Because he was outstanding in his field.","Because it was feeling crumbly.","Hey, bud!","To hatch an egg on the moon.","A woolly jumper.","It wanted to keep an eye on the mouse.","In case he got a hole in one.","Because it wasn't peeling well.","Nothing, it just let out a little wine.","Because it was two-tired.","A python.","Because it saw the salad dressing!","It had too many problems."};
        //thanks to ChatGPT for these wonderful jokes :D

        int a = (numGen());

        System.out.println(setUp[a]);
        System.out.println("...");

        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(punchline[a]);
    }
    public static void main(String[] args){
        tellJoke();
    }
}