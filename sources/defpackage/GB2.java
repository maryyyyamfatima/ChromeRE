package defpackage;

import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.SystemClock;
import com.google.android.apps.chrome.appwidget.bookmarks.BookmarkThumbnailWidgetProvider;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.chromium.base.TraceEvent;
import org.chromium.chrome.browser.webapps.WebappRegistry;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class GB2 extends AbstractC0185Bl {
    public long h;
    public final /* synthetic */ RB2 i;

    /* JADX WARN: Removed duplicated region for block: B:50:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v2, types: [xj, vX1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void n() {
        /*
            Method dump skipped, instructions count: 317
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.GB2.n():void");
    }

    public GB2(RB2 rb2) {
        this.i = rb2;
    }

    @Override // defpackage.AbstractC0185Bl
    public final void k(Object obj) {
        WebappRegistry webappRegistry = Wn4.a;
        long currentTimeMillis = System.currentTimeMillis();
        SharedPreferences sharedPreferences = webappRegistry.c;
        if (currentTimeMillis - sharedPreferences.getLong("last_cleanup", 0L) >= 2419200000L) {
            HashMap hashMap = webappRegistry.b;
            Iterator it = hashMap.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                C12237zn4 c12237zn4 = (C12237zn4) entry.getValue();
                String string = c12237zn4.b.getString("webapk_package_name", null);
                SharedPreferences sharedPreferences2 = c12237zn4.b;
                if (string != null) {
                    boolean z = true;
                    if (((String) entry.getKey()).startsWith("webapk-")) {
                        z = O83.a.j("webapk_uninstalled_packages").contains(string) ? false : true ^ AbstractC4983eg2.d(V60.a, string);
                    }
                    if (z) {
                        c12237zn4.a();
                        sharedPreferences2.edit().clear().apply();
                        it.remove();
                    }
                } else if (currentTimeMillis - sharedPreferences2.getLong("last_used", 0L) >= 7862400000L) {
                    c12237zn4.a();
                    sharedPreferences2.edit().clear().apply();
                    it.remove();
                }
            }
            sharedPreferences.edit().putLong("last_cleanup", currentTimeMillis).putStringSet("webapp_set", hashMap.keySet()).apply();
        }
        EI2.j(SystemClock.uptimeMillis() - this.h, "UMA.Debug.EnableCrashUpload.DeferredStartUpAsyncTaskDuration");
    }

    @Override // defpackage.AbstractC0185Bl
    public final Object b() {
        try {
            TraceEvent.b("ChromeBrowserInitializer.onDeferredStartup.doInBackground", null);
            this.h = SystemClock.uptimeMillis();
            n();
            WebappRegistry webappRegistry = Wn4.a;
            int i = BookmarkThumbnailWidgetProvider.a;
            Context context = V60.a;
            if (AppWidgetManager.getInstance(context) != null) {
                context.sendBroadcast(new Intent(BookmarkThumbnailWidgetProvider.a(context), null, context, BookmarkThumbnailWidgetProvider.class));
            }
            this.i.getClass();
            synchronized (RB2.d) {
                Q83 q83 = O83.a;
                if (!q83.e("snapshot_database_removed", false)) {
                    V60.a.deleteDatabase("snapshots.db");
                    q83.p("snapshot_database_removed", true);
                }
            }
            Wn4.a.d(null);
            AbstractC3953bg2.a();
            return null;
        } finally {
            TraceEvent.c("ChromeBrowserInitializer.onDeferredStartup.doInBackground");
        }
    }
}
