import org.bamba.project.Person

class BootStrap {

    def init = { servletContext ->
		environments {
			development {
				if (Person.count() == 0) {
					loadPersonData()
				}
			}
		}
		}
    
	
	def loadPersonData() {
		new Person(firstName: 'Albert', lastName: 'Willis', age: 35).save(flush: true)
		new Person(firstName: 'Stephen', lastName: 'West', age: 38).save(flush: true)
		new Person(firstName: 'Raymond', lastName: 'Chavez', age: 32).save(flush: true)
		new Person(firstName: 'Melissa', lastName: 'Rose', age: 25).save(flush: true)
		new Person(firstName: 'Jane', lastName: 'Woods', age: 36).save(flush: true)
		new Person(firstName: 'Michelle', lastName: 'Hansen', age: 33).save(flush: true)
		new Person(firstName: 'Judith', lastName: 'Stewart', age: 28).save(flush: true)
		new Person(firstName: 'Jerry', lastName: 'Carpenter', age: 36).save(flush: true)
		new Person(firstName: 'Debra', lastName: 'Hanson', age: 34).save(flush: true)
		new Person(firstName: 'Larry', lastName: 'Foster', age: 36).save(flush: true)
	}

}
