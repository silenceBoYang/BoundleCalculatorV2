package model;

public enum SubmissionFormatParser {
    IMAGE, AUDIO, VIDEO;

    public static boolean contains(String s) {
        try {
            SubmissionFormatParser.valueOf(s);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public static String getFormatCode(String s) {

        try {
            if (SubmissionFormatParser.valueOf(s).equals(IMAGE)) {
                s = "IMG";
            } else if (SubmissionFormatParser.valueOf(s).equals(AUDIO)) {
                s = "Flac";
            } else if (SubmissionFormatParser.valueOf(s).equals(VIDEO)) {
                s = "VID";
            }
        } catch (Exception e) {

        }
        return s;
    }
}
