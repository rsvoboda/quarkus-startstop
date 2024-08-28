package io.quarkus.ts.startstop.utils;

import static io.quarkus.ts.startstop.utils.OpenTelemetryCollector.GET_HELLO_INVOCATION_TRACED;
import static io.quarkus.ts.startstop.utils.OpenTelemetryCollector.GET_HELLO_TRACES_URL;

/**
 * Available endpoitns and expected content.
 */
public enum URLContent {
    JAKARTA_REST_MINIMAL(new String[][]{
            new String[]{"http://localhost:8080/data/hello", "Hello World"},
            new String[]{"http://localhost:8080", "Hello from a simple Jakarta REST app."}
    }),
    FULL_MICROPROFILE(new String[][]{
            // new String[]{"http://localhost:8080/data/serialization/json/complex-dto", "Vive la résistance!"},
            new String[]{"http://localhost:8080/data/hello", "Hello World"},
            new String[]{"http://localhost:8080", "Hello from a full MicroProfile suite"},
            new String[]{"http://localhost:8080/data/config/injected", "Config value as Injected by CDI Injected value"},
            new String[]{"http://localhost:8080/data/config/lookup", "Config value from ConfigProvider lookup value"},
    }),
    GENERATED_SKELETON(new String[][]{
            new String[]{"http://localhost:8080/", "Congratulation! You are on landing page."},
            new String[]{"http://localhost:8080/hello", "Bye RESTEasy"},
            new String[]{"http://localhost:8080/hello-added", "Hello added"},
            new String[]{"http://localhost:8080/hello", "Bye from Quarkus REST"},
    });

    public final String[][] urlContent;

    URLContent(String[][] urlContent) {
        this.urlContent = urlContent;
    }
}
