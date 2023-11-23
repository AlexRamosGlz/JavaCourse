public class Main {
    public static void main(String[] args) {
//        BaseballTeam phillies = new BaseballTeam("Philadelphia Phillies");
//        BaseballTeam astros = new BaseballTeam("Houston Astros");
//        scoreResult(phillies, 3, astros, 5);

//        var harper = new BaseballPlayer("B Harper", "Right Fielder");
//        var marsh  = new BaseballPlayer("B Marsh", "Right Fielder");
//        Team<>.addTeamMember(harper);
//        phillies.addTeamMember(marsh);
//        phillies.listTeamMembers();

        /***
         *  Raw usage of generics classes.
         *
         *  When you use generic classes, either referncing them or instantiating them, it's definitely recommended
         *  that you include a type parameter.
         *
         *  But you can still use them without specifying one. This is called the `Raw Use` of the reference type.
         *
         *      so...
         *
         *          Team<> teamName = new Team(...) -> Notice the brackets are empty (or not even written)
         *
         *  The raw use of these classes is still available, for backwards compatibility, but it's discouraged for
         *  several reasons.
         *
         *   - Generics allow the compiler to do compile-time type checking, when adding and processing elements
         *     in the list
         *
         *   - Generics simplify code, because we don't have to do our own type checking and casting, as we would,
         *     if the type of our element was `Object`.
         *
         */
        Team<BaseballPlayer> phillies = new Team("Philadelphia Phillies");
        Team<BaseballPlayer> astros = new Team("Houston Astros");

        var harper = new BaseballPlayer("B Harper", "Right Fielder");
        var marsh  = new BaseballPlayer("B Marsh", "Right Fielder");
        phillies.addTeamMember(harper);
        phillies.addTeamMember(marsh);
        phillies.listTeamMembers();


        var jordan = new BasketballPlayer("M Jordan", "Point Guard");
        //phillies.addTeamMember(jordan);
        scoreResult(phillies, 3, astros, 5);

    }

    public static void scoreResult(BaseballTeam team1, int t1_score, BaseballTeam team2, int t2_score) {
        String message = team1.setScore(t1_score, t2_score);
        team2.setScore(t2_score, t1_score);
        System.out.printf("%s %s %s %n", team1, message, team2);
    }

    public static void scoreResult(Team team1, int t1_score, Team team2, int t2_score) {
        String message = team1.setScore(t1_score, t2_score);
        team2.setScore(t2_score, t1_score);
        System.out.printf("%s %s %s %n", team1, message, team2);
    }
}