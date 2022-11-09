package com.shahian;

import java.time.LocalDate;
import java.util.ArrayList;

import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<BookEntity> books = fillEntity();
       books.stream().map(book -> dtoObj(book))
                .peek(System.out::println)
                .collect(Collectors.toList());

    }

    private static BookDTO dtoObj(BookEntity book) {
         return new BookDTO(book.getId(),book.getName(),book.getAuthorName(),book.getPublishDate());
    }

    private static List<BookEntity> fillEntity() {
        List<BookEntity> bookEntities = new ArrayList<>();
        bookEntities.add(new BookEntity(1L, "Pride and Prejudice", "Jane Austen", LocalDate.of(1813, 1, 21)));
        bookEntities.add(new BookEntity(2L, "Wuthering Heights", "Emily Brontë", LocalDate.of(1847, 3, 25)));
        bookEntities.add(new BookEntity(3L, "Jane Eyre", " Charlotte Brontë ", LocalDate.of(1847, 9, 1)));
        bookEntities.add(new BookEntity(4L, "Anna Karenina", "Leo Tolstoy", LocalDate.of(1877, 2, 12)));
        bookEntities.add(new BookEntity(5L, "Gone With the Wind", "Margaret Mitchell", LocalDate.of(1936, 5, 17)));
        bookEntities.add(new BookEntity(6L, "Doctor Zhivago", " Boris Pasternak", LocalDate.of(1957, 2, 3)));
        bookEntities.add(new BookEntity(7L, "Love Story", "Erich Segal", LocalDate.of(1970, 8, 12)));
        return bookEntities;
    }
}
