package com.example.demo.fibonacci;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping(path = "api/v1/fibonacci")
@AllArgsConstructor
public class FibonacciController {

    private final FibonacciService fibonacciService;

    @GetMapping("/{position}")
    public Long getFibonacciPosition(@PathVariable("position") int position) {
        return fibonacciService.getFibonacciPosition(position);
    }
}
