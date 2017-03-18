package com.automile.model;

import com.google.common.collect.Lists;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CustomCategoryPostModel {
    Integer contactId;
    List<CustomCategoryCreateModel> added = Lists.newArrayList();
    List<Integer> removed = Lists.newArrayList();
}