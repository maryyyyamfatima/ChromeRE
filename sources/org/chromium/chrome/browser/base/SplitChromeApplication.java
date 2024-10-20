package org.chromium.chrome.browser.base;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.SystemClock;
import defpackage.AbstractApplicationC9799sh3;
import defpackage.AbstractC4674dm0;
import defpackage.C3028Xh3;
import defpackage.C3158Yh3;
import defpackage.EI2;
import defpackage.InterfaceC0079Ap3;
import org.chromium.base.BundleUtils;
import org.chromium.base.TraceEvent;
import org.chromium.chrome.browser.base.SplitChromeApplication;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class SplitChromeApplication extends AbstractApplicationC9799sh3 {
    public static C3158Yh3 j;
    public final String h = "vM";
    public Resources i;

    @Override // defpackage.AbstractApplicationC9799sh3, android.app.Application
    public final void onCreate() {
        e("chrome");
        super.onCreate();
    }

    @Override // defpackage.AbstractApplicationC9799sh3, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        if (AbstractApplicationC9799sh3.d()) {
            if (Build.VERSION.SDK_INT >= 26) {
                AbstractC4674dm0.a = true;
            }
            this.a = new InterfaceC0079Ap3() { // from class: lh3
                @Override // defpackage.InterfaceC0079Ap3
                public final /* synthetic */ boolean i() {
                    return AbstractC12248zp3.a(this);
                }

                @Override // defpackage.InterfaceC0079Ap3
                public final Object get() {
                    C3158Yh3 c3158Yh3 = SplitChromeApplication.j;
                    SplitChromeApplication splitChromeApplication = SplitChromeApplication.this;
                    splitChromeApplication.getClass();
                    return (C9456rh3) BundleUtils.e(AbstractApplicationC9799sh3.b(splitChromeApplication), splitChromeApplication.h);
                }
            };
            return;
        }
        this.a = new InterfaceC0079Ap3() { // from class: mh3
            @Override // defpackage.InterfaceC0079Ap3
            public final /* synthetic */ boolean i() {
                return AbstractC12248zp3.a(this);
            }

            @Override // defpackage.InterfaceC0079Ap3
            public final Object get() {
                C3158Yh3 c3158Yh3 = SplitChromeApplication.j;
                SplitChromeApplication.this.getClass();
                return new C9456rh3();
            }
        };
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        Resources resources = this.i;
        return resources != null ? resources : getBaseContext().getResources();
    }

    public static void e(String str) {
        C3028Xh3 c3028Xh3;
        C3158Yh3 c3158Yh3 = j;
        if (c3158Yh3 != null) {
            TraceEvent i = TraceEvent.i("SplitPreloader.wait", null);
            try {
                synchronized (c3158Yh3.a) {
                    c3028Xh3 = (C3028Xh3) c3158Yh3.a.remove(str);
                }
                if (c3028Xh3 != null) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    c3028Xh3.o();
                    EI2.n(SystemClock.uptimeMillis() - uptimeMillis, "Android.IsolatedSplits.PreloadWaitTime." + str);
                }
                if (i != null) {
                    i.close();
                }
            } catch (Throwable th) {
                if (i != null) {
                    try {
                        i.close();
                    } catch (Throwable unused) {
                    }
                }
                throw th;
            }
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Context createContextForSplit(String str) {
        Context createContextForSplit;
        TraceEvent i = TraceEvent.i("SplitChromeApplication.createContextForSplit", null);
        try {
            e(str);
            long uptimeMillis = SystemClock.uptimeMillis();
            synchronized (BundleUtils.b) {
                createContextForSplit = super.createContextForSplit(str);
            }
            EI2.n(SystemClock.uptimeMillis() - uptimeMillis, "Android.IsolatedSplits.ContextCreateTime." + str);
            if (i != null) {
                i.close();
            }
            return createContextForSplit;
        } catch (Throwable th) {
            if (i != null) {
                try {
                    i.close();
                } catch (Throwable unused) {
                }
            }
            throw th;
        }
    }
}
