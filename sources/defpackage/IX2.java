package defpackage;

import android.app.Activity;
import android.graphics.Bitmap;
import org.chromium.chrome.browser.feedback.ScreenshotTask;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class IX2 implements Runnable {
    public final /* synthetic */ Activity a;
    public final /* synthetic */ ScreenshotTask g;

    public IX2(ScreenshotTask screenshotTask, Activity activity) {
        this.g = screenshotTask;
        this.a = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.g.d(AbstractC8540p04.b(this.a.getWindow().getDecorView().getRootView(), 600, Bitmap.Config.ARGB_8888));
    }
}
