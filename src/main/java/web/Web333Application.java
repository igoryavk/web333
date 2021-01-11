package web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Web333Application implements CommandLineRunner {
    private DaoInterface dao;
    @Autowired
	public void setDao(DaoInterface dao) {
		this.dao = dao;
	}

	public static void main(String[] args) {
		SpringApplication.run(Web333Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
        dao.getData();
	}
}
