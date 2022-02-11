package progression;

public enum CharStats {
    Lvl(0), //Level
    Str(0), //Strenth
    Dex(0), //Dexterity
    Int(0), //Intelligence
    Luk(0); //Luck

    private final int def;
    private final boolean special;

    private CharStats(final int def) {
        this.def = def;
    }

}
