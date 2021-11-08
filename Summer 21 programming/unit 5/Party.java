public class Party
{
    private int numInvited;
    private boolean partyCancelled;

    public Party(String aString)
    {
        numInvited = 1;
        partyCancelled = false;
    }

    public void inviteFriend(String a, String B, String C)
    {
        numInvited++;
    }

    public String cancelParty()
    {
        partyCancelled = true;
        return "the party is cancelled";
    }
}