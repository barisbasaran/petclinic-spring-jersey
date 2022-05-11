package io.baris.petclinic.springjersey.system;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.ServletContextRequestLoggingFilter;

/**
 * Logs the HTTP calls
 */
@Configuration
public class PetclinicRequestLogConfig {

    @Bean
    public ServletContextRequestLoggingFilter logFilter() {
        var filter = new ServletContextRequestLoggingFilter();
        filter.setIncludeQueryString(true);
        filter.setIncludePayload(true);
        filter.setMaxPayloadLength(10000);
        filter.setIncludeHeaders(false);
        filter.setAfterMessagePrefix("REQUEST DATA : ");
        return filter;
    }
}
