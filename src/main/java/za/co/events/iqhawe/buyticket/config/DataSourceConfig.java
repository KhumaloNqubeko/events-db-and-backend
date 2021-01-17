package za.co.events.iqhawe.buyticket.config;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;

import javax.sql.DataSource;

//@Configuration
public class DataSourceConfig {
//    @Bean
    public BasicDataSource dataSource() throws URISyntaxException {
    	System.out.println("====================" + System.getenv("SPRING_DATASOURCE_URL"));
//        URI dbUri = new URI(System.getenv("DATABASE_URL"));
//
//        String username = dbUri.getUserInfo().split(":")[0];
//        String password = dbUri.getUserInfo().split(":")[1];
//        String dbUrl = "jdbc:postgresql://" + dbUri.getHost() + ':' + dbUri.getPort() + dbUri.getPath() + "?sslmode=require";

        BasicDataSource basicDataSource = new BasicDataSource();
//        basicDataSource.setUrl(dbUrl);
//        basicDataSource.setUsername(username);
//        basicDataSource.setPassword(password);

        return basicDataSource;
    }
}
