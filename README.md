# Java Iterate And ConvertEntity To DTO
his is a simple Java class that creates a list of BookEntity objects and then converts them to BookDTO objects using the dtoObj method. 

he fillEntity method initializes the list with some sample book data, while the dtoObj method converts each BookEntity object to a BookDTO object with the same properties.
```
List<BookEntity> books = fillEntity();
       books.stream().map(book -> dtoObj(book))
                .peek(System.out::println)
                .collect(Collectors.toList());
```
