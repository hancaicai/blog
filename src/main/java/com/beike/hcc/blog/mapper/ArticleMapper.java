package com.beike.hcc.blog.mapper;

import com.beike.hcc.blog.model.Article;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;

@Mapper
public interface ArticleMapper {
    Article  selectArticleById(Integer articleId);
    ArrayList<Article> selectArticle();
    ArrayList<Article> selectArticleByUserId(Integer userId);
    void insertArticle(Article article);
    void deleteArticleById(Integer articleId);
    void updateArticle( Integer articleId,Article article);
    void deleteArticleByUserId(Integer userId);
}
