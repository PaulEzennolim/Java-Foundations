// Publisher.java
public enum Publisher {
    ACTIVISION, BLIZZARD, CD_PROJEKT,
    CURVE, EA_SPORTS, ELECTRONIC_ARTS,
    KRAFTON, MOJANG, NAMCO, NINTENDO,
    RE_LOGIC, ROCKSTAR, SEGA, SONY,
    TELLTALE, TWOK_GAMES, XBOX;

    @Override
    public String toString() {
        // Use name() to get the enum constant name
        return name().charAt(0) + name().substring(1).toLowerCase().replace("_", " ");
    }
}
