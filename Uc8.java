import java.util.*;

/**
 * UC8: Render OOPS Banner using HashMap and Rendering Function
 * Demonstrates Collections Framework and scalable architecture.
 */
public class Uc8 {

    public static void main(String[] args) {

        String message = "OOPS";

        Map<Character, String[]> patternMap = buildPatternMap();

        renderBanner(message, patternMap);
    }

    /**
     * Builds and returns a HashMap containing character patterns.
     *
     * @return Map of Character to 7-line banner pattern
     */
    public static Map<Character, String[]> buildPatternMap() {

        Map<Character, String[]> map = new HashMap<>();

        map.put('O', new String[]{
                "  ***  ",
                " *     * ",
                "*       *",
                "*       *",
                "*       *",
                " *     * ",
                "  ***  "
        });

        map.put('P', new String[]{
                " **  ",
                " *     * ",
                " *     * ",
                " **  ",
                " *       ",
                " *       ",
                " *       "
        });

        map.put('S', new String[]{
                "  ***  ",
                " *     * ",
                " *       ",
                "  ***  ",
                "       * ",
                " *     * ",
                "  ***  "
        });

        return map;
    }

    /**
     * Renders banner message using stored patterns.
     *
     * @param message    Word to display
     * @param patternMap Character-to-pattern mapping
     */
    public static void renderBanner(String message, Map<Character, String[]> patternMap) {

        // Outer loop: 7 rows
        for (int row = 0; row < 7; row++) {

            StringBuilder sb = new StringBuilder();

            // Inner loop: each character in message
            for (char ch : message.toCharArray()) {

                String[] pattern = patternMap.get(ch);

                if (pattern != null) {
                    sb.append(pattern[row]);
                }
            }

            System.out.println(sb.toString());
        }
    }
}