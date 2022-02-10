import com.hello.dao.BlogMapper;
import com.hello.pojo.Blog;
import com.hello.utils.IDUtils;
import com.hello.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyTest {
    @Test
    public void addInitBlog(){
        SqlSession sqlSession= MybatisUtils.getSqlSession();
        BlogMapper blogMapper=sqlSession.getMapper(BlogMapper.class);
//        Blog blog=new Blog();
//        blog.setId(IDUtils.getId());
//        blog.setTitle("Mybatis如此简单");
//        blog.setAuthor("王谦铭");
//        blog.setCreateTime(new Date());
//        blog.setViews(9999);
//        blogMapper.addBook(blog);
//
//        blog.setId(IDUtils.getId());
//        blog.setTitle("Java如此简单");
//        blog.setCreateTime(new Date());
//        blogMapper.addBook(blog);
//
//        blog.setId(IDUtils.getId());
//        blog.setTitle("Spring如此简单");
//        blog.setCreateTime(new Date());
//        blogMapper.addBook(blog);
//
//        blog.setId(IDUtils.getId());
//        blog.setTitle("Mysql如此简单");
//        blog.setCreateTime(new Date());
//        blogMapper.addBook(blog);

        Map map=new HashMap();
        map.put("id","38abc904bb554480aa75a78b0ba5e2a1");
        map.put("author","Kevin");
        blogMapper.updateBlog(map);

//        List<Blog> l=blogMapper.queryBlogChoose(map);
//        for(Blog b:l){
//            System.out.println(b);
//        }


    }
}
