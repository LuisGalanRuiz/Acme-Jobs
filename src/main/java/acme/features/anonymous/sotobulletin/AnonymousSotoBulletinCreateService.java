
package acme.features.anonymous.sotobulletin;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.sotobulletins.SotoBulletin;
import acme.framework.components.Errors;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Anonymous;
import acme.framework.services.AbstractCreateService;

@Service
public class AnonymousSotoBulletinCreateService implements AbstractCreateService<Anonymous, SotoBulletin> {

	@Autowired
	AnonymousSotoBulletinRepository repository;


	@Override
	public boolean authorise(final Request<SotoBulletin> request) {
		assert request != null;

		return true;
	}

	@Override
	public void unbind(final Request<SotoBulletin> request, final SotoBulletin entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;

		request.unbind(entity, model, "author", "location", "text");

	}

	@Override
	public void bind(final Request<SotoBulletin> request, final SotoBulletin entity, final Errors errors) {
		assert request != null;
		assert entity != null;
		assert errors != null;

		request.bind(entity, errors);
	}

	@Override
	public SotoBulletin instantiate(final Request<SotoBulletin> request) {
		assert request != null;

		SotoBulletin result;
		Date moment;

		moment = new Date(System.currentTimeMillis() - 1);
		result = new SotoBulletin();
		result.setAuthor("Galan");
		result.setLocation("Location");
		result.setText("SotoBulletin");
		result.setMoment(moment);

		return result;
	}

	@Override
	public void validate(final Request<SotoBulletin> request, final SotoBulletin entity, final Errors errors) {
		assert request != null;
		assert entity != null;
		assert errors != null;
	}

	@Override
	public void create(final Request<SotoBulletin> request, final SotoBulletin entity) {
		assert request != null;
		assert entity != null;

		Date moment;

		moment = new Date(System.currentTimeMillis() - 1);
		entity.setMoment(moment);

		this.repository.save(entity);
	}

}
