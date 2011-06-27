package bowlerquickstart

import org.bowlerframework.view.scalate._
import org.bowlerframework.Request

/**
 * This class acts as the starting point and bootstrap point for our application
 */
class Bootstrap{
  // parent layout
  val parentLayout = DefaultLayout("default", "doLayout", None, None)

  def resolver(request: Request): Option[DefaultLayout] = Option(parentLayout)
  TemplateRegistry.defaultLayout = resolver(_)


  // I think we're ready to start and instantiate our Controller.
  val controller = new MyController
	
	
  // allow template reload during development - remove these lines in production for better performance
  org.bowlerframework.view.scalate.RenderEngine.getEngine.allowCaching = false
  org.bowlerframework.view.scalate.RenderEngine.getEngine.allowReload = true
}