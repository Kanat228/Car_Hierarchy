package type.fuel;

import type.VehicleTypeEnum;

public class DieselType extends VehicleTypeByFuelType {

    @Override
    public String getTypeName() {
        return VehicleTypeEnum.DIESEL.name();
    }
}