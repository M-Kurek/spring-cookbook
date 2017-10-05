package packt.springboot.cookbook;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import packt.springboot.cookbook.repository.BookRepository;

import javax.sql.DataSource;

public class StartupRunner implements CommandLineRunner {
    protected final Log logger = LogFactory.getLog(getClass());

    /**
     * more org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration
     */
    @Autowired
    private DataSource ds;

    @Autowired
    private BookRepository bookRepository;

    public void run(String... args) throws Exception {
        logger.info("Number of books: " + bookRepository.count());
    }
}
