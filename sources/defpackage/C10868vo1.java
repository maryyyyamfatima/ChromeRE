package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.StrictMode;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.instantapps.InstantAppIntentData;
import com.google.android.gms.instantapps.internal.RoutingOptions;
import org.chromium.chrome.browser.customtabs.CustomTabsConnection;
import org.chromium.chrome.browser.tab.Tab;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: vo1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10868vo1 extends C9496ro1 {
    public static final /* synthetic */ int d = 0;
    public final C10525uo1 c = new C10525uo1();

    @Override // defpackage.C9496ro1
    public final boolean c(String str, boolean z, boolean z2) {
        C1157Ix1 c1157Ix1 = this.c.a;
        Context context = c1157Ix1.a;
        c1157Ix1.b.getClass();
        InstantAppIntentData b = AbstractC9154qo1.b(context, str, true, new RoutingOptions(), Bundle.EMPTY);
        if (b == null) {
            return false;
        }
        int i = b.g;
        if (z) {
            return i == 2;
        }
        if (i != 0) {
            return i == 3 && z2;
        }
        return true;
    }

    @Override // defpackage.C9496ro1
    public final void f(Context context, String str, Uri uri, Tab tab, boolean z) {
        C8468oo1 c8468oo1 = new C8468oo1(this.c.a.a);
        c8468oo1.k.getClass();
        C6144i21 c6144i21 = c8468oo1.h;
        C7092ko1 c7092ko1 = new C7092ko1(c6144i21, str);
        c6144i21.b.c(0, c7092ko1);
        AF3 a = AbstractC7799mr2.a(c7092ko1, new InterfaceC7455lr2() { // from class: no1
            @Override // defpackage.InterfaceC7455lr2
            public final Object a(QP2 qp2) {
                return ((C7436lo1) qp2).g;
            }
        });
        if (a == null) {
            return;
        }
        a.a(new C9839so1(this, tab, str, z, uri, context));
    }

    @Override // defpackage.C9496ro1
    public final boolean g(Context context, Intent intent, Intent intent2, boolean z) {
        Parcelable[] parcelableArr;
        Intent h = h(C1761No1.n(intent), false);
        if (h == null) {
            FI2.a("Android.InstantApps.InstantAppNotFoundForIntent");
            return false;
        }
        int flags = intent.getFlags();
        boolean z2 = Build.VERSION.SDK_INT >= 26;
        if ((268435456 & flags) == 0 && (flags & 524288) == 0 && !z2) {
            h.setFlags(h.getFlags() & (-268435457));
        }
        if ("android.nfc.action.NDEF_DISCOVERED".equals(intent.getAction())) {
            h.putExtra("android.nfc.extra.ID", AbstractC2281Ro1.l(intent, "android.nfc.extra.ID"));
            h.putExtra("android.nfc.extra.TAG", AbstractC2281Ro1.s(intent, "android.nfc.extra.TAG"));
            try {
                parcelableArr = intent.getParcelableArrayExtra("android.nfc.extra.NDEF_MESSAGES");
            } catch (Throwable unused) {
                AbstractC4851eH1.a("IntentUtils", "getParcelableArrayExtra failed on intent " + intent, new Object[0]);
                parcelableArr = null;
            }
            h.putExtra("android.nfc.extra.NDEF_MESSAGES", parcelableArr);
        }
        if (z) {
            C1186Jd0 c1186Jd0 = new C1186Jd0(1, context, intent);
            String e = CustomTabsConnection.g().e(c1186Jd0.b);
            if (!TextUtils.isEmpty(e)) {
                h.putExtra("com.google.android.gms.instantapps.TRUSTED_REFERRER_PKG", e);
            } else {
                String g = c1186Jd0.g();
                if (!TextUtils.isEmpty(g)) {
                    h.putExtra("android.intent.extra.REFERRER", new Uri.Builder().scheme("android-app").authority(g).build());
                    h.putExtra("com.google.android.gms.instantapps.IS_REFERRER_TRUSTED", false);
                }
            }
        }
        String h2 = C1761No1.h(intent);
        if (!TextUtils.isEmpty(h2)) {
            h.putExtra("android.intent.extra.REFERRER", Uri.parse(h2));
            h.putExtra("com.google.android.gms.instantapps.IS_REFERRER_TRUSTED", false);
        }
        if (intent.hasExtra("com.android.browser.application_id")) {
            h.putExtra("com.android.browser.application_id", AbstractC2281Ro1.w(intent, "com.android.browser.application_id"));
        }
        h.putExtra("key_fallbackIntent", intent2);
        FI2.a("Android.InstantApps.InstantAppLaunchedForIntent");
        context.startActivity(h);
        return true;
    }

    @Override // defpackage.C9496ro1
    public final boolean e(Context context, Uri uri, String str) {
        Intent h = h(str, false);
        if (h == null) {
            return false;
        }
        if (uri != null) {
            h.putExtra("android.intent.extra.REFERRER", uri);
            h.putExtra("com.google.android.gms.instantapps.IS_REFERRER_TRUSTED", true);
        }
        h.putExtra("com.google.android.gms.instantapps.TRUSTED_REFERRER_PKG", context.getPackageName());
        context.startActivity(h);
        FI2.a("Android.InstantApps.LaunchedByDefault");
        return true;
    }

    @Override // defpackage.C9496ro1
    public final Intent b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Context context = V60.a;
        Intent h = h(str, true);
        if (h != null) {
            h.putExtra("com.google.android.gms.instantapps.TRUSTED_REFERRER_PKG", context.getPackageName());
            h.putExtra("com.google.android.gms.instantapps.IS_USER_CONFIRMED_LAUNCH", true);
        }
        return h;
    }

    public final Intent h(String str, boolean z) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                C1157Ix1 c1157Ix1 = this.c.a;
                Context context = c1157Ix1.a;
                c1157Ix1.b.getClass();
                Intent intent = AbstractC9154qo1.b(context, str, true, new RoutingOptions(), Bundle.EMPTY).a;
                if (!z) {
                    if (intent != null) {
                        EI2.n(SystemClock.elapsedRealtime() - elapsedRealtime, "Android.InstantApps.ApiCallDurationWithApp");
                    } else {
                        EI2.n(SystemClock.elapsedRealtime() - elapsedRealtime, "Android.InstantApps.ApiCallDurationWithoutApp");
                    }
                }
                if (intent != null && (intent.getFlags() & 268435456) == 0) {
                    intent.addFlags(268435456);
                }
                return intent;
            } catch (Exception e) {
                Log.getStackTraceString(e);
                C3637al0.b().a(new RunnableC10182to1());
                AbstractC4851eH1.a("InstantAppsHandlerI", "Exception when calling getInstantAppIntent", e);
                StrictMode.setThreadPolicy(allowThreadDiskReads);
                return null;
            }
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }
}
