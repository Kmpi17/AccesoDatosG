import org.postgresql.util.PGobject;

import java.sql.SQLException;

public class PGVehiculos extends PGobject {

    private  Vehiculos vehiculos;

    public PGVehiculos(Vehiculos vehiculos) {
       setType("vehiculo");
    }

    public Vehiculos getVehiculos() {
        return vehiculos;
    }

    public void setValue(String value) throws SQLException {
        super.setValue(value);
        if (value!=null){
            String[] parte=value.replace("|","").replace(")","").split(",");
            this.vehiculos=new Vehiculos(parte[0],parte[1]);

        }

    }
}
