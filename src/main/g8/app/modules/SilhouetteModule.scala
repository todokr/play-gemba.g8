package modules

import auth.DefaultEnv
import com.google.inject.AbstractModule
import com.mohiva.play.silhouette.api.{Silhouette, SilhouetteProvider}

class SilhouetteModule extends AbstractModule {

  override def configure(): Unit = {
    bind(classOf[Silhouette[DefaultEnv]]).to(classOf[SilhouetteProvider[DefaultEnv]])
  }
}
