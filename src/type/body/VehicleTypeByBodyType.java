package type.body;

import type.VehicleType;

public abstract class VehicleTypeByBodyType extends VehicleType {
    public VehicleTypeByBodyType() {
        super("Vehicle type by body type");
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VehicleTypeByBodyType that = (VehicleTypeByBodyType) obj;
        return attribute != null && attribute.equals(that.attribute);
    }
}