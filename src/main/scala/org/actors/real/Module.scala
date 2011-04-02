package org.actors.real;

import com.google.inject.AbstractModule

class Module extends AbstractModule
{
  def configure() 
  {
    bind(classOf[ILog]) to (classOf[Log])
  }
}