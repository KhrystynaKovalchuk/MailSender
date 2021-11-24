package mail_sender;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public enum MailCode {
    HAPPY_BIRTHDAY("happy_birthday.txt"), GREETINGS("greetings.txt");

    private final String filename;

    MailCode(String filename) {
        this.filename = filename;
    }

    public String generateText() {
        try {
            File file = new File(filename);
            StringBuilder fileText = new StringBuilder((int)file.length());
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                fileText.append(scanner.nextLine() + System.lineSeparator());
            }



            return fileText.toString();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return "";
        }
    }
}

