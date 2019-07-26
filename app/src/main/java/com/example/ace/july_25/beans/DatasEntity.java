package com.example.ace.july_25.beans;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;

/**
 * Created by ACE on 2019/7/23.
 */
@Entity
public class DatasEntity {
    /**
     * superChapterName : 问答
     * publishTime : 1561479790000
     * visible : 1
     * niceDate : 15小时前
     * projectLink :
     * author : xiaoyang
     * prefix :
     * zan : 8
     * origin :
     * chapterName : 官方
     * link : https://www.wanandroid.com/wenda/show/8634
     * title : 每日一问 有没有使用过 DataBinding ，有什么优点、缺点，遇到过哪些坑？
     * type : 0
     * userId : 2
     * tags : [{"name":"问答","url":"/article/list/0?cid=440"}]
     * apkLink :
     * envelopePic :
     * chapterId : 440
     * superChapterId : 440
     * id : 8634
     * fresh : true
     * collect : false
     * courseId : 13
     * desc : <p>1. 谈谈 DataBinding 的体验；</p><p>2. 遇到的坑；</p><p>3. 有什么优缺点。</p><br><p>本周1/3。</p>
     */
    private String superChapterName;
    private long publishTime;
    private int visible;
    private String niceDate;
    private String projectLink;
    private String author;
    private String prefix;
    private int zan;
    private String origin;
    private String chapterName;
    private String link;
    private String title;
    private int type;
    private int userId;
    private String apkLink;
    private String envelopePic;
    private int chapterId;
    private int superChapterId;
    @Id
    private Long id;
    private boolean fresh;
    private boolean collect;
    private int courseId;
    private String desc;
    @Generated(hash = 654238579)
    public DatasEntity(String superChapterName, long publishTime, int visible,
            String niceDate, String projectLink, String author, String prefix, int zan,
            String origin, String chapterName, String link, String title, int type,
            int userId, String apkLink, String envelopePic, int chapterId, int superChapterId,
            Long id, boolean fresh, boolean collect, int courseId, String desc) {
        this.superChapterName = superChapterName;
        this.publishTime = publishTime;
        this.visible = visible;
        this.niceDate = niceDate;
        this.projectLink = projectLink;
        this.author = author;
        this.prefix = prefix;
        this.zan = zan;
        this.origin = origin;
        this.chapterName = chapterName;
        this.link = link;
        this.title = title;
        this.type = type;
        this.userId = userId;
        this.apkLink = apkLink;
        this.envelopePic = envelopePic;
        this.chapterId = chapterId;
        this.superChapterId = superChapterId;
        this.id = id;
        this.fresh = fresh;
        this.collect = collect;
        this.courseId = courseId;
        this.desc = desc;
    }
    @Generated(hash = 1241047165)
    public DatasEntity() {
    }
    public String getSuperChapterName() {
        return this.superChapterName;
    }
    public void setSuperChapterName(String superChapterName) {
        this.superChapterName = superChapterName;
    }
    public long getPublishTime() {
        return this.publishTime;
    }
    public void setPublishTime(long publishTime) {
        this.publishTime = publishTime;
    }
    public int getVisible() {
        return this.visible;
    }
    public void setVisible(int visible) {
        this.visible = visible;
    }
    public String getNiceDate() {
        return this.niceDate;
    }
    public void setNiceDate(String niceDate) {
        this.niceDate = niceDate;
    }
    public String getProjectLink() {
        return this.projectLink;
    }
    public void setProjectLink(String projectLink) {
        this.projectLink = projectLink;
    }
    public String getAuthor() {
        return this.author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getPrefix() {
        return this.prefix;
    }
    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }
    public int getZan() {
        return this.zan;
    }
    public void setZan(int zan) {
        this.zan = zan;
    }
    public String getOrigin() {
        return this.origin;
    }
    public void setOrigin(String origin) {
        this.origin = origin;
    }
    public String getChapterName() {
        return this.chapterName;
    }
    public void setChapterName(String chapterName) {
        this.chapterName = chapterName;
    }
    public String getLink() {
        return this.link;
    }
    public void setLink(String link) {
        this.link = link;
    }
    public String getTitle() {
        return this.title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public int getType() {
        return this.type;
    }
    public void setType(int type) {
        this.type = type;
    }
    public int getUserId() {
        return this.userId;
    }
    public void setUserId(int userId) {
        this.userId = userId;
    }
    public String getApkLink() {
        return this.apkLink;
    }
    public void setApkLink(String apkLink) {
        this.apkLink = apkLink;
    }
    public String getEnvelopePic() {
        return this.envelopePic;
    }
    public void setEnvelopePic(String envelopePic) {
        this.envelopePic = envelopePic;
    }
    public int getChapterId() {
        return this.chapterId;
    }
    public void setChapterId(int chapterId) {
        this.chapterId = chapterId;
    }
    public int getSuperChapterId() {
        return this.superChapterId;
    }
    public void setSuperChapterId(int superChapterId) {
        this.superChapterId = superChapterId;
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public boolean getFresh() {
        return this.fresh;
    }
    public void setFresh(boolean fresh) {
        this.fresh = fresh;
    }
    public boolean getCollect() {
        return this.collect;
    }
    public void setCollect(boolean collect) {
        this.collect = collect;
    }
    public int getCourseId() {
        return this.courseId;
    }
    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }
    public String getDesc() {
        return this.desc;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }
}