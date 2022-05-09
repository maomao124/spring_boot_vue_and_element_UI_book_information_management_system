package mao.book_management.entity;

/**
 * Project name(项目名称)：spring_boot_vue_and_element_UI_book_information_management_system
 * Package(包名): mao.book_management.entity
 * Class(类名): Result
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/5/9
 * Time(创建时间)： 13:19
 * Version(版本): 1.0
 * Description(描述)： 前端和后端数据统一的类
 */

public class Result
{
    private Boolean flag;
    private Object data;
    private String msg;

    public Result()
    {

    }

    public Result(Boolean flag)
    {
        this.flag = flag;
    }

    public Result(Boolean flag, Object data)
    {
        this.flag = flag;
        this.data = data;
    }

    public Result(Boolean flag, String msg)
    {
        this.flag = flag;
        this.msg = msg;
    }

    public Result(String msg)
    {
        this.flag = false;
        this.msg = msg;
    }
}
