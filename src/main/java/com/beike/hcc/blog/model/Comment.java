package com.beike.hcc.blog.model;

import java.util.Date;

public class Comment {
    private Integer userId;
    private Date commentPostTime;
    private Date commentUpdateTime;
    private Integer articleId;

    private  String Content;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getCommentPostTime() {
        return commentPostTime;
    }

    public void setCommentPostTime(Date commentPostTime) {
        this.commentPostTime = commentPostTime;
    }

    public Date getCommentUpdateTime() {
        return commentUpdateTime;
    }

    public void setCommentUpdateTime(Date commentUpdateTime) {
        this.commentUpdateTime = commentUpdateTime;
    }

    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }
    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }
}
