package type.body;

import type.VehicleTypeEnum;

public class BusType extends VehicleTypeByBodyType {

    @Override
    public String getTypeName() {
        return VehicleTypeEnum.BUS.name();
    }
}