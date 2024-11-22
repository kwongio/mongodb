package org.example.mongodb;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PostService {
    private final PostRepository postRepository;

    public Post insert() {
        return postRepository.insert(Post.builder()
                .title("제목입니당")
                .build());
    }

    public Post findById(Long postId) {
        return postRepository.findById(postId).orElseThrow(() -> new IllegalArgumentException("해당 게시글이 없습니다."));
    }
}
