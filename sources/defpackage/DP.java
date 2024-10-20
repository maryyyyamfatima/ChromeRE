package defpackage;

import org.chromium.chrome.browser.crash.ChromePureJavaExceptionReporter;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final /* synthetic */ class DP implements Runnable {
    public final /* synthetic */ Throwable a;

    @Override // java.lang.Runnable
    public final void run() {
        ChromePureJavaExceptionReporter.d(this.a);
    }
}
