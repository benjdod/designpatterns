The key is to understand what an object is or isn't. Remember that a CheckIn *is* a person, just attached to / decorated with accompanying information about their visit. 

### `Person` (*interface*):
In this program, a person is represented by a name and an ID number. The `Person` interface specifies methods to return these two values.

### `PersonImpl` (*class*):
`PersonImpl` is a verbatim implementation of the Person interface. 

### `PersonDecorator` (*decorator interface, extends `Person`*):
`PersonDecorator`, as the name would suggest, is the decorator interface for a person. It specifies additional methods, as well as a `getPerson()` method which returns the unwrapped person. Also, since it extends the `Person` interface, it inherently specifies methods to return the person's name and ID number.

### `CheckIn` (*decorator class, implements `PersonDecorator`*):
`CheckIn` is the decorator class for Person. Its constructor takes a person, an appointment type, and a date, and its methods return the values specified by `PersonDecorator`.


