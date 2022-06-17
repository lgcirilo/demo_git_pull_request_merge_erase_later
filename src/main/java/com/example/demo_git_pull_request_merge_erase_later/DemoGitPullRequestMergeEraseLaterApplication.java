package com.example.demo_git_pull_request_merge_erase_later;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoGitPullRequestMergeEraseLaterApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoGitPullRequestMergeEraseLaterApplication.class, args);
        Logger log = LoggerFactory.getLogger(DemoGitPullRequestMergeEraseLaterApplication.class);
        log.error("ESTAH TUDO BEM. NADA PRA VER AQUI");
    }

}
