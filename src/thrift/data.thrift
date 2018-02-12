namespace java thrift.generated
namespace py py.thrift.generated


struct Person{
    1: optional string name,
    2: optional i32 age,
    3: optional bool married
}

exception DataException{
    1: optional string message,
    2: optional string callStack,
    3: optional string date
}

service PersonService{
    Person getPersonByName(1: required string name) throws (1: DataException dataException),
    void savePerson(1: required Person person) throws (1: DataException dataException)
}

