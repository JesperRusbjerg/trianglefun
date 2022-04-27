package com.example.trianglebackendd;

import com.example.trianglebackendd.entities.Triangle;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@Controller
public class TriangleController {

    @PostMapping(path = "/triangle", consumes = "application/json", produces = "application/json")
    public ResponseEntity sayHello(@RequestBody Triangle triangle) {

        //Check for invalid input return 404 bad request with appropriate message
        if (triangle.getAside() <= 0 || triangle.getBside() <= 0 || triangle.getCside() <= 0) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Invalid request, please ensure all sides are greater than 0 and is a number");
        }

        if (triangle.getAside() >= (triangle.getBside() + triangle.getCside()) || triangle.getCside() >= (triangle.getBside() + triangle.getAside()) || triangle.getBside() >= (triangle.getAside() + triangle.getCside()))
            triangle.setTriangleDefinition("Not a triangle");
        else if (triangle.getAside() == triangle.getBside() && triangle.getBside() == triangle.getCside())
            triangle.setTriangleDefinition("Equilateral Triangle");
        else if (triangle.getAside() != triangle.getBside() && triangle.getBside() != triangle.getCside() && triangle.getCside() != triangle.getAside())
            triangle.setTriangleDefinition("Scalene Triangle");
        else if (triangle.getAside() == triangle.getBside() || triangle.getCside() == triangle.getAside() || triangle.getCside() == triangle.getBside())
            triangle.setTriangleDefinition("Isosceles Triangle");

        return ResponseEntity.ok(triangle);
    }
}