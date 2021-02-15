package eu.europa.ec.digit.search;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootApplication
public class Application implements CommandLineRunner {

    private static final Logger LOGGER = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        LOGGER.info("Starting");
        System.exit(0);
    }

    protected String sortMyString(String unsortedString) {

        List<String> list = Arrays.asList(unsortedString.split(" "));
        Collections.sort(list, Comparator.comparing(String::toLowerCase));
        return String.join(" ", list);

    }

    protected List<String> removeDuplicatesFromList(List<String> values) {

        return values.stream()
                .distinct()
                .collect(Collectors.toList());
    }

}
