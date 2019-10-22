
package acme.features.anonymous.sotobulletin;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import acme.entities.sotobulletins.Sotobulletin;
import acme.framework.components.BasicCommand;
import acme.framework.controllers.AbstractController;
import acme.framework.entities.Anonymous;

@Controller
@RequestMapping("/anonymous/sotobulletin/")
public class AnonymousSotoBulletinController extends AbstractController<Anonymous, Sotobulletin> {

	@Autowired
	private AnonymousSotoBulletinListService	listService;

	@Autowired
	private AnonymousSotoBulletinCreateService	createService;


	@PostConstruct
	private void initialize() {
		super.addBasicCommand(BasicCommand.LIST, this.listService);
		super.addBasicCommand(BasicCommand.CREATE, this.createService);
	}

}
