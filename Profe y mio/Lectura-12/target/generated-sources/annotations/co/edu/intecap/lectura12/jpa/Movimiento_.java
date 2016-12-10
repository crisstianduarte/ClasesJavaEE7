package co.edu.intecap.lectura12.jpa;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Movimiento.class)
public abstract class Movimiento_ {

	public static volatile SingularAttribute<Movimiento, Double> valor;
	public static volatile SingularAttribute<Movimiento, Cuenta> cuentaId;
	public static volatile SingularAttribute<Movimiento, Integer> id;
	public static volatile SingularAttribute<Movimiento, String> tipoMovimiento;
	public static volatile SingularAttribute<Movimiento, Date> fechaMovimiento;

}

