package com.dhht.library;

class DecoratorResult {
  public final DayViewDecorator decorator;
  public final DayViewFacade result;

  DecoratorResult(DayViewDecorator decorator, DayViewFacade result) {
    this.decorator = decorator;
    this.result = result;
  }
}
