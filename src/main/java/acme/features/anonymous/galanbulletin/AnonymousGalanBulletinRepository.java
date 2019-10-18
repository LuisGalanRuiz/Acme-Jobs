
package acme.features.anonymous.galanbulletin;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import acme.entities.galanbulletins.GalanBulletin;
import acme.framework.repositories.AbstractRepository;

@Repository
public interface AnonymousGalanBulletinRepository extends AbstractRepository {

	@Query("select s from GalanBulletin s")
	Collection<GalanBulletin> findMany();
}
