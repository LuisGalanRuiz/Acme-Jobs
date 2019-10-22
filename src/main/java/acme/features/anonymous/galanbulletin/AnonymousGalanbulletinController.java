
package acme.features.anonymous.galanbulletin;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import acme.entities.galanbulletins.Galanbulletin;
import acme.framework.components.BasicCommand;
import acme.framework.controllers.AbstractController;
import acme.framework.entities.Anonymous;

@Controller
@RequestMapping("/anonymous/galanbulletin/")
public class AnonymousGalanbulletinController extends AbstractController<Anonymous, Galanbulletin> {

	@Autowired
	private AnonymousGalanbulletinListService	listService;

	@Autowired
	private AnonymousGalanbulletinCreateService	createService;


	@PostConstruct
	private void initialize() {
		super.addBasicCommand(BasicCommand.LIST, this.listService);
		super.addBasicCommand(BasicCommand.CREATE, this.createService);
	}

}
