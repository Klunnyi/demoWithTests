package com.example.demowithtests.util.mappers;

import com.example.demowithtests.model.Document;
import com.example.demowithtests.dto.DocumentDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DocumentMapper {
    Document toDocument(DocumentDto documentDto);
}
