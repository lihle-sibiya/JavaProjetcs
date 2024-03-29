package Book4.Chapter6;

import java.util.ArrayList;

public class Spell {

    public static void main(String[] args) {
        // Create the ArrayList and add spells
        ArrayList<Spell> spells = new ArrayList<>();
        spells.add(new Spell("Aparecium", Spell.SpellType.SPELL,
                "Makes invisible ink appear."));
        spells.add(new Spell("Avis", Spell.SpellType.SPELL,
                "Launches birds from your wand."));
        spells.add(new Spell("Engorgio", Spell.SpellType.CHARM,
                "Enlarges something."));
        spells.add(new Spell("Fidelius", Spell.SpellType.CHARM,
                "Hides a secret within someone."));
        spells.add(new Spell("Finite Incatatum", Spell.SpellType.SPELL,
                "Stops all current spells."));
        spells.add(new Spell("Locomotor Mortis", Spell.SpellType.CURSE,
                "Locks an opponent's legs."));

        // list the name of each spell on the console
        for (Spell spell : spells)
            System.out.println(spell.name);

        System.out.println("xxxxxxxxxxxxxxxxxx    Method 2 - streams  xxxxxxxx");

        // equivalent code using the streams method: to convert ArrayList to a stream
        spells.stream().forEach(s -> System.out.println(s));// Loop through the spells and print each stream using
                                                            // Lambda

        System.out.println("xxxxxxxxxxxxxxxxxx    Print just spells normal way xxxxxxxx");
        // Print just spells
        for (Spell spell : spells) {
            if (spell.type == Spell.SpellType.SPELL)
                System.out.println(spell.name);
        }

        System.out.println("xxxxxxxxxxxxxxxxxx    Print just spells using streams (sequential)  xxxxxxxx");
        // Print just spells using streams filter method
        spells.stream()
                .filter(s -> s.type == Spell.SpellType.SPELL)
                .forEach(s -> System.out.println(s));


        System.out.println("xxxxxxxxxxxxxxxxxx    Print all spells using a parallel stream xxxxxxxx");
        // print all spells using a parallel stream: printed in different order
        spells.parallelStream()
                .forEach(s -> System.out.println(s));
    }

    public String name;
    public SpellType type;
    public String description;

    public enum SpellType {
        SPELL, CHARM, CURSE
    }

    // Constructor that lets you specify the name, type, and description for the
    // spell
    public Spell(String spellName, SpellType spellType, String spellDescription) {
        name = spellName;
        type = spellType;
        description = spellDescription;
    }

    // toString() method is overridden to return simply the spell name
    public String toString() {
        return name;
    }

}
