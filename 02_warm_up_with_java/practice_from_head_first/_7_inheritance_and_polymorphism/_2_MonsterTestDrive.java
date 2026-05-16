/*override method must follow the followings
 # same arguments as in the super class' method
 # return type must be same as well
 # access modifier must be the same or less restricted
*/

public class _2_MonsterTestDrive {
    public static void main(String[] args){
        Monster[] monster= new Monster[3];
        monster[0] = new Vampire();
        monster[1] = new Dragon();
        monster[2] = new Monster();

        for(int i= 0; i< monster.length; i++){
            monster[i].frighten(i);
        }
    }
}

class Monster{
    boolean frighten(int d){
        System.out.println("arrrgh");
        return true;
    }
}

class Vampire extends Monster{
    boolean frighten(int x){        //override
        System.out.println("a bite ?");
        return false;
    }
}

class Dragon extends Monster{
    boolean frighten(int degree){   
        System.out.println("Breathe fire");   //override
        return true;
    }
}


/*
The boolean return type in the frighten methods is used to indicate a true/false result for the action,
 such as whether the monster successfully frightened someone or not. In your current code, the return value is not used anywhere—
 it's just required by the method signature. The main purpose is to allow the method to communicate a success/failure or yes/no outcome if needed, 
 but in this example, only the side effect (printing a message) is used.
*/