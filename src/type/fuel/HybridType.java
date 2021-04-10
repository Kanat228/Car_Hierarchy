package type.fuel;

import type.VehicleTypeEnum;

public class HybridType extends VehicleTypeByFuelType {

    @Override
    public String getTypeName() {
        return VehicleTypeEnum.HYBRID.name();
    }
}