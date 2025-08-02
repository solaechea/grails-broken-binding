package brokenBinding

import grails.artefact.Controller
import grails.validation.Validateable

class ExampleController implements Controller {
    def index() {
        redirect(action: 'echo', params: [person: 'George Doe'])
    }

    def echo(String person) {
        render(text: person)
    }

    def echoPerson(String name) {
        Person person = Person.findByName(name) // TODO: Renaming this variable will allow the echo action to work
        render(text: person?.name ?: "No Person found with name: $name")
    }

}
