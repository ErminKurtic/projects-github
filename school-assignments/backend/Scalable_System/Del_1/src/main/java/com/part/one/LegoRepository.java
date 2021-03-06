package com.part.one;

import org.springframework.stereotype.Repository;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;

@Repository
public class LegoRepository {

    public HashMap<Integer, Lego> legoList;

    public LegoRepository() throws FileNotFoundException {
        this.legoList = new HashMap<>();;
        getDataFromFile();
    }


    public Collection<Lego> getAllLego() {
        return legoList.values();
    }

    public void getDataFromFile() throws FileNotFoundException {
        File file = new File("themes.csv");

        Scanner fileRead = new Scanner(file);
        String textString = fileRead.nextLine(); // Skip first line

        while (fileRead.hasNextLine()) {
            textString = fileRead.nextLine();
            String[] row = textString.split(",");

            Lego lego = new Lego();
            lego.setId(Integer.parseInt(row[0]));
            lego.setName(row[1]);
            if(row.length == 3) {
                lego.setParentId(Integer.parseInt(row[2]));
            } else {
                lego.setParentId(0);
            }

            legoList.put(lego.getId(), lego);
        }
        fileRead.close();
    }
}
