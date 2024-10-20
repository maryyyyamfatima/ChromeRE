package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.StrictMode;
import android.os.SystemClock;
import android.os.UserManager;
import org.chromium.base.ThreadUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: gj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5686gj extends AbstractC6117hx2 {
    public final Context c;
    public final C6815k d = new C6815k(this);
    public final UserManager e;

    public C5686gj(Context context) {
        this.c = context;
        this.e = (UserManager) context.getSystemService("user");
    }

    @Override // defpackage.AbstractC6117hx2
    public final void d() {
        Context context = this.c;
        C6815k c6815k = this.d;
        IntentFilter intentFilter = new IntentFilter("android.intent.action.APPLICATION_RESTRICTIONS_CHANGED");
        Handler handler = new Handler(ThreadUtils.c());
        if (Build.VERSION.SDK_INT >= 26) {
            context.registerReceiver(c6815k, intentFilter, null, handler, 4);
        } else {
            context.registerReceiver(c6815k, intentFilter, null, handler);
        }
    }

    @Override // defpackage.AbstractC6117hx2
    public final void c() {
        Bundle bundle;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        System.currentTimeMillis();
        String packageName = this.c.getPackageName();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            bundle = this.e.getApplicationRestrictions(packageName);
        } catch (SecurityException unused) {
            bundle = new Bundle();
        }
        long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
        EI2.n(elapsedRealtime2, "Enterprise.AppRestrictionLoadTime2");
        if (bundle.isEmpty()) {
            EI2.n(elapsedRealtime2, "Enterprise.AppRestrictionLoadTime2.EmptyBundle");
        } else {
            EI2.n(elapsedRealtime2, "Enterprise.AppRestrictionLoadTime2.NonEmptyBundle");
        }
        StrictMode.setThreadPolicy(allowThreadDiskReads);
        b(bundle);
    }
}
