package com.hyf.myspringboot.common;

import java.util.List;

/**
 * @author howinfun
 * @version 1.0
 * @desc
 * @date 2018/11/26
 * @company XMJBQ
 */
public class PageBean<T> {

    private Integer currentPage = 1;
    private Integer pageSize = 10;
    private String orderFields;  // 排序字段，用，分隔
    private String sort = "DESC"; // 排序方式 desc降序 asc升序
    private Long totalRecord; // 总记录数
    private Integer totalPage; //总页数
    private List<T> dataList; // 查询的数据

    public PageBean() {
    }

    public PageBean(Integer currentPage, Integer pageSize, String orderFields, String sort, Long totalRecord, Integer totalPage, List<T> dataList) {
        this.currentPage = currentPage;
        this.pageSize = pageSize;
        this.orderFields = orderFields;
        this.sort = sort;
        this.totalRecord = totalRecord;
        this.totalPage = totalPage;
        this.dataList = dataList;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public String getOrderFields() {
        return orderFields;
    }

    public void setOrderFields(String orderFields) {
        this.orderFields = orderFields;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public Long getTotalRecord() {
        return totalRecord;
    }

    public void setTotalRecord(Long totalRecord) {
        //设置总记录数的时候就可以计算出总页数了。
        if (totalRecord != null) {
            //this.start = (this.currentPage - 1) * this.pageSize;
            this.totalPage = (int) ((totalRecord % this.pageSize) == 0 ? (totalRecord / this.pageSize) : (totalRecord / this.pageSize) + 1);
        }
        this.totalRecord = totalRecord;
    }

    public Integer getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    public List<T> getDataList() {
        return dataList;
    }

    public void setDataList(List<T> dataList) {
        this.dataList = dataList;
    }
}
