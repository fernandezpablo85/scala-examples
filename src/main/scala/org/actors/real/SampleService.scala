package org.actors.real

import com.google.inject.Inject

class SampleService @Inject() (val log : ILog)
{
  def print()
  {
    log.info("printing some info on the injected logger")
  }
}