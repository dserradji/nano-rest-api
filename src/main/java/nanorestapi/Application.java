package nanorestapi;

import static org.springframework.web.reactive.function.BodyInserters.fromObject;
import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;
import static org.springframework.web.reactive.function.server.RouterFunctions.toHttpHandler;
import static org.springframework.web.reactive.function.server.ServerResponse.ok;

import org.springframework.http.server.reactive.UndertowHttpHandlerAdapter;

import io.undertow.Undertow;

public class Application {

	public static void main(String[] args) {
		Undertow.builder().addHttpListener(8080, "localhost")
				.setHandler(new UndertowHttpHandlerAdapter(
						toHttpHandler(route(GET("/greetings"), request -> ok().body(fromObject("Hello World"))))))
				.build().start();
	}

}
