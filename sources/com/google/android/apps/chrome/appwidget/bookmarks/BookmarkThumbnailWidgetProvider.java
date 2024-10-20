package com.google.android.apps.chrome.appwidget.bookmarks;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.RemoteViews;
import com.android.chrome.R;
import defpackage.AbstractC2281Ro1;
import defpackage.C6537jB;
import org.chromium.chrome.browser.bookmarkswidget.BookmarkWidgetProxy;
import org.chromium.chrome.browser.bookmarkswidget.BookmarkWidgetService;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class BookmarkThumbnailWidgetProvider extends AppWidgetProvider {
    public static final /* synthetic */ int a = 0;

    @Override // android.appwidget.AppWidgetProvider, android.content.BroadcastReceiver
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final void onReceive(Context context, Intent intent) {
        if (a(context).equals(intent.getAction())) {
            AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context);
            if (intent.hasExtra("appWidgetId")) {
                g(context, appWidgetManager, new int[]{AbstractC2281Ro1.p(-1, intent, "appWidgetId")});
                return;
            } else {
                g(context, appWidgetManager, appWidgetManager.getAppWidgetIds(new ComponentName(context, (Class<?>) BookmarkThumbnailWidgetProvider.class)));
                return;
            }
        }
        super.onReceive(context, intent);
    }

    @Override // android.appwidget.AppWidgetProvider
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        super.onUpdate(context, appWidgetManager, iArr);
        g(context, appWidgetManager, iArr);
    }

    @Override // android.appwidget.AppWidgetProvider
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void onAppWidgetOptionsChanged(Context context, AppWidgetManager appWidgetManager, int i, Bundle bundle) {
        g(context, appWidgetManager, new int[]{i});
    }

    @Override // android.appwidget.AppWidgetProvider
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void onDeleted(Context context, int[] iArr) {
        super.onDeleted(context, iArr);
        for (int i : iArr) {
            C6537jB.a(i);
        }
        for (int i2 : AppWidgetManager.getInstance(context).getAppWidgetIds(new ComponentName(context, (Class<?>) BookmarkThumbnailWidgetProvider.class))) {
            C6537jB.a(i2);
        }
    }

    @Override // android.appwidget.AppWidgetProvider
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final void onDisabled(Context context) {
        super.onDisabled(context);
        for (int i : AppWidgetManager.getInstance(context).getAppWidgetIds(new ComponentName(context, (Class<?>) BookmarkThumbnailWidgetProvider.class))) {
            C6537jB.a(i);
        }
    }

    public static String a(Context context) {
        return context.getPackageName() + ".BOOKMARK_APPWIDGET_UPDATE";
    }

    public static void g(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        for (int i : iArr) {
            Intent intent = new Intent(context, (Class<?>) BookmarkWidgetService.class);
            intent.putExtra("appWidgetId", i);
            intent.setData(Uri.parse(intent.toUri(1)));
            RemoteViews remoteViews = new RemoteViews(context.getPackageName(), appWidgetManager.getAppWidgetOptions(i).getInt("appWidgetMinWidth") < 110 ? R.layout.f56190_resource_name_obfuscated_res_0x7f0e006b : R.layout.f56180_resource_name_obfuscated_res_0x7f0e006a);
            remoteViews.setRemoteAdapter(R.id.bookmarks_list, intent);
            appWidgetManager.notifyAppWidgetViewDataChanged(i, R.id.bookmarks_list);
            Intent intent2 = new Intent(context, (Class<?>) BookmarkWidgetProxy.class);
            intent2.setFlags(268435456);
            remoteViews.setPendingIntentTemplate(R.id.bookmarks_list, PendingIntent.getActivity(context, 0, intent2, AbstractC2281Ro1.d(true) | 134217728));
            appWidgetManager.updateAppWidget(i, remoteViews);
        }
    }
}
