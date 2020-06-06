package technicalblog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import technicalblog.model.Post;
import technicalblog.repository.PostRepository;

import java.util.Date;
import java.util.List;

@Service
public class PostService {

    public PostService() {
        System.out.println("*** PostService ***");
    }

    @Autowired
    private PostRepository postRepository;

    public List<Post> getAllPosts(){
        return postRepository.getAllPosts();

/*       Post post1 = new Post();
        post1.setTitle("Post 1");
        post1.setBody("Body of Post 1");
        post1.setDate(new Date());

        posts.add(post1);

        Post post2 = new Post();
        post2.setTitle("Post 2");
        post2.setBody("Body of Post 2");
        post2.setDate(new Date());

        posts.add(post2);

        Post post3 = new Post();
        post3.setTitle("Post 3");
        post3.setBody("Body of Post 3");
        post3.setDate(new Date());

        posts.add(post3);*/

/*        Connection con = null;
        try {
            Class.forName("org.postgresql.Driver");

            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/technicalblog", "postgres", "admin123");

            Statement statement = con.createStatement();

            ResultSet rs = statement.executeQuery("SELECT * FROM posts");
            while(rs.next()){
                Post post = new Post();
                post.setTitle(rs.getString("title"));
                post.setBody(rs.getString("body"));
                posts.add(post);
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        finally {
            try {
                con.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }*/

    }

    public Post getOnePost() {
        return postRepository.getLatestPost();
/*        Post post1 = new Post();
        post1.setTitle("This is your Post");
        post1.setBody("This is your Post. It has some valid content");
        post1.setDate(new Date());
        posts.add(post1);*/

/*        Connection con = null;
        try {
            Class.forName("org.postgresql.Driver");

            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/technicalblog", "postgres", "admin123");

            Statement statement = con.createStatement();

            ResultSet rs = statement.executeQuery("SELECT * FROM posts WHERE id = 4");
            while(rs.next()){
                Post post = new Post();
                post.setTitle(rs.getString("title"));
                post.setBody(rs.getString("body"));
                posts.add(post);
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        finally {
            try {
                con.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return posts;*/

    }

    public void createPost(Post newPost){
        newPost.setDate(new Date());
        postRepository.createPost(newPost);
    }

    public Post getPost(Integer postId){
        return postRepository.getPost(postId);
    }

    public void updatePost(Post updatedPost){
        updatedPost.setDate(new Date());
        postRepository.updatePost(updatedPost);
    }

    public void deletePost(Integer postId) {
        postRepository.deletePost(postId);
    }

}