
package acme.features.anonymous.sotobulletin;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import acme.entities.sotobulletins.Sotobulletin;
import acme.framework.repositories.AbstractRepository;

@Repository
public interface AnonymousSotoBulletinRepository extends AbstractRepository {

	@Query("select g from Sotobulletin g")
	Collection<Sotobulletin> findMany();
}
