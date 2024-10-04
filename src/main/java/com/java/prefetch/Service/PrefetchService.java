package com.java.prefetch.Service;

import com.java.prefetch.dto.PrefetchDTO;
import com.java.prefetch.model.Prefetch;
import com.java.prefetch.repository.PrefetchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrefetchService {

    @Autowired
    private PrefetchRepository prefetchRepository;

    public List<Prefetch> getAllPrefetch() {
        return prefetchRepository.getAllPrefetch();
    }

    public Prefetch getPrefetchById(int id){
       return prefetchRepository.getPrefetchById(id);
    }

    public Prefetch addPost(PrefetchDTO prefetchDTO){
        return prefetchRepository.addPost(prefetchDTO);
    }

    public Prefetch updatePost(PrefetchDTO prefetchDTO){
        return prefetchRepository.updatePost(prefetchDTO);
    }

    public void deletePost(int id){
        prefetchRepository.deletePost(id);
    }
}
