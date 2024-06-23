package com.example.demowithtests.service.history;

import com.example.demowithtests.model.Document;
import com.example.demowithtests.model.History;

public interface HistoryService {
    History create(History history);
    History create(String description, Document document);
}
