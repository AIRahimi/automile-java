/**
 * Automile API
 * No descripton provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 * <p>
 * OpenAPI spec version: v1
 * <p>
 * <p>
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.automile.model;

import com.automile.model.enums.BatteryStatus;
import com.google.common.collect.Lists;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class VehicleHealth {
    Integer vehicleId;
    Integer periodFrom;
    Integer periodTo;
    BatteryStatus lastBatteryStatus;
    BatteryEvent lastBatteryWarning;
    List<BatteryEvent> batteryEventsForSelectedPeriod = Lists.newArrayList();
    MILEvent lastMILEvent;
    List<MILEvent> mILEventsForSelectedPeriod = Lists.newArrayList();
    DTCEvent lastDTCEvent;
    DTCEvent lastPendingDTCEvent;
    List<DTCEvent> dTCEventsForSelectedPeriod = Lists.newArrayList();
    List<DTCEvent> pendingDTCEventsForSelectedPeriod = Lists.newArrayList();
}