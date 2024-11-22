package org.example.mongodb;


import java.net.http.HttpResponse.ResponseInfo;
import lombok.RequiredArgsConstructor;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/posts")
public class PostController {

    private final PostService postService;

    @PostMapping
    public ResponseEntity<Post> create() {
        Post post = postService.insert();
        return ResponseEntity.status(HttpStatus.CREATED).body(post);
    }

    @GetMapping("/{postId}")
    public ResponseEntity<Post> findById(@PathVariable Long postId) {
        return ResponseEntity.ok(postService.findById(postId));

    }
}
