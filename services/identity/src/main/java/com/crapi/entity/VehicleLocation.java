/*
 * Licensed under the Apache License, Version 2.0 (the “License”);
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an “AS IS” BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.crapi.entity;

import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "vehicle_location")
@Data
public class VehicleLocation {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  private String latitude;
  private String longitude;

  private String status;

  public VehicleLocation(String latitude, String longitude) {
    this.latitude = latitude;
    this.longitude = longitude;
  }

  public VehicleLocation() {}
}
