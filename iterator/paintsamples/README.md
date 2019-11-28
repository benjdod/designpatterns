# Paint Samples
### Iterator 

*Points of Focus: Iterator interface*

This example demonstrates creating a specialized implementation of the Iterator interface. 

Iterator is an interface designed for, well, iterating through and retrieving a series of objects. It specifies two methods: `hasNext()` and `next()`. hasNext() tells whether or not there are any objects left to iterate over, and next() returns the next object. 

### PaintSample (*class*): 
`PaintSample` is the object class representing a paint sample. It takes a name and color family in its constructor, and provides getter methods to retrieve both values.

### ColorFamilyIterator (*class, implements `Iterator<PaintSample>`*):
`ColorFamilyIterator` provides an implementation of the Iterator interface which iterates over all paint samples in a list in a certain color family. 
