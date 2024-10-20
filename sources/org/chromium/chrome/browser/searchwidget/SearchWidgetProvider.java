package org.chromium.chrome.browser.searchwidget;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.widget.RemoteViews;
import com.android.chrome.R;
import defpackage.AbstractC2281Ro1;
import defpackage.AbstractC4851eH1;
import defpackage.AbstractC6952kP0;
import defpackage.C10094tZ2;
import defpackage.C9751sZ2;
import defpackage.O83;
import defpackage.Q83;
import defpackage.W03;
import org.chromium.chrome.browser.locale.LocaleManager;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class SearchWidgetProvider extends AppWidgetProvider {
    public static final Object a = new Object();
    public static W03 b;

    @Override // android.appwidget.AppWidgetProvider
    public final void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        try {
            c(iArr, null);
            b().getClass();
            Q83 q83 = O83.a;
            if (q83.f(0, "org.chromium.chrome.browser.searchwidget.NUM_CONSECUTIVE_CRASHES") == 0) {
                return;
            }
            q83.r(0, "org.chromium.chrome.browser.searchwidget.NUM_CONSECUTIVE_CRASHES");
        } catch (Exception e) {
            b().getClass();
            Q83 q832 = O83.a;
            int f = q832.f(0, "org.chromium.chrome.browser.searchwidget.NUM_CONSECUTIVE_CRASHES") + 1;
            b().getClass();
            if (q832.f(0, "org.chromium.chrome.browser.searchwidget.NUM_CONSECUTIVE_CRASHES") != f) {
                q832.r(f, "org.chromium.chrome.browser.searchwidget.NUM_CONSECUTIVE_CRASHES");
            }
            if (f < 3) {
                AbstractC4851eH1.a("searchwidget", "Absorbing exception caught when attempting to launch widget.", e);
                return;
            }
            throw e;
        }
    }

    public static PendingIntent a(Context context, boolean z) {
        Intent intent = new Intent(z ? "org.chromium.chrome.browser.ui.searchactivityutils.ACTION_START_VOICE_SEARCH" : "org.chromium.chrome.browser.ui.searchactivityutils.ACTION_START_TEXT_SEARCH");
        intent.setClass(context, SearchActivity.class);
        intent.addFlags(268435456);
        intent.addFlags(524288);
        intent.putExtra("org.chromium.chrome.browser.searchwidget.FROM_SEARCH_WIDGET", true);
        return PendingIntent.getActivity(context, 0, intent, 134217728 | AbstractC2281Ro1.d(false), ActivityOptions.makeCustomAnimation(context, R.anim.f110_resource_name_obfuscated_res_0x7f02000e, 0).toBundle());
    }

    public static void c(int[] iArr, C9751sZ2 c9751sZ2) {
        String string;
        W03 b2 = b();
        if (iArr == null) {
            AppWidgetManager appWidgetManager = b2.b;
            iArr = appWidgetManager == null ? new int[0] : appWidgetManager.getAppWidgetIds(new ComponentName(b2.a, SearchWidgetProvider.class.getName()));
        }
        if (c9751sZ2 == null) {
            c9751sZ2 = C10094tZ2.a().g;
        }
        for (int i : iArr) {
            Context context = b2.a;
            String str = c9751sZ2.a;
            RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.f60580_resource_name_obfuscated_res_0x7f0e025c);
            remoteViews.setOnClickPendingIntent(R.id.text_container, a(context, false));
            remoteViews.setOnClickPendingIntent(R.id.microphone_icon, a(context, true));
            remoteViews.setViewVisibility(R.id.microphone_icon, c9751sZ2.c ? 0 : 8);
            if (!TextUtils.isEmpty(str)) {
                if ((AbstractC6952kP0.b(false, false) ^ true) && (LocaleManager.getInstance().a() ^ true)) {
                    string = context.getString(R.string.f85800_resource_name_obfuscated_res_0x7f1409dd, str);
                    remoteViews.setCharSequence(R.id.title, "setHint", string);
                    b2.b.updateAppWidget(i, remoteViews);
                }
            }
            string = context.getString(R.string.f85770_resource_name_obfuscated_res_0x7f1409d7);
            remoteViews.setCharSequence(R.id.title, "setHint", string);
            b2.b.updateAppWidget(i, remoteViews);
        }
    }

    public static W03 b() {
        synchronized (a) {
            if (b == null) {
                b = new W03();
            }
        }
        return b;
    }
}
