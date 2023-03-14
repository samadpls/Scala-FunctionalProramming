package Assignment2

object Main {
  def main(args: Array[String]): Unit = {
    val fsm = new TableofN(2)
    fsm.start() // start the FSM
    var value = fsm.getNextValue()
    while (value.isDefined) {
      println(value.get)
      value = fsm.getNextValue()
    }
    fsm.stop() // stop the FSM
  }
}

  object TableofN {
    sealed trait State

    case object Initial extends State

    case object Generating extends State

    case object Done extends State

    sealed trait Event

    case object Start extends Event

    case object Next extends Event

    case object Stop extends Event

    val transition: Map[State, Map[Event, State]] = Map(
      Initial -> Map(
        Start -> Generating,
        Stop -> Done
      ),
      Generating -> Map(
        Next -> Generating,
        Stop -> Done
      ),
      Done -> Map.empty
    )

    val initial_state: State = Initial
  }

  class TableofN(x: Int) {

    import TableofN._

    private var currentState: State = initial_state
    private var currentValue = x
    val n = x

    def start(): Unit = {
      transition.get(currentState) match {
        case Some(stateTransitions) =>
          stateTransitions.get(Start) match {
            case Some(newState) =>
              currentState = newState
            case None => // do nothing
          }
        case None => // do nothing
      }
    }

    def stop(): Unit = {
      transition.get(currentState) match {
        case Some(stateTransitions) =>
          stateTransitions.get(Stop) match {
            case Some(newState) =>
              currentState = newState
            case None => // do nothing
          }
        case None => // do nothing
      }
    }

    def getNextValue(): Option[Int] = {
      transition.get(currentState) match {
        case Some(stateTransitions) =>
          stateTransitions.get(Next) match {
            case Some(newState) =>
              currentState = newState
              currentValue += n
              Some(currentValue)
            case None => None
          }
        case None => None
      }
    }

    def reset(): Unit = {
      currentState = initial_state
      currentValue = x
    }

    def isDone(): Boolean = {
      currentState == Done
    }
  }


