package com.application.bookself;

import com.application.bookself.entity.Author;
import com.application.bookself.entity.Book;
import com.application.bookself.entity.Category;
import com.application.bookself.entity.Publisher;
import com.application.bookself.service.BookService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BookSelfApp {

    public static void main(String[] args) {
        SpringApplication.run(BookSelfApp.class, args);
    }

    @Bean
    public CommandLineRunner initialCreate(BookService bookService) {
        return (args) -> {
            Book book1 = new Book("9789573292777","知識複利：將內容變現，打造專家型個人品牌的策略","　　本書解答了「知識如何成為力量」的重要課題，告訴讀者如何以我們擁有的知識為基礎，在商業思維的POEM法則之下，進型內容創作與知識變現。另外，還有許多寫作與社群經營手法的準則，都可以讓自己的影響力擴張，把自己的專業成功行銷出去。");
            Author author1 = new Author("何則文", "知名生涯教練與作家，著有《個人品牌》、《別讓世界定義你》等超過7本暢銷書。");
            Category category1 = new Category("個人發展");
            Publisher publisher1 = new Publisher("遠流");
            book1.addAuthor(author1);
            book1.addCategory(category1);
            book1.addPublisher(publisher1);
            bookService.createBook(book1);

            Book book2 = new Book("9786267099292","變化中的世界秩序：橋水基金應對國家興衰的原則","　　本書考察史上最動盪的經濟和政治時期，研究主要帝國包括荷蘭、英國、中國歷朝歷代和美國，透視推動帝國興衰的「大週期」（Big Cycle）。從這個極度宏觀的大局視角來看強權的興起與衰敗，你會更了解這個世界的運作原則，以及國家／自身在歷史中的定位。");
            Author author2 = new Author("瑞達利歐", "橋水公司（Bridgewater Associates）的創辦人和聯合首席執行長，橋水公司是機構投資公司的翹楚，也是世界最大的避險基金。");
            Category category2 = new Category("商業理財");
            Publisher publisher2 = new Publisher("商業週刊");
            book2.addAuthor(author2);
            book2.addCategory(category2);
            book2.addPublisher(publisher2);
            bookService.createBook(book2);
        };
    }

}
