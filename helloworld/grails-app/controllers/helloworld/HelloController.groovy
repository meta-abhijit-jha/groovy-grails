package helloworld

class HelloController {

	def index() {
		//To get runtime configuration from yml file
		def recipient = grailsApplication.config.getProperty('grails.profile')
		
		render """
			<h1>Hello Page</h1>
			<a href="http://localhost:8080">Click Me</a>
			<p>Rendered from yml config file: ${recipient}</p>
			"""
	}
}
