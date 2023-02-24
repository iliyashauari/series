package com.range.series.service;

import com.range.series.model.Ranges;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Service
public class RangeService {
    public Ranges ranges = new Ranges();
    public ArrayList<String> matchingLabels(int num, HashMap<String, Ranges> mapRanges){

        ArrayList<String> result = new ArrayList<>();
        for (Map.Entry m : mapRanges.entrySet()) {
          ranges = (Ranges) m.getValue();
            if(num >= ranges.getInf() && num <= ranges.getSup())
            {
                result.add(ranges.getLabel());
            }
        }
        return result;
    }
}
