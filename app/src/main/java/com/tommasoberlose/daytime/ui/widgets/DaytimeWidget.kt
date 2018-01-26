package com.tommasoberlose.daytime.ui.widgets

import android.appwidget.AppWidgetManager
import android.appwidget.AppWidgetProvider
import android.content.Context
import android.content.Intent
import android.widget.RemoteViews

import com.tommasoberlose.daytime.R

/**
 * Implementation of App Widget functionality.
 */
class DaytimeWidget : AppWidgetProvider() {

  override fun onUpdate(context: Context, appWidgetManager: AppWidgetManager, appWidgetIds: IntArray) {
    for (appWidgetId in appWidgetIds) {
      updateAppWidget(context, appWidgetManager, appWidgetId)
    }
  }

  override fun onEnabled(context: Context) {
  }

  override fun onDisabled(context: Context) {
  }

  companion object {
    fun updateAppWidget(context: Context, appWidgetManager: AppWidgetManager,
                                 appWidgetId: Int) {
      val views = RemoteViews(context.packageName, R.layout.daytime_widget)
      appWidgetManager.updateAppWidget(appWidgetId, views)
    }
  }
}

