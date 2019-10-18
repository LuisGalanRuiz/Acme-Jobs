
package acme.features.anonymous.galanbulletin;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import acme.entities.galanbulletins.GalanBulletin;
import acme.framework.components.BasicCommand;
import acme.framework.controllers.AbstractController;
import acme.framework.entities.Anonymous;

@Controller
@RequestMapping("/anonymous/galanbulletin/")
public class AnonymousGalanBulletinController extends AbstractController<Anonymous, GalanBulletin> {

	@Autowired
	private AnonymousGalanBulletinListService listService;


	@PostConstruct
	private void initialize() {
		super.addBasicCommand(BasicCommand.LIST, this.listService);
	}

}
