package com.hello.dao;

import com.hello.pojo.Blog;

import java.util.List;
import java.util.Map;

public interface BlogMapper {
    void addBook(Blog blog);

    //查询博客
    List<Blog> queryBlogIF(Map map);

    List<Blog> queryBlogWhere(Map map);

    List<Blog> queryBlogChoose(Map map);

    void updateBlog(Map map);
}
