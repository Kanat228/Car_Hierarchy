package type.fuel;

import type.VehicleType;

public class VehicleTypeByFuelType extends VehicleType {

    public VehicleTypeByFuelType() {
        super("Vehicle type by fuel type");
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VehicleTypeByFuelType that = (VehicleTypeByFuelType) obj;
        return attribute != null && attribute.equals(that.attribute);
    }
}