package com.example.demo;

import com.example.demo.model.Answer;
import com.example.demo.model.Question;
import com.example.demo.repository.AnswerRepository;
import com.example.demo.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	@Autowired
	private QuestionRepository questionRepository;
	private AnswerRepository answerRepository;

	public DemoApplication(QuestionRepository questionRepository, AnswerRepository answerRepository) {

		this.questionRepository = questionRepository;
		this.answerRepository = answerRepository;
	}


	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		questionRepository.save(new Question("What sweet food made by bees using nectar from flowers?"));
		questionRepository.save(new Question(" Name the school that Harry Potter attended?"));
		questionRepository.save(new Question(" Which country is home to the kangaroo?"));
		questionRepository.save(new Question(" Which country sent an Armada to attack Britain in 1588? "));
		questionRepository.save(new Question("Saint Patrick is the Patron Saint of which country? "));
		questionRepository.save(new Question("From what tree do acorns come?"));
		questionRepository.save(new Question("What is the top colour in a rainbow?"));
		questionRepository.save(new Question("In the nursery rhyme, who sat on a wall before having a great fall?"));
		questionRepository.save(new Question("Which big country is closest to New Zealand? "));
		questionRepository.save(new Question("Where in Scotland is there supposedly a lake monster called Nessie?"));
		questionRepository.save(new Question("What is the name of the policeman in the pre-school children’ television series Balamory?"));
		questionRepository.save(new Question("What is the name of the Queen in England? "));

		answerRepository.save(new Answer("Honey"));
		answerRepository.save(new Answer("Roxfort"));
		answerRepository.save(new Answer("Australia"));
		answerRepository.save(new Answer("Spain"));
		answerRepository.save(new Answer("Ireland"));
		answerRepository.save(new Answer("Oak"));
		answerRepository.save(new Answer("Rose"));
		answerRepository.save(new Answer("Humpy Dumpy"));
		answerRepository.save(new Answer("Australia"));
		answerRepository.save(new Answer("Lochness"));
		answerRepository.save(new Answer("John"));
		answerRepository.save(new Answer("ELisabeth"));

		}
	}

