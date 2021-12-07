package day01;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Concert {

    private List<Person> personList = new ArrayList<>();

//    public Concert(List<Person> personList) {
//        this.personList = personList;
//    }

    private void addPerson(Person person, LocalTime actualTime) {
        if (actualTime.isBefore(person.getTicket().entryTime())) {
            throw new IllegalArgumentException(" Nem mehet be! ");
        }
        personList.add(person);
    }

    public List<Person> getPersonList() {
        return personList;
    }
}
