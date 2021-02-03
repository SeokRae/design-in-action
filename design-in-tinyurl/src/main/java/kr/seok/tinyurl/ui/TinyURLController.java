package kr.seok.tinyurl.ui;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class TinyURLController {

    /**
     *  createURL(api_dev_key, original_url, custom_alias=None, user_name=None, expire_date=None)
     */
    @PostMapping("/tinyurl/{original_url}")
    public ResponseEntity<String> createURL(
            @PathVariable(name = "original_url") String original_url) {

        return ResponseEntity
                .ok()
                .body("{}");
    }

    /**
     *  deleteURL(api_dev_key, url_key)
     */
    @DeleteMapping("/tinyurl/{custom_url}")
    public ResponseEntity<String> deleteURL(
            @PathVariable("custom_url") String custom_url) {

        return ResponseEntity
                .ok()
                .body("{}");
    }
}
