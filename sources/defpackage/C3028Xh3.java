package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import org.chromium.base.BundleUtils;
import org.chromium.base.JNIUtils;
import org.chromium.chrome.browser.base.SplitChromeApplication;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Xh3 */
/* loaded from: classes.dex */
public final class C3028Xh3 extends AbstractC0185Bl {
    public final String h = "chrome";
    public C8428oh3 i;
    public final /* synthetic */ C3158Yh3 j;

    public final Context n() {
        C3158Yh3 c3158Yh3 = this.j;
        Context context = c3158Yh3.b;
        String str = this.h;
        if (!BundleUtils.d(context, str)) {
            return c3158Yh3.b;
        }
        Context a = BundleUtils.a(c3158Yh3.b, str);
        C6132i01 c6132i01 = C6132i01.d;
        return c6132i01.c ? a.createConfigurationContext(c6132i01.a(a)) : a;
    }

    @Override // defpackage.AbstractC0185Bl
    public final void k(Object obj) {
        o();
    }

    public C3028Xh3(C3158Yh3 c3158Yh3, C8428oh3 c8428oh3) {
        this.j = c3158Yh3;
        this.i = c8428oh3;
    }

    @Override // defpackage.AbstractC0185Bl
    public final Object b() {
        final Context n = n();
        if (this.i == null) {
            return null;
        }
        final HandlerThread handlerThread = new HandlerThread("ActivityPreload");
        handlerThread.start();
        new Handler(handlerThread.getLooper()).post(new Runnable() { // from class: nh3
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    n.getClassLoader().loadClass("org.chromium.chrome.browser.ChromeTabbedActivity$Preload").newInstance();
                    handlerThread.quit();
                } catch (ReflectiveOperationException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        return null;
    }

    public final void o() {
        try {
            f();
        } catch (Exception unused) {
        }
        C8428oh3 c8428oh3 = this.i;
        if (c8428oh3 != null) {
            Context n = n();
            if (!c8428oh3.a.getClassLoader().equals(n.getClassLoader())) {
                ClassLoader classLoader = n.getClassLoader();
                SplitChromeApplication splitChromeApplication = c8428oh3.b;
                BundleUtils.g(classLoader, splitChromeApplication);
                JNIUtils.b = n.getClassLoader();
                splitChromeApplication.i = n.getResources();
            }
            this.i = null;
        }
    }
}
