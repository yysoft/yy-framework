/**
 * THIS FILE IS PART OF YYSOFT PROJECT
 * <p>
 * THIS PROGRAM IS FREE SOFTWARE, IT EXPECT TO HELP BUILD JAVA WEB SOFTWARE EASILY. IT IS LICENSED UNDER MIT.
 * <p>
 * Copyright (c) 2017 Mar(mays@caiban.net)
 */
package net.caiban.platform.common.base;

import java.util.List;

/**
 * 分页查询返回
 *
 * Created by mar on 2016/10/6.
 */
public class BasePageResult<T> extends BaseResult {

    private static final long serialVersionUID = 461135617668116648L;
    /**
     * 查询结果（当页）
     */
    private List<T> list;

    /**
     * 总记录数
     */
    private int total = 0;

    /**
     * 当前页起始记录
     */
    private int start = 0;

    /**
     * 总页数
     */
    private int totalPage = 1;

    /**
     * 当前页
     */
    private int currentPage = 1;

    /**
     * construct
     *
     * @param success
     */
    public BasePageResult(boolean success) {
        super(success);
    }


    /**
     * Getter method for property <tt>list</tt>.
     *
     * @return property value of list
     */
    public List<T> getList() {
        return list;
    }

    /**
     * Setter method for property <tt>list</tt>.
     *
     * @param list value to be assigned to property list
     */
    public void setList(List<T> list) {
        this.list = list;
    }

    /**
     * Getter method for property <tt>total</tt>.
     *
     * @return property value of total
     */
    public int getTotal() {
        return total;
    }

    /**
     * Setter method for property <tt>total</tt>.
     *
     * @param total value to be assigned to property total
     */
    public void setTotal(int total) {
        this.total = total;
    }

    /**
     * Getter method for property <tt>start</tt>.
     *
     * @return property value of start
     */
    public int getStart() {
        return start;
    }

    /**
     * Setter method for property <tt>start</tt>.
     *
     * @param start value to be assigned to property start
     */
    public void setStart(int start) {
        this.start = start;
    }

    /**
     * Getter method for property <tt>totalPage</tt>.
     *
     * @return property value of totalPage
     */
    public int getTotalPage() {
        return totalPage;
    }

    /**
     * Setter method for property <tt>totalPage</tt>.
     *
     * @param totalPage value to be assigned to property totalPage
     */
    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    /**
     * Getter method for property <tt>currentPage</tt>.
     *
     * @return property value of currentPage
     */
    public int getCurrentPage() {
        return currentPage;
    }

    /**
     * Setter method for property <tt>currentPage</tt>.
     *
     * @param currentPage value to be assigned to property currentPage
     */
    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }
}
