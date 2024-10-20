package defpackage;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import org.chromium.base.BundleUtils;
import org.chromium.chrome.browser.customtabs.CustomTabsConnection;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: xh3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractServiceC11514xh3 extends Service {
    public final C1439Lb3 a = new C1439Lb3(0);
    public final BinderC4288cf0 g = new BinderC4288cf0(this);
    public final String h = "Xe0";
    public C3010Xe0 i;

    @Override // android.app.Service, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        Context b = AbstractApplicationC9799sh3.b(context);
        C3010Xe0 c3010Xe0 = (C3010Xe0) BundleUtils.e(b, this.h);
        this.i = c3010Xe0;
        c3010Xe0.getClass();
        super.attachBaseContext(b);
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        this.i.getClass();
        RB2.a().e();
        C8668pO2.b();
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        C3010Xe0 c3010Xe0 = this.i;
        c3010Xe0.b = intent;
        CustomTabsConnection g = CustomTabsConnection.g();
        c3010Xe0.a = g;
        g.l(Boolean.TRUE, "Service#onBind()");
        return a(intent);
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        CustomTabsConnection customTabsConnection = this.i.a;
        if (customTabsConnection == null) {
            return false;
        }
        customTabsConnection.l(Boolean.TRUE, "Service#onUnbind()");
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002b, code lost:            if ((r0.b.a(r10) != null) == false) goto L33;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(final androidx.browser.customtabs.CustomTabsSessionToken r10, android.net.Uri r11) {
        /*
            r9 = this;
            Xe0 r0 = r9.i
            r0.getClass()
            Je2 r11 = defpackage.C1193Je2.a(r11)
            r1 = 0
            if (r11 != 0) goto Le
            goto L9b
        Le:
            org.chromium.chrome.browser.customtabs.CustomTabsConnection r0 = r0.a
            java.util.concurrent.atomic.AtomicBoolean r2 = r0.e
            boolean r2 = r2.get()
            if (r2 != 0) goto L19
            goto L7d
        L19:
            boolean r2 = org.chromium.chrome.browser.customtabs.CustomTabsConnection.j()
            r3 = 1
            if (r2 != 0) goto L2e
            H43 r2 = r0.b
            Zd0 r2 = r2.a(r10)
            if (r2 == 0) goto L2a
            r2 = r3
            goto L2b
        L2a:
            r2 = r1
        L2b:
            if (r2 != 0) goto L2e
            goto L7d
        L2e:
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            EU r4 = r0.c
            monitor-enter(r4)
            java.util.HashMap r5 = r4.c     // Catch: java.lang.Throwable -> La4
            java.lang.Object r5 = r5.get(r10)     // Catch: java.lang.Throwable -> La4
            DU r5 = (defpackage.DU) r5     // Catch: java.lang.Throwable -> La4
            if (r5 != 0) goto L3f
            monitor-exit(r4)
            goto L67
        L3f:
            android.content.Context r2 = defpackage.V60.a     // Catch: java.lang.Throwable -> La4
            Cx2 r5 = r5.e     // Catch: java.lang.Throwable -> La4
            java.lang.String r6 = r5.i     // Catch: java.lang.Throwable -> La4
            if (r6 == 0) goto L9c
            android.content.Intent r7 = new android.content.Intent     // Catch: java.lang.Throwable -> La4
            r7.<init>()     // Catch: java.lang.Throwable -> La4
            java.lang.Class<androidx.browser.customtabs.PostMessageService> r8 = androidx.browser.customtabs.PostMessageService.class
            java.lang.String r8 = r8.getName()     // Catch: java.lang.Throwable -> La4
            r7.setClassName(r6, r8)     // Catch: java.lang.Throwable -> La4
            boolean r2 = r2.bindService(r7, r5, r3)     // Catch: java.lang.Throwable -> La4
            if (r2 != 0) goto L62
            java.lang.String r5 = "PostMessageServConn"
            java.lang.String r6 = "Could not bind to PostMessageService in client."
            android.util.Log.w(r5, r6)     // Catch: java.lang.Throwable -> La4
        L62:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Throwable -> La4
            monitor-exit(r4)
        L67:
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L6e
            goto L7d
        L6e:
            int r1 = android.os.Binder.getCallingUid()
            QF3 r2 = defpackage.AbstractC5103f04.a
            Oe0 r4 = new Oe0
            r4.<init>()
            org.chromium.base.task.PostTask.c(r2, r4)
            r1 = r3
        L7d:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r2 = "requestPostMessageChannel() with origin "
            r10.<init>(r2)
            java.lang.String r11 = r11.toString()
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r1)
            r0.l(r11, r10)
            java.lang.String r10 = "CustomTabs.PostMessage.RequestPostMessageChannel"
            defpackage.EI2.b(r10, r1)
        L9b:
            return r1
        L9c:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> La4
            java.lang.String r11 = "setPackageName must be called before bindSessionToPostMessageService."
            r10.<init>(r11)     // Catch: java.lang.Throwable -> La4
            throw r10     // Catch: java.lang.Throwable -> La4
        La4:
            r10 = move-exception
            monitor-exit(r4)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractServiceC11514xh3.b(androidx.browser.customtabs.CustomTabsSessionToken, android.net.Uri):boolean");
    }

    public final IBinder a(Intent intent) {
        return this.g;
    }
}
