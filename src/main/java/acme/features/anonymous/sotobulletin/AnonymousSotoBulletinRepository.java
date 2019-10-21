
package acme.features.anonymous.sotobulletin;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import acme.entities.sotobulletins.SotoBulletin;
import acme.framework.repositories.AbstractRepository;

@Repository
public interface AnonymousSotoBulletinRepository extends AbstractRepository {

	@Query("select g from SotoBulletin g")
	Collection<SotoBulletin> findMany();
}
