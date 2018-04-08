package main;

import java.util.Date;

/**
 * 作者：zyx on 2017/12/11 0011 16:56
 * 邮箱：zmmqq00@163.com
 * 描述：题目收藏
 */
public class CollectVO {
    private long iid;
    private long questionid;
    private String questiontype;
    private int pagertype;
    private String pagertypeid;
    private int iversion;
    private Date addDate;
    private int uid;
    // 隶属分类id
    private int page_category_id;
    // 章节的id
    private int ichapterid;
    
    public CollectVO(long iid, long questionid, String questiontype, int pagertype,
            String pagertypeid, int iversion, Date addDate, int uid,
            int page_category_id, int ichapterid) {
        this.iid = iid;
        this.questionid = questionid;
        this.questiontype = questiontype;
        this.pagertype = pagertype;
        this.pagertypeid = pagertypeid;
        this.iversion = iversion;
        this.addDate = addDate;
        this.uid = uid;
        this.page_category_id = page_category_id;
        this.ichapterid = ichapterid;
    }
    public CollectVO() {
    }
    public long getIid() {
        return this.iid;
    }
    public void setIid(long iid) {
        this.iid = iid;
    }
    public long getQuestionid() {
        return this.questionid;
    }
    public void setQuestionid(long questionid) {
        this.questionid = questionid;
    }
    public String getQuestiontype() {
        return this.questiontype;
    }
    public void setQuestiontype(String questiontype) {
        this.questiontype = questiontype;
    }
    public int getPagertype() {
        return this.pagertype;
    }
    public void setPagertype(int pagertype) {
        this.pagertype = pagertype;
    }
    public String getPagertypeid() {
        return this.pagertypeid;
    }
    public void setPagertypeid(String pagertypeid) {
        this.pagertypeid = pagertypeid;
    }
    public int getIversion() {
        return this.iversion;
    }
    public void setIversion(int iversion) {
        this.iversion = iversion;
    }
    public Date getAddDate() {
        return this.addDate;
    }
    public void setAddDate(Date addDate) {
        this.addDate = addDate;
    }
    public int getUid() {
        return this.uid;
    }
    public void setUid(int uid) {
        this.uid = uid;
    }
    public int getPage_category_id() {
        return this.page_category_id;
    }
    public void setPage_category_id(int page_category_id) {
        this.page_category_id = page_category_id;
    }
    public int getIchapterid() {
        return this.ichapterid;
    }
    public void setIchapterid(int ichapterid) {
        this.ichapterid = ichapterid;
    }

    @Override
    public String toString() {
        return "CollectVO{" +
                "iid=" + iid +
                ", questionid=" + questionid +
                ", questiontype='" + questiontype + '\'' +
                ", pagertype=" + pagertype +
                ", pagertypeid='" + pagertypeid + '\'' +
                ", iversion=" + iversion +
                ", addDate=" + addDate +
                ", uid=" + uid +
                ", page_category_id=" + page_category_id +
                ", ichapterid=" + ichapterid +
                '}';
    }
}
