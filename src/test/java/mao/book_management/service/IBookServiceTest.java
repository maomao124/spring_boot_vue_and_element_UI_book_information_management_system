package mao.book_management.service;

import mao.book_management.entity.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Project name(项目名称)：spring_boot_vue_and_element_UI_book_information_management_system
 * Package(包名): mao.book_management.service
 * Class(测试类名): IBookServiceTest
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/5/9
 * Time(创建时间)： 14:08
 * Version(版本): 1.0
 * Description(描述)： 测试类
 */

@SpringBootTest
class IBookServiceTest
{

    @Autowired
    IBookService iBookService;

    @Test
    void saveBook()
    {

    }

    @Test
    void modify()
    {
    }

    @Test
    void delete()
    {
    }

    @Test
    void getPage()
    {
    }

    @Test
    void testGetPage()
    {
    }

    @Test
    void selectAll()
    {
        List<Book> bookList = iBookService.list();
        System.out.println(bookList);
    }
}