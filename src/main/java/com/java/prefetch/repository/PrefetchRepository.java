package com.java.prefetch.repository;

import com.java.prefetch.dto.PrefetchDTO;
import com.java.prefetch.model.Prefetch;
import com.java.prefetch.util.PrefetchUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class PrefetchRepository {

    @Autowired
    private PrefetchUtil prefetchUtil;

    public List<Prefetch> getAllPrefetch(){
        return prefetchUtil.getAllPrefetch();
    }

    public Prefetch getPrefetchById(int id){
        return prefetchUtil.getPrefetchById(id);
    }

    public Prefetch addPost(PrefetchDTO prefetchDTO){
        return prefetchUtil.addPost(prefetchDTO);
    }

    public Prefetch updatePost(PrefetchDTO prefetchDTO){
        return prefetchUtil.updatePost(prefetchDTO);
    }

    public void deletePost(int id){
        prefetchUtil.deletePost(id);
    }
}
