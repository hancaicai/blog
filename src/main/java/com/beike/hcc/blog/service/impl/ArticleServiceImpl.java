package com.beike.hcc.blog.service.impl;

import com.beike.hcc.blog.mapper.ArticleMapper;
import com.beike.hcc.blog.model.Article;
import com.beike.hcc.blog.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;

public class ArticleServiceImpl implements ArticleService {
    @Autowired
    ArticleMapper articleMapper;
    //获取文件列表根据时间排列
    public ArrayList<Article> getArticleList(){
        ArrayList<Article> articleList=articleMapper.selectArticle();
        return articleList;
    }

    //根据用户id获取所有的文章
    public ArrayList<Article> getArticleListByUserId(Integer userId){
        ArrayList<Article> articleList=articleMapper.selectArticleByUserId(userId);
        return articleList;
    }
    //根据文章id获取文章
    public Article getArticle(Integer articleId){
        return articleMapper.selectArticleById(articleId);
    }
    //根据文章的id删除文章
    public void deleteArticle(Integer articleId){
        articleMapper.deleteArticleById(articleId);
    }
    //根据用户ID批量删除文章
    public void deleteArticleList(Integer userId){
        articleMapper.deleteArticleByUserId(userId);
    }
    //更新文章
    public void updateArticle(Integer articleId,Article article){
        articleMapper.updateArticle(articleId,article);
    }
    //添加新的文章
    public void addArticle(Article article){
        articleMapper.insertArticle(article);
    }
}
