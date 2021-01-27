package kr.seok.tinyurl.ui;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TinyURLController {

    @GetMapping("/tinyurl/{url}")
    public ResponseEntity<String> getUrl(@PathVariable(name = "url") String url) {
        return ResponseEntity.ok()
                .body("{}");
    }
}
