package com.david.weblog.component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

//import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.david.weblog.model.Post;
import com.david.weblog.repository.PostRepository;

@Component
public class LoadedData {

    @Autowired
    PostRepository postRepository;

    //@PostConstruct
    public void savePosts(){

        List<Post> postList = new ArrayList<>();
        Post post1 = new Post();
        post1.setAutor("David Mateus");
        post1.setData(LocalDate.now());
        post1.setTitulo("Java");
        post1.setTexto("Java is a high-level, class-based, object-oriented programming language that is designed to have as few implementation dependencies as possible. It is a general-purpose programming language intended to let programmers write once, run anywhere (WORA), meaning that compiled Java code can run on all platforms that support Java without the need to recompile. Java applications are typically compiled to bytecode that can run on any Java virtual machine (JVM) regardless of the underlying computer architecture.");

        Post post2 = new Post();
        post2.setAutor("David Mateus");
        post2.setData(LocalDate.now());
        post2.setTitulo("Spring Boot");
        post2.setTexto("The Spring Framework is an application framework and inversion of control container for the Java platform. The framework's core features can be used by any Java application, but there are extensions for building web applications on top of the Java EE (Enterprise Edition) platform. Although the framework does not impose any specific programming model, it has become popular in the Java community as an addition to the Enterprise JavaBeans (EJB) model. The Spring Framework is open source.");

        postList.add(post1);
        postList.add(post2);

        for(Post post: postList){
            Post postSaved = postRepository.save(post);
            System.out.println(postSaved.getId());
        }
    }
}