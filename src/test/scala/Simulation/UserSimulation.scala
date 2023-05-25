package Simulation

import UserScenario.chainedScenario
import io.gatling.core.Predef._
import scala.concurrent.duration._

class UserSimulation extends Simulation {

  val onceUser : Int = Integer.getInteger("forAtOnceUsers",50)

  val constantUser : Double = System.getProperty("forConstantUsers") match {
    case null => 20
    case str => java.lang.Double.parseDouble(str)
  }

  val constantTime  = java.lang.Long.getLong("sec",15)

  val rampUser : Int = Integer.getInteger("forRampUpUsers", 100)

  val myRamp  = java.lang.Long.getLong("ramp", 30)

    setUp(
      chainedScenario.inject(
        nothingFor(5.seconds),
        atOnceUsers(onceUser),
        constantUsersPerSec(constantUser).during(constantTime),
        rampUsers(rampUser).during(myRamp))
    ).assertions(
      global.responseTime.max.between(500,15000),
      global.successfulRequests.percent.gt(98)
    ).maxDuration(1.minutes)
}
