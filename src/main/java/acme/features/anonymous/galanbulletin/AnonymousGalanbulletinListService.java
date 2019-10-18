
package acme.features.anonymous.galanbulletin;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.galanbulletins.Galanbulletin;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Anonymous;
import acme.framework.services.AbstractListService;

@Service
public class AnonymousGalanbulletinListService implements AbstractListService<Anonymous, Galanbulletin> {

	@Autowired
	AnonymousGalanbulletinRepository repository;


	@Override
	public boolean authorise(final Request<Galanbulletin> request) {
		assert request != null;
		return true;
	}

	@Override
	public void unbind(final Request<Galanbulletin> request, final Galanbulletin entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;

		request.unbind(entity, model, "author", "description", "text", "moment");
	}

	@Override
	public Collection<Galanbulletin> findMany(final Request<Galanbulletin> request) {
		assert request != null;

		Collection<Galanbulletin> result;
		result = this.repository.findMany();

		return result;
	}

}
