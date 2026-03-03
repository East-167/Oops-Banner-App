/**
 * UC7: Render OOPS as Banner using CharacterPatternMap Class
 * Demonstrates OOP principles, encapsulation, and scalable design.
 */
public class Uc7 {

    public static void main(String[] args) {

        // Create CharacterPatternMap objects
        CharacterPatternMap O = new CharacterPatternMap('O', buildOPattern());
        CharacterPatternMap P = new CharacterPatternMap('P', buildPPattern());
        CharacterPatternMap S = new CharacterPatternMap('S', buildSPattern());

        // Array of objects (O O P S)
        CharacterPatternMap[] word = { O, O, P, S };

        // Build final banner (7 lines)
        String[] banner = new String[7];

        for (int row = 0; row < 7; row++) {

            StringBuilder sb = new StringBuilder();

            for (CharacterPatternMap cp : word) {
                sb.append(cp.getPattern()[row]);
            }

            banner[row] = sb.toString();
        }

        // Print banner
        for (String line : banner) {
            System.out.println(line);
        }
    }

    /**
     * Inner Static Class to map character with its pattern.
     */
    static class CharacterPatternMap {

        private char character;
        private String[] pattern;

        /**
         * Constructor to initialize character and pattern.
         *
         * @param character Character to represent
         * @param pattern   7-line banner pattern
         */
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        /**
         * Returns the character.
         *
         * @return character
         */
        public char getCharacter() {
            return character;
        }

        /**
         * Returns the pattern array.
         *
         * @return 7-line pattern
         */
        public String[] getPattern() {
            return pattern;
        }
    }

    /**
     * Builds pattern for letter O.
     *
     * @return 7-line pattern for O
     */
    public static String[] buildOPattern() {
        return new String[]{
                "  ***  ",
                " *     * ",
                "*       *",
                "*       *",
                "*       *",
                " *     * ",
                "  ***  "
        };
    }

    /**
     * Builds pattern for letter P.
     *
     * @return 7-line pattern for P
     */
    public static String[] buildPPattern() {
        return new String[]{
                " **  ",
                " *     * ",
                " *     * ",
                " **  ",
                " *       ",
                " *       ",
                " *       "
        };
    }

    /**
     * Builds pattern for letter S.
     *
     * @return 7-line pattern for S
     */
    public static String[] buildSPattern() {
        return new String[]{
                "  ***  ",
                " *     * ",
                " *       ",
                "  ***  ",
                "       * ",
                " *     * ",
                "  ***  "
        };
    }
}