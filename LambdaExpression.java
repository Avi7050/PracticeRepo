@FunctionalInterface
interface Service{
    String checkVote(String name, int age, String location);
}
public class LambdaExpression{
    public static void main(String[] args) {
        Service service = (name,age,location) ->
                                (age > 18) && location.equalsIgnoreCase("Hyderabad")?"Eligible to vote":"Not eligible to vote";
        String status = service.checkVote("Avinash", 27, "Hyderabad");
        System.out.println(status);
    }

}