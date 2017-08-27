package com.ricelink.weixin.mapper.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "eos_dict_entry")
public class EosDictEntry {
    @Id
    @Column(name = "DICTTYPEID")
    private String dicttypeid;

    @Id
    @Column(name = "DICTID")
    private String dictid;

    @Column(name = "DICTNAME")
    private String dictname;

    @Column(name = "STATUS")
    private Integer status;

    @Column(name = "SORTNO")
    private Integer sortno;

    @Column(name = "RANK")
    private Integer rank;

    @Column(name = "PARENTID")
    private String parentid;

    @Column(name = "SEQNO")
    private String seqno;

    @Column(name = "FILTER1")
    private String filter1;

    @Column(name = "FILTER2")
    private String filter2;

    /**
     * @return DICTTYPEID
     */
    public String getDicttypeid() {
        return dicttypeid;
    }

    /**
     * @param dicttypeid
     */
    public void setDicttypeid(String dicttypeid) {
        this.dicttypeid = dicttypeid;
    }

    /**
     * @return DICTID
     */
    public String getDictid() {
        return dictid;
    }

    /**
     * @param dictid
     */
    public void setDictid(String dictid) {
        this.dictid = dictid;
    }

    /**
     * @return DICTNAME
     */
    public String getDictname() {
        return dictname;
    }

    /**
     * @param dictname
     */
    public void setDictname(String dictname) {
        this.dictname = dictname;
    }

    /**
     * @return STATUS
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * @param status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * @return SORTNO
     */
    public Integer getSortno() {
        return sortno;
    }

    /**
     * @param sortno
     */
    public void setSortno(Integer sortno) {
        this.sortno = sortno;
    }

    /**
     * @return RANK
     */
    public Integer getRank() {
        return rank;
    }

    /**
     * @param rank
     */
    public void setRank(Integer rank) {
        this.rank = rank;
    }

    /**
     * @return PARENTID
     */
    public String getParentid() {
        return parentid;
    }

    /**
     * @param parentid
     */
    public void setParentid(String parentid) {
        this.parentid = parentid;
    }

    /**
     * @return SEQNO
     */
    public String getSeqno() {
        return seqno;
    }

    /**
     * @param seqno
     */
    public void setSeqno(String seqno) {
        this.seqno = seqno;
    }

    /**
     * @return FILTER1
     */
    public String getFilter1() {
        return filter1;
    }

    /**
     * @param filter1
     */
    public void setFilter1(String filter1) {
        this.filter1 = filter1;
    }

    /**
     * @return FILTER2
     */
    public String getFilter2() {
        return filter2;
    }

    /**
     * @param filter2
     */
    public void setFilter2(String filter2) {
        this.filter2 = filter2;
    }
}