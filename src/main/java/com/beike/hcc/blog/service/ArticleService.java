<<<<<<< Updated upstream
package com.beike.hcc.blog.service;

import com.beike.hcc.blog.model.Article;

import java.util.ArrayList;

public interface ArticleService {
    //根据用户id获取所有的文章
     ArrayList<Article> getArticleList(Integer userId);
    //根据文章id获取文章
     Article getArticle(Integer articleId);
    //根据文章的id删除文章
    void deleteArticle(Integer articleId);
    //根据用户ID批量删除文章
    void deleteArticleList(Integer userId);
    //更新文章
    void updateArticle(Integer articleId, Article article);
    //添加新的文章
    void addArticle(Article article);
}
=======
package com.beike.hcc.blog.service;

import com.beike.hcc.blog.model.Article;

import java.util.ArrayList;

public interface ArticleService {
    //根据用户id获取所有的文章
    ArrayList<Article> getArticleListByUserId(Integer userId);

     ArrayList<Article> getArticleList();
    //根据文章id获取文章
     Article getArticle(Integer articleId);
    //根据文章的id删除文章
    void deleteArticle(Integer articleId);
    //根据用户ID批量删除文章
    void deleteArticleList(Integer userId);
    //更新文章
    void updateArticle(Integer articleId,Article article);
    //添加新的文章
    void addArticle(Article article);
}
>>>>>>> Stashed changes
