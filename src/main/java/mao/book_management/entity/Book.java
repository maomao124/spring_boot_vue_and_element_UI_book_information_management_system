package mao.book_management.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

/**
 * Project name(项目名称)：spring_boot_vue_and_element_UI_book_information_management_system
 * Package(包名): mao.book_management.entity
 * Class(类名): Book
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/5/9
 * Time(创建时间)： 13:04
 * Version(版本): 1.0
 * Description(描述)： 实体类
 */


public class Book
{
    @TableId(type = IdType.AUTO)
    private Integer id;
    private String type;
    private String name;
    private String description;

    /**
     * Instantiates a new Book.
     */
    public Book()
    {

    }

    /**
     * Instantiates a new Book.
     *
     * @param id          the id
     * @param type        the type
     * @param name        the name
     * @param description the description
     */
    public Book(Integer id, String type, String name, String description)
    {
        this.id = id;
        this.type = type;
        this.name = name;
        this.description = description;
    }

    /**
     * Gets id.
     *
     * @return the id
     */
    public Integer getId()
    {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(Integer id)
    {
        this.id = id;
    }

    /**
     * Gets type.
     *
     * @return the type
     */
    public String getType()
    {
        return type;
    }

    /**
     * Sets type.
     *
     * @param type the type
     */
    public void setType(String type)
    {
        this.type = type;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName()
    {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name)
    {
        this.name = name;
    }

    /**
     * Gets description.
     *
     * @return the description
     */
    public String getDescription()
    {
        return description;
    }

    /**
     * Sets description.
     *
     * @param description the description
     */
    public void setDescription(String description)
    {
        this.description = description;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)    //引用同一个对象
        {
            return true;
        }
        if (obj == null)    //检测obj是否为null
        {
            return false;
        }
        //if(!(otherObject instanceof ClassName)) //如果所有的子类都拥有统一的语义
        if (this.getClass() != obj.getClass())   //比较this与obj是否属于同一个类
        {
            return false;
        }
        //Object类向下转型
        Book book = (Book) obj;

        if (!getId().equals(book.getId()))
        {
            return false;
        }
        if (!getType().equals(book.getType()))
        {
            return false;
        }
        if (!getName().equals(book.getName()))
        {
            return false;
        }
        return getDescription().equals(book.getDescription());
    }

    @Override
    public int hashCode()
    {
        int result = getId().hashCode();
        result = 31 * result + getType().hashCode();
        result = 31 * result + getName().hashCode();
        result = 31 * result + getDescription().hashCode();
        return result;
    }

    @Override
    @SuppressWarnings("all")
    public String toString()
    {
        final StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("id：").append(id).append('\n');
        stringbuilder.append("type：").append(type).append('\n');
        stringbuilder.append("name：").append(name).append('\n');
        stringbuilder.append("description：").append(description).append('\n');
        return stringbuilder.toString();
    }
}
