package defpackage;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import java.util.List;
import org.chromium.base.Callback;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: kP0 */
/* loaded from: classes.dex */
public abstract class AbstractC6952kP0 {
    public final Activity a;
    public final C6608jP0 b = new C6608jP0();
    public boolean c;
    public Boolean d;
    public List e;

    public abstract void e(Bundle bundle);

    public AbstractC6952kP0(Activity activity, C8297oJ c8297oJ) {
        this.a = activity;
        c8297oJ.j(new Callback() { // from class: iP0
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                Boolean valueOf = Boolean.valueOf(((Boolean) obj).booleanValue());
                AbstractC6952kP0 abstractC6952kP0 = AbstractC6952kP0.this;
                abstractC6952kP0.d = valueOf;
                abstractC6952kP0.d();
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0069, code lost:            if (r0.isEmpty() != false) goto L168;     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0080 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(android.os.Bundle r7) {
        /*
            r6 = this;
            java.util.List r0 = r6.e
            java.lang.Boolean r1 = r6.d
            boolean r1 = r1.booleanValue()
            jP0 r2 = r6.b
            r2.getClass()
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L12
            goto L6b
        L12:
            Jg1 r1 = defpackage.C1202Jg1.a()
            org.chromium.chrome.browser.profiles.Profile r4 = org.chromium.chrome.browser.profiles.Profile.d()
            r1.getClass()
            org.chromium.components.signin.identitymanager.IdentityManager r1 = defpackage.C1202Jg1.b(r4)
            boolean r4 = r1.c(r3)
            if (r4 != 0) goto L6d
            Jg1 r4 = defpackage.C1202Jg1.a()
            org.chromium.chrome.browser.signin.services.SigninManager r4 = defpackage.AbstractC9966tA.a(r4)
            boolean r5 = defpackage.AbstractC10728vP0.a()
            if (r5 == 0) goto L43
            boolean r5 = r4.g()
            if (r5 != 0) goto L43
            boolean r4 = r4.r()
            if (r4 == 0) goto L43
            r4 = r3
            goto L44
        L43:
            r4 = r2
        L44:
            if (r4 != 0) goto L47
            goto L6d
        L47:
            boolean r4 = org.chromium.chrome.browser.signin.services.FREMobileIdentityConsistencyFieldTrial.isEnabled()
            if (r4 == 0) goto L52
            boolean r0 = r1.c(r2)
            goto L6e
        L52:
            android.app.Activity r1 = r6.a
            android.content.ContentResolver r1 = r1.getContentResolver()
            java.lang.String r4 = "skip_first_use_hints"
            int r1 = android.provider.Settings.Secure.getInt(r1, r4, r2)
            if (r1 == 0) goto L62
            r1 = r3
            goto L63
        L62:
            r1 = r2
        L63:
            if (r1 == 0) goto L6b
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L6d
        L6b:
            r0 = r3
            goto L6e
        L6d:
            r0 = r2
        L6e:
            java.lang.String r1 = "ShowSyncConsent"
            r7.putBoolean(r1, r0)
            org.chromium.chrome.browser.locale.LocaleManager r0 = org.chromium.chrome.browser.locale.LocaleManager.getInstance()
            IF1 r0 = r0.a
            int r0 = r0.b()
            r1 = 2
            if (r0 == r1) goto L82
            if (r0 != r3) goto L83
        L82:
            r2 = r3
        L83:
            java.lang.String r0 = "ShowSearchEnginePage"
            r7.putBoolean(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC6952kP0.f(android.os.Bundle):void");
    }

    public final void d() {
        if (this.d == null || this.e == null || this.c) {
            return;
        }
        this.c = true;
        Bundle bundle = new Bundle();
        bundle.putBoolean("IsChildAccount", this.d.booleanValue());
        e(bundle);
    }

    public static boolean a(Intent intent, boolean z) {
        return b(z, intent.getBooleanExtra("Extra.FreChromeLaunchIntentIsCct", false) || C0507Dx1.g(intent));
    }

    public static boolean b(boolean z, boolean z2) {
        if (!AX.e().g("disable-fre") && !AbstractC9771sd.e()) {
            if ((Build.VERSION.SDK_INT >= 29 ? ActivityManager.isRunningInUserTestHarness() : false) || AbstractC10385uP0.a()) {
                return false;
            }
            Q83 q83 = O83.a;
            if (q83.e("Chrome.FirstRun.SkippedByPolicy", false) && (z2 || z)) {
                return false;
            }
            if (z) {
                return (q83.e("skip_welcome_page", false) || q83.e("lightweight_first_run_flow", false)) ? false : true;
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean c(android.content.Context r8, android.content.Intent r9, boolean r10) {
        /*
            Method dump skipped, instructions count: 347
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC6952kP0.c(android.content.Context, android.content.Intent, boolean):boolean");
    }
}
