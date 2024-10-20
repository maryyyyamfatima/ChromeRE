package defpackage;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.RemoteViews;
import org.chromium.chrome.browser.document.ChromeLauncherActivity;
import org.chromium.chrome.browser.searchwidget.SearchActivity;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class GG2 extends AppWidgetProvider {
    public static IG2 a;

    public abstract RemoteViews b(Context context, C9751sZ2 c9751sZ2, AppWidgetManager appWidgetManager, int i);

    @Override // android.appwidget.AppWidgetProvider
    public final void onAppWidgetOptionsChanged(Context context, AppWidgetManager appWidgetManager, int i, Bundle bundle) {
        super.onAppWidgetOptionsChanged(context, appWidgetManager, i, bundle);
        onUpdate(context, appWidgetManager, new int[]{i});
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        c(context, appWidgetManager, C10094tZ2.a().g, iArr);
    }

    public final void c(Context context, AppWidgetManager appWidgetManager, C9751sZ2 c9751sZ2, int[] iArr) {
        if (iArr == null) {
            iArr = appWidgetManager.getAppWidgetIds(new ComponentName(context, getClass().getName()));
        }
        for (int i : iArr) {
            appWidgetManager.updateAppWidget(i, b(context, c9751sZ2, appWidgetManager, i));
        }
    }

    public static IG2 a() {
        IG2 ig2 = a;
        if (ig2 != null) {
            return ig2;
        }
        Context context = V60.a;
        ComponentName componentName = new ComponentName(context, (Class<?>) SearchActivity.class);
        Intent b = C1761No1.b(context, true);
        b.putExtra("com.android.chrome.invoked_from_app_widget", true);
        b.addFlags(268959744);
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("chrome://dino/"));
        intent.setComponent(new ComponentName(context, (Class<?>) ChromeLauncherActivity.class));
        intent.putExtra("REUSE_URL_MATCHING_TAB_ELSE_NEW_TAB", true);
        intent.putExtra("com.android.chrome.invoked_from_app_widget", true);
        intent.setFlags(268959744);
        AbstractC2281Ro1.a(intent);
        IG2 ig22 = new IG2(context, componentName, b, intent);
        a = ig22;
        return ig22;
    }
}
