package com.java.prefetch.util;

import com.java.prefetch.dto.PrefetchDTO;
import com.java.prefetch.model.Prefetch;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PrefetchUtil {

    private static List<Prefetch> PREFETCH_LIST = new ArrayList<>();

    public PrefetchUtil(){
        for(int i = 1; i <= 100; i++){
            PREFETCH_LIST.add(new Prefetch(i,i,"Title: " + i,"Body: " + i));
        }
    }

    public List<Prefetch> getAllPrefetch(){
        return PREFETCH_LIST;
    }

    public Prefetch getPrefetchById(int id){
        for(Prefetch prefetch : PREFETCH_LIST){
            if(prefetch.getId() == id){
                return prefetch;
            }
        }
        return null;
    }

    public Prefetch addPost(PrefetchDTO prefetchDTO){
        Prefetch lastPost = PREFETCH_LIST.get(PREFETCH_LIST.size() - 1);
        Prefetch newPost = new Prefetch(prefetchDTO.getUserId(), lastPost.getId() + 1 , prefetchDTO.getTitle(), prefetchDTO.getBody());
        PREFETCH_LIST.add(newPost);
        return newPost;
    }

    public Prefetch updatePost(PrefetchDTO prefetchDTO){
        for(Prefetch post : PREFETCH_LIST){
            if (post.getUserId() == prefetchDTO.getUserId()) {
                post.setTitle(prefetchDTO.getTitle());
                post.setBody(prefetchDTO.getBody());
                return post;
            }
        }
        return null;
    }

    public void deletePost(int id){
        PREFETCH_LIST.removeIf(prefetch -> prefetch.getId() == id);
    }

}
