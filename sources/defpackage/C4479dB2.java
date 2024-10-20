package defpackage;

import android.graphics.Bitmap;
import org.chromium.base.Callback;
import org.chromium.components.image_fetcher.ImageFetcher;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: dB2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4479dB2 implements Callback {
    public final /* synthetic */ ImageFetcher a;
    public final /* synthetic */ Callback g;

    @Override // org.chromium.base.Callback
    public final ZE e0(Object obj) {
        return new ZE(this, obj);
    }

    public C4479dB2(ImageFetcher imageFetcher, C3809bF c3809bF) {
        this.a = imageFetcher;
        this.g = c3809bF;
    }

    @Override // org.chromium.base.Callback
    public final void onResult(Object obj) {
        C5070ev c5070ev = (C5070ev) obj;
        this.a.b();
        if (c5070ev == null) {
            EI2.h(1, 3, "NewTabPage.CryptidRenderResult");
            this.g.onResult(null);
        } else {
            RunnableC4383cv runnableC4383cv = new RunnableC4383cv(c5070ev, Bitmap.Config.ARGB_8888);
            runnableC4383cv.X = 1;
            runnableC4383cv.s = true;
            this.g.onResult(runnableC4383cv);
        }
    }
}
