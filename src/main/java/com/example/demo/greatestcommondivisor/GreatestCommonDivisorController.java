package com.example.demo.greatestcommondivisor;

import com.example.demo.greatestcommondivisor.request.GetGreatestCommonDivisorRequest;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/ggt")
@AllArgsConstructor
public class GreatestCommonDivisorController {

    private final GreatestCommonDivisorService greatestCommonDivisorService;

    @PostMapping
    public int getGreatestCommonDivisor(@RequestBody GetGreatestCommonDivisorRequest getGreatestCommonDivisorRequest) {
        return greatestCommonDivisorService
                .getGreatestCommonDivisor(getGreatestCommonDivisorRequest.val1(), getGreatestCommonDivisorRequest.val2());
    }
}
