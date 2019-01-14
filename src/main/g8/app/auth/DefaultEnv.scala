package auth

import com.mohiva.play.silhouette.api.Env
import com.mohiva.play.silhouette.impl.User
import com.mohiva.play.silhouette.impl.authenticators.CookieAuthenticator

trait DefaultEnv extends Env {
  override type I = User
  override type A = CookieAuthenticator
}
