package $package$

import cats.effect.IO
import io.circe.Json
import io.circe.syntax.EncoderOps
import uk.me.tobymiller.serverlesscats.Handler
import uk.me.tobymiller.serverlesscats.ServerlessHost

class MyHandler extends ServerlessHost(new Handler {
  def handle(input: IO[Json]) = for {
    json <- input
    json2 = Map("input" -> json).asJson
  } yield json2
})