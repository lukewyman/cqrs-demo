package com.mtomanski.timer.infrastructure.projection.builder

import com.mtomanski.timer.domain.model.BestAvg
import org.slf4j.LoggerFactory

import scala.concurrent.Future

/**
  * Created by lukewyman on 12/16/17.
  */
class LoggerBestAvgViewBuilder extends BestAvgViewBuilder {
  private val logger = LoggerFactory.getLogger(getClass)

  def upsertBestAvgView(bestAvg: BestAvg): Future[Int] = {

    logger.info(s"Inside the BestAvgViewBuilder: writing bestAvg $bestAvg to the read side.")
    Future.successful(1)
  }
}
