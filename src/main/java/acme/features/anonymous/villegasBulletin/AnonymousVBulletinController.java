
package acme.features.anonymous.villegasBulletin;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import acme.entities.villegasBulletin.Villegasbulletin;
import acme.framework.components.BasicCommand;
import acme.framework.controllers.AbstractController;
import acme.framework.entities.Anonymous;

@Controller
@RequestMapping("/anonymous/villegasbulletin/")
public class AnonymousVBulletinController extends AbstractController<Anonymous, Villegasbulletin> {

	@Autowired
	private AnonymousVBulletinListService	listService;

	@Autowired
	private AnonymousVBulletinCreateService	createService;


	@PostConstruct
	private void initialize() {
		super.addBasicCommand(BasicCommand.LIST, this.listService);
		super.addBasicCommand(BasicCommand.CREATE, this.createService);
	}
}
