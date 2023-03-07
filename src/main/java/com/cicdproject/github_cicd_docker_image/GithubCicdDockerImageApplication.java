package com.cicdproject.github_cicd_docker_image;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GithubCicdDockerImageApplication {

	@GetMapping("/welcome")
	public String welcome(){
		return "Welcome to javatechie !";
	}

	/*echo "# docker_project" >> README.md
git init
git add README.md
git commit -m "first commit"
git branch -M main
git remote add origin https://github.com/ayoubSakkournet/docker_project.git
git push -u origin main*/

	public static void main(String[] args) {
		SpringApplication.run(GithubCicdDockerImageApplication.class, args);
	}

}
