package com.automile.model;

import com.automile.model.enums.TripType;
import com.automile.model.enums.TripTypeTrigger;
import com.google.common.collect.Lists;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.List;


@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PlaceModel {
    Integer placeId;
    String name;
    String description;
    PositionPointModel positionPoint;
    TripType tripType;
    TripTypeTrigger tripTypeTrigger;
    Integer radius;
    Boolean isEditable;
    List<Integer> vehicleIds = Lists.newArrayList();
    Integer drivesBetweenAnotherPlaceId;
}