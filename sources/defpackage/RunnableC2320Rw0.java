package defpackage;

import android.app.Activity;
import android.graphics.Bitmap;
import org.chromium.chrome.browser.share.screenshot.EditorScreenshotTask;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Rw0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC2320Rw0 implements Runnable {
    public final /* synthetic */ Activity a;
    public final /* synthetic */ EditorScreenshotTask g;

    public RunnableC2320Rw0(EditorScreenshotTask editorScreenshotTask, Activity activity) {
        this.g = editorScreenshotTask;
        this.a = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.g.a(AbstractC8540p04.b(this.a.getWindow().getDecorView().getRootView(), 0, Bitmap.Config.ARGB_8888));
    }
}
