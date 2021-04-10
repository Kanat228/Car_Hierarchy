package type.fuel;

import type.VehicleTypeEnum;

public class PetrolType extends VehicleTypeByFuelType {

    @Override
    public String getTypeName() {
        return VehicleTypeEnum.PETROL.name();
    }
}