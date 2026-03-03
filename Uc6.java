public class Uc6 {

    public static void main(String[] args) {
        // 1. Array Initialization via Method Invocations
        // We call the helper methods directly within the array literal.
        // Note: getOPattern() is called twice, reusing the same logic!
        String[] bannerLines = {
            String.join("", getOPattern(0), getOPattern(0), getPPattern(0), getSPattern(0)),
            String.join("", getOPattern(1), getOPattern(1), getPPattern(1), getSPattern(1)),
            String.join("", getOPattern(2), getOPattern(2), getPPattern(2), getSPattern(2)),
            String.join("", getOPattern(3), getOPattern(3), getPPattern(3), getSPattern(3)),
            String.join("", getOPattern(4), getOPattern(4), getPPattern(4), getSPattern(4)),
            String.join("", getOPattern(5), getOPattern(5), getPPattern(5), getSPattern(5)),
            String.join("", getOPattern(6), getOPattern(6), getPPattern(6), getSPattern(6))
        };

        // 2. Loop-Based Rendering
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }

    // --- Helper Methods (Static Methods / Abstraction) ---

    /** Returns the specific line for the character 'O' */
    private static String getOPattern(int line) {
        String[] o = {
            "  * ", 
            " * * ", 
            " * * ", 
            " * * ", 
            " * * ", 
            " * * ", 
            "  * "
        };
        return o[line];
    }

    /** Returns the specific line for the character 'P' */
    private static String getPPattern(int line) {
        String[] p = {
            " *** ", 
            " * * ", 
            " * * ", 
            " *** ", 
            " * ", 
            " * ", 
            " * "
        };
        return p[line];
    }

    /** Returns the specific line for the character 'S' */
    private static String getSPattern(int line) {
        String[] s = {
            "  ** ", 
            " * ", 
            " * ", 
            "  * ", 
            "     * ", 
            "     * ", 
            " ** "
        };
        return s[line];
    }
}