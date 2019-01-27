enum Team {
  ADAM, ROMAN, KAROLINA;
}
class Task {
  public static void main(String[] args) {
    Team member = Team.KAROLINA;
    System.out.println(member.name());
    System.out.println(member.ordinal());
    System.out.println(member.compareTo(Team.ROMAN));
    System.out.println(member.getDeclaringClass());
  }
}