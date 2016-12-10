package co.edu.intecap.lectura12.jpa;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Cuenta.class)
public abstract class Cuenta_ {

	public static volatile SingularAttribute<Cuenta, Cliente> clienteId;
	public static volatile SingularAttribute<Cuenta, Date> fechaApertura;
	public static volatile ListAttribute<Cuenta, Movimiento> movimientoList;
	public static volatile SingularAttribute<Cuenta, Integer> id;
	public static volatile SingularAttribute<Cuenta, Double> saldo;

}

