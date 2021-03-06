package com.automile.model.enums;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum DeviceType {
    Apple(0),
    Android(1),
    WindowsPhone(2);

    private Integer value;

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
