package com.beike.hcc.blog;

import com.beike.hcc.blog.model.Article;
import com.beike.hcc.blog.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.lang.reflect.Array;
import java.util.ArrayList;

@SpringBootApplication

public class BlogApplication {
	public static void main(String[] args) { SpringApplication.run(BlogApplication.class, args); }
}
