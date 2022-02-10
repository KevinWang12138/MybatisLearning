import com.hello.dao.BlogMapper;
import com.hello.pojo.Blog;
import com.hello.utils.IDUtils;
import com.hello.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.*;

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
        ArrayList<String> l=new ArrayList<>();
        l.add("1");
        l.add("2");
        l.add("3");
        map.put("ids",l);
        map.put("author","Kevin");
//        blogMapper.updateBlog(map);

        List<Blog> ll=blogMapper.queryBlogForeach(map);
        for(Blog b:ll){
            System.out.println(b);
        }


    }
}
