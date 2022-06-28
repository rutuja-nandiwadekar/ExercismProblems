package rna.transcription;


public class RnaTranscription {

    public static void main(String[] args) {
        //method calling
        RnaTranscription.transcribe("CGTA");
    }

    static String transcribe(String dnaStrand) {
        String transcribed = "";
        for (char letter : dnaStrand.toCharArray()) {
            if (letter == 'C') transcribed += "G";
            else if (letter == 'G') transcribed += "C";
            else if (letter == 'T') transcribed += "A";
            else if (letter == 'A') transcribed += "U";
            else transcribed += "";
        }
        return transcribed;

    }

}