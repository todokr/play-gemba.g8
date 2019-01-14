package controllers

import com.google.inject.Inject
import play.api.mvc.ControllerComponents
import play.api.mvc.Results._

class HomeController @Inject()(
  components: ControllerComponents
){
  def ping = components.actionBuilder { implicit req =>
    Ok("system is ok")
  }
}
