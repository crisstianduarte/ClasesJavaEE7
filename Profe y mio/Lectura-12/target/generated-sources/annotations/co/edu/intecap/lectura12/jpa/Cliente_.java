package co.edu.intecap.lectura12.jpa;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Cliente.class)
public abstract class Cliente_ {

	public static volatile SingularAttribute<Cliente, String> correoElectronio;
	public static volatile SingularAttribute<Cliente, String> direccion;
	public static volatile ListAttribute<Cliente, Cuenta> cuentaList;
	public static volatile SingularAttribute<Cliente, String> celular;
	public static volatile SingularAttribute<Cliente, Integer> id;
	public static volatile SingularAttribute<Cliente, String> nombres;

}

