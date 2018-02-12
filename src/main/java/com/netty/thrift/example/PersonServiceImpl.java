package com.netty.thrift.example;

import org.apache.thrift.TException;
import thrift.generated.DataException;
import thrift.generated.Person;
import thrift.generated.PersonService;

public class PersonServiceImpl implements PersonService.Iface {

    @Override
    public Person getPersonByName(String name) throws DataException, TException {
        System.out.println("Parameter: " + name);

        Person person = new Person();
        person.setName(name);
        person.setAge(20);
        person.setMarried(Boolean.FALSE);
        return person;
    }

    @Override
    public void savePerson(Person person) throws DataException, TException {
        System.out.println(person.getName());
        System.out.println(person.getAge());
        System.out.println(person.isMarried());
    }
}
