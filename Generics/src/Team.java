import java.util.ArrayList;
import java.util.List;

/**
 *  Generics
 *
 *  Generics allow us to create classes, to design them, in a general way, without really worrying about the details
 *  of the elements the might contain.
 *
 *  Generic Classses VS Regular Classes
 *
 *  Declaration:
 *
 *      class GenericClass<T> {       |         class RegularClass {
 *          private T field;          |             private String field;
 *      }                             |         }
 *
 *
 *      The thing to notice with the generic class, os that the class declaration has angle brackets with a `T`
 *      in them, directly after the class name.
 *
 *      the `T` is a placeholder for a type that will be specified later. This is called a type identifier, and it
 *      can be any letter or word, but `T` which is short for type is commonly used.
 *
 *      Single letter types are the convention, and they're a lot easier to spot in the class code. If there's more
 *      than one type parameter convention says that instead of using like this (`T1`, `T2`, `T3`, ...), should be like
 *      this (`S`, `U`, `V`)
 *
 *          so... class GenericClass<T, S, U> {};
 *
 *      A few letters are reserved for special use cases.
 *
 *          - E for element ( used extensively by the java Collections Framework)
 *          - K for Key (used for mapped types)
 *          - N for Number.
 *          - T for Type.
 *          - V for Value.
 *          - S, U, V etc. for 2nd, 3rd, 4th types.
 *
 *      Bounding Generic Classes (limiting the type that cas use it)
 *
 *          public class Team<T extends Player> {...}
 *
 *      This extends keyword doesn't have the same meaning as extends, when it's used in a class declaration.
 *
 *      this isn't saying our type T extends Player, although it could. is saying the parameterized type `T` has to be
 *      a `Player`, OR A subtype of `Player`. Now `Player` int this case could have been either a class OR AN interface.
 *
 *      This declaration establishes what is called an UPPER BOUND, on the types that are allowed to be used with this class.
 */
public class Team<T extends Player> {
    private String teamName;
    private List<T> teamMembers = new ArrayList<>();
    private int totalWins = 0;
    private int totalLosses = 0;
    private int totalTies = 0;

    public Team(String teamName) {
        this.teamName = teamName;
    }

    public void addTeamMember(T t) {
        if(!teamMembers.contains(t)) {
            teamMembers.add(t);
        }
    }

    public void listTeamMembers() {
        System.out.println(teamName + " Roster: ");

        for(T t: teamMembers) {
            System.out.println(t.name());
        }
    }

    public int ranking() {
        return ( totalLosses * 2) + totalTies + 1;
    }

    public String setScore(int ourScore, int theirScore) {
        String message = "Lost to";
        if(ourScore > theirScore) {
            totalWins++;
            message = "beat";
        }else if(ourScore == theirScore) {
            message = "tied";
            totalTies++;
        } else {
            totalLosses++;
        }

        return message;
    }

    @Override
    public String toString() {
        return teamName + " (Ranked " + ranking() + ")";
    }
}
