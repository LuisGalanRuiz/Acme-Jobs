
package acme.features.anonymous.galanbulletin;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.galanbulletins.GalanBulletin;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Anonymous;
import acme.framework.services.AbstractListService;

@Service
public class AnonymousGalanBulletinListService implements AbstractListService<Anonymous, GalanBulletin> {

	@Autowired
	AnonymousGalanBulletinRepository repository;


	@Override
	public boolean authorise(final Request<GalanBulletin> request) {
		assert request != null;
		return true;
	}

	@Override
	public void unbind(final Request<GalanBulletin> request, final GalanBulletin entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;

		request.unbind(entity, model, "author", "text", "moment");
	}

	@Override
	public Collection<GalanBulletin> findMany(final Request<GalanBulletin> request) {
		assert request != null;

		Collection<GalanBulletin> result;
		result = this.repository.findMany();

		return result;
	}

}
