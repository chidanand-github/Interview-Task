package com.example.chidu;

import java.io.ObjectInputStream.GetField;
import java.net.HttpRetryException;
import java.nio.file.Paths;

import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitHubApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(GitHubApplication.class, args);
	
		String repoUrl = "https://github.com/chidanand-github/sampleRepo.git";
		String cloneDirectoryPath = "git/chiduRepo/code"; // Ex.in windows c:\\gitProjects\SpringBootMongoDbCRUD\
		try {
			System.out.println("inside try");
		    System.out.println("Cloning "+repoUrl+" into "+repoUrl);
		    Git.cloneRepository()
		        .setURI(repoUrl)
		        .setDirectory(Paths.get(cloneDirectoryPath).toFile())
		        .call();
		    System.out.println("Completed Cloning");
		} catch (GitAPIException e) {
		    System.out.println("Exception occurred while cloning repo");
		    e.printStackTrace();
		}
	
	}

}
