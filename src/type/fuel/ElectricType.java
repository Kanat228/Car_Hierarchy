package type.fuel;

import type.VehicleTypeEnum;

public class ElectricType extends VehicleTypeByFuelType {

    @Override
    public String getTypeName() {
        return VehicleTypeEnum.ELECTRIC.name();
    }
}