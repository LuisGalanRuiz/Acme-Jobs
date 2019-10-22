
package acme.features.anonymous.galanbulletin;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import acme.entities.galanbulletins.Galanbulletin;
import acme.framework.repositories.AbstractRepository;

@Repository
public interface AnonymousGalanbulletinRepository extends AbstractRepository {

	@Query("select g from Galanbulletin g")
	Collection<Galanbulletin> findMany();
}
