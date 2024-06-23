package com.example.demowithtests.controller.document;

import com.example.demowithtests.model.Document;


public interface DocumentResource {

    Document createDocument(Document document);

    Document getDocumentById(Integer id);
}
