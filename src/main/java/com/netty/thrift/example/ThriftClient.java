package com.netty.thrift.example;

import org.apache.thrift.protocol.TCompactProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TFramedTransport;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;
import thrift.generated.Person;
import thrift.generated.PersonService;

public class ThriftClient {

    public static void main(String[] args) throws Exception {
        TTransport transport = new TFramedTransport(new TSocket("localhost", 8899), 600);

        TProtocol protocol = new TCompactProtocol(transport);

        PersonService.Client client = new PersonService.Client(protocol);

        try {
            transport.open();
            Person person = client.getPersonByName("zhangsan");

            System.out.println(person.getName());
            System.out.println(person.getAge());
            System.out.println(person.isMarried());

            Person person1 = new Person();
            person1.setName("lisi");
            person1.setMarried(Boolean.TRUE);
            person1.setAge(30);

            client.savePerson(person);

        } catch (Exception e){
            throw e;
        } finally {
            transport.close();
        }
    }
}
