package com.devilscode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Main {
    class GreetResponse {
        private final String greet;

        public GreetResponse(String greet) {
            this.greet = greet;
        }

        @Override
        public String toString() {
            return "GreetResponse [greet=" + greet + "]";
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + getEnclosingInstance().hashCode();
            result = prime * result + ((greet == null) ? 0 : greet.hashCode());
            return result;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            GreetResponse other = (GreetResponse) obj;
            if (!getEnclosingInstance().equals(other.getEnclosingInstance()))
                return false;
            if (greet == null) {
                if (other.greet != null)
                    return false;
            } else if (!greet.equals(other.greet))
                return false;
            return true;
        }

        public String getGreet() {
            return greet;
        }

        private Main getEnclosingInstance() {
            return Main.this;
        }
    }

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    // record GreetResponse(String greet) {
    // }

    @GetMapping(path = "/greet")
    public GreetResponse greet() {
        return new GreetResponse("Hello");
    }
}
