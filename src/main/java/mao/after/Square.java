package mao.after;

/**
 * Project name(项目名称)：java设计模式_里氏代换原则
 * Package(包名): mao.after
 * Class(类名): Square
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/9
 * Time(创建时间)： 21:16
 * Version(版本): 1.0
 * Description(描述)： 无
 */


public class Square implements Quadrilateral
{
    private double side;

    /**
     * Instantiates a new Square.
     */
    public Square()
    {

    }

    /**
     * Instantiates a new Square.
     *
     * @param side the side
     */
    public Square(double side)
    {
        this.side = side;
    }

    /**
     * Sets side.
     *
     * @param side the side
     */
    public void setSide(double side)
    {
        this.side = side;
    }

    @Override
    public double getLength()
    {
        return side;
    }

    @Override
    public double getWidth()
    {
        return side;
    }
}
