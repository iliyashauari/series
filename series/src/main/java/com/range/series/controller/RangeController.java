package com.range.series.controller;

import com.range.series.model.Ranges;
import com.range.series.service.RangeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;


@RestController
@RequestMapping("/ranges")
public class RangeController {

    public HashMap<String, Ranges> rangesHashMap = new HashMap<>();
    static final Ranges rangeA = new Ranges("A",1,8);
    static final Ranges rangeB = new Ranges("B",10,26);
    static final Ranges rangeC = new Ranges("C",4,18);

    public ArrayList<Ranges> rangesArrayList = new ArrayList<>();


    @Autowired
    private RangeService rangeService;
    @GetMapping("/matching-label/{num}")
    public ArrayList<String> matching(@PathVariable int num){
    rangesHashMap.put(rangeA.getLabel(),rangeA);
    rangesHashMap.put(rangeB.getLabel(),rangeB);
    rangesHashMap.put(rangeC.getLabel(),rangeC);

    return rangeService.matchingLabels(num, rangesHashMap);

    }
}



