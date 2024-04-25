package brokenBinding

import grails.artefact.Controller
import grails.validation.Validateable

class ExampleController implements Controller {
    def index() {
        redirect(action: 'list')
    }

    def list(ExampleSearchCommand cmd) {
        [cmd: cmd]
    }

    def edit() {
        ExampleCommand cmd = new ExampleCommand() // TODO: Renaming this command will allow the list command to work
        [instance: cmd]
    }
}

class ExampleSearchCommand implements Validateable {
    String name

    static boolean defaultNullable() {
        true
    }
}

class ExampleCommand implements Validateable {
    String name
}