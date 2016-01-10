package kata7.application.swing;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MailReader {

    public static List<Person> read(String filename) throws FileNotFoundException, IOException {
        List<Person> mailList = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(new File(filename)))) {
            String mail;
            Integer id=0;
            while ((mail = reader.readLine()) != null) {
                if (!mail.contains("@")) {
                    continue;
                }
                mailList.add(new Person(id++, mail));
            }            
        };
        return mailList;
    }
}
