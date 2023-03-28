# Java Iterate And ConvertEntity To DTO
his is a simple Java class that creates a list of BookEntity objects and then converts them to BookDTO objects using the dtoObj method. 

he fillEntity method initializes the list with some sample book data, while the dtoObj method converts each BookEntity object to a BookDTO object with the same properties.
```
List<BookEntity> books = fillEntity();
       books.stream().map(book -> dtoObj(book))
                .peek(System.out::println)
                .collect(Collectors.toList());
```
This code creates a list of BookEntity objects using the fillEntity method, then it streams through the list using the stream method. The map method is used to transform each BookEntity object into a BookDTO object using the dtoObj method, and then the peek method is used to print each BookDTO object to the console. Finally, the collect method is used to collect the transformed objects into a new list of BookDTO objects. The result of this operation is not stored anywhere, so it is effectively discarded.
