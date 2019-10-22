
package acme.features.anonymous.sotobulletin;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.sotobulletins.Sotobulletin;
import acme.framework.components.Errors;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Anonymous;
import acme.framework.services.AbstractCreateService;

@Service
public class AnonymousSotoBulletinCreateService implements AbstractCreateService<Anonymous, Sotobulletin> {

	@Autowired
	AnonymousSotoBulletinRepository repository;


	@Override
	public boolean authorise(final Request<Sotobulletin> request) {
		assert request != null;

		return true;
	}

	@Override
	public void unbind(final Request<Sotobulletin> request, final Sotobulletin entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;

		request.unbind(entity, model, "author", "location", "text");

	}

	@Override
	public void bind(final Request<Sotobulletin> request, final Sotobulletin entity, final Errors errors) {
		assert request != null;
		assert entity != null;
		assert errors != null;

		request.bind(entity, errors);
	}

	@Override
	public Sotobulletin instantiate(final Request<Sotobulletin> request) {
		assert request != null;

		Sotobulletin result;
		Date moment;

		moment = new Date(System.currentTimeMillis() - 1);
		result = new Sotobulletin();
		result.setAuthor("Your name");
		result.setLocation("Where are you from?");
		result.setText("Write here your SotoBulletin");
		result.setMoment(moment);

		return result;
	}

	@Override
	public void validate(final Request<Sotobulletin> request, final Sotobulletin entity, final Errors errors) {
		assert request != null;
		assert entity != null;
		assert errors != null;
	}

	@Override
	public void create(final Request<Sotobulletin> request, final Sotobulletin entity) {
		assert request != null;
		assert entity != null;

		Date moment;

		moment = new Date(System.currentTimeMillis() - 1);
		entity.setMoment(moment);

		this.repository.save(entity);
	}

}
