package defpackage;

import J.N;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import org.chromium.chrome.browser.AppHooks;
import org.chromium.chrome.browser.instantapps.InstantAppsBannerData;
import org.chromium.chrome.browser.tab.Tab;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ro1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C9496ro1 {
    public static final Object a = new Object();
    public static C9496ro1 b;

    public Intent b(String str) {
        return null;
    }

    public boolean c(String str, boolean z, boolean z2) {
        return false;
    }

    public boolean e(Context context, Uri uri, String str) {
        return false;
    }

    public void f(Context context, String str, Uri uri, Tab tab, boolean z) {
    }

    public boolean g(Context context, Intent intent, Intent intent2, boolean z) {
        return false;
    }

    public static void d(InstantAppsBannerData instantAppsBannerData) {
        Intent intent = instantAppsBannerData.d;
        if (intent == null) {
            return;
        }
        Uri uri = instantAppsBannerData.f;
        if (uri != null) {
            intent.putExtra("android.intent.extra.REFERRER", uri);
            intent.putExtra("com.google.android.gms.instantapps.IS_REFERRER_TRUSTED", true);
        }
        Context context = V60.a;
        intent.putExtra("com.google.android.gms.instantapps.TRUSTED_REFERRER_PKG", context.getPackageName());
        intent.putExtra("com.google.android.gms.instantapps.IS_USER_CONFIRMED_LAUNCH", true);
        try {
            context.startActivity(intent);
            N.M7d0mTmG(instantAppsBannerData.e, instantAppsBannerData.c);
        } catch (Exception e) {
            AbstractC4851eH1.a("InstantAppsHandler", "Could not launch instant app intent", e);
        }
    }

    public static C9496ro1 a() {
        synchronized (a) {
            if (b == null) {
                b = AppHooks.get().m();
            }
        }
        return b;
    }
}
