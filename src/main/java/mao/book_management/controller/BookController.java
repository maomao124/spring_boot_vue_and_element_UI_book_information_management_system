package mao.book_management.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import mao.book_management.entity.Book;
import mao.book_management.entity.Result;
import mao.book_management.service.IBookService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * Project name(项目名称)：spring_boot_vue_and_element_UI_book_information_management_system
 * Package(包名): mao.book_management.controller
 * Class(类名): BookController
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/5/9
 * Time(创建时间)： 13:18
 * Version(版本): 1.0
 * Description(描述)： BookController
 */

@RestController
public class BookController
{
    private static final Logger log = LoggerFactory.getLogger(BookController.class);

    @Autowired
    private IBookService bookService;

    /**
     * 获得所有图书信息，get请求
     *
     * @return Result对象
     */
    @GetMapping("/books")
    public Result getAll()
    {
        log.debug("获取全部");
        return new Result(true, bookService.list());
    }

    /**
     * 保存一条图书信息
     * post请求
     *
     * @param book 图书对象
     * @return Result 对象
     * @throws IOException 异常
     */
    @PostMapping("/books")
    public Result save(@RequestBody Book book) throws IOException
    {
        log.debug("保存图书");
        //测试异常
        if (book.getName().equals("123"))
        {
            throw new IOException();
        }
        boolean flag = bookService.save(book);
        return new Result(flag, flag ? "添加成功^_^" : "添加失败-_-!");
    }

    /**
     * 更新图书信息
     * put请求
     *
     * @param book 图书对象
     * @return Result 对象
     * @throws IOException 异常
     */
    @PutMapping("/books")
    public Result update(@RequestBody Book book) throws IOException
    {
        log.debug("更新图书信息");
        if (book.getName().equals("123"))
        {
            throw new IOException();
        }
        boolean flag = bookService.modify(book);
        return new Result(flag, flag ? "修改成功^_^" : "修改失败-_-!");
    }

    /**
     * 删除一条图书信息
     * delete请求
     *
     * @param id 图书id
     * @return Result对象
     */
    @DeleteMapping("/books/{id}")
    public Result delete(@PathVariable Integer id)
    {
        log.debug("删除图书信息："+id);
        return new Result(bookService.delete(id));
    }

    /**
     * 获取一条图书信息
     * get请求
     *
     * @param id 图书的id
     * @return Result对象
     */
    @GetMapping("books/{id}")
    public Result getById(@PathVariable Integer id)
    {
        log.debug("获取图书信息："+id);
        return new Result(true, bookService.getById(id));
    }


    /**
     * 获得当前页的所有数据
     * get请求
     *
     * @param currentPage 当前页号 int型
     * @param pageSize    页大小 int型
     * @param book        此数据是条件查询的参数
     * @return Result对象
     */
    @GetMapping("books/{currentPage}/{pageSize}")
    public Result getPage(@PathVariable Integer currentPage, @PathVariable Integer pageSize, Book book)
    {
        log.debug("查询，查询参数：" + book);
        IPage<Book> page = bookService.getPage(currentPage, pageSize, book);
        //如果当前页码值大于了总页码值，那么重新执行查询操作，使用最大页码值作为当前页码值
        if (currentPage > page.getPages())
        {
            page = bookService.getPage((int) page.getPages(), pageSize, book);
        }
        return new Result(true, page);
    }


}
