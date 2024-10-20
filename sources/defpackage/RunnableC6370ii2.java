package defpackage;

import J.N;
import org.chromium.chrome.browser.paint_preview.services.PaintPreviewTabService;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ii2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC6370ii2 implements Runnable {
    public final /* synthetic */ PaintPreviewTabService a;
    public final /* synthetic */ int[] g;

    public /* synthetic */ RunnableC6370ii2(PaintPreviewTabService paintPreviewTabService, int[] iArr) {
        this.a = paintPreviewTabService;
        this.g = iArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j = this.a.c;
        if (j == 0) {
            return;
        }
        N.MTE3rHmH(j, this.g);
    }
}
