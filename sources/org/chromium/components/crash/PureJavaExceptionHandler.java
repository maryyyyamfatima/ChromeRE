package org.chromium.components.crash;

import defpackage.AbstractApplicationC9799sh3;
import defpackage.AbstractC6218iF2;
import defpackage.KH;
import defpackage.V60;
import java.lang.Thread;
import org.chromium.base.BundleUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class PureJavaExceptionHandler implements Thread.UncaughtExceptionHandler {
    public static boolean d;
    public final Thread.UncaughtExceptionHandler a;
    public boolean b;
    public final KH c;

    public PureJavaExceptionHandler(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, KH kh) {
        this.a = uncaughtExceptionHandler;
        this.c = kh;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        if (!this.b && !d) {
            this.b = true;
            this.c.getClass();
            ((AbstractC6218iF2) BundleUtils.e(AbstractApplicationC9799sh3.b(V60.a), "org.chromium.chrome.browser.crash.ChromePureJavaExceptionReporter")).b(th);
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.a;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }

    public static void uninstallHandler() {
        d = true;
        CrashKeys.getInstance().flushToNative();
    }
}
