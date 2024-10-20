package defpackage;

import android.graphics.Bitmap;
import org.chromium.components.favicon.LargeIconBridge;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: j30, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6491j30 implements LargeIconBridge.LargeIconCallback {
    public final /* synthetic */ C7179l30 a;
    public final /* synthetic */ String g;
    public final /* synthetic */ C6835k30 h;

    public C6491j30(C6835k30 c6835k30, C7179l30 c7179l30, String str) {
        this.h = c6835k30;
        this.a = c7179l30;
        this.g = str;
    }

    @Override // org.chromium.components.favicon.LargeIconBridge.LargeIconCallback
    public final void onLargeIconAvailable(Bitmap bitmap, int i, boolean z, int i2) {
        C7179l30 c7179l30 = this.a;
        if (this != c7179l30.c) {
            return;
        }
        String str = this.g;
        C6835k30 c6835k30 = this.h;
        c7179l30.b.setImageDrawable(AbstractC4855eI0.d(bitmap, str, i, c6835k30.h, c6835k30.i.N(), c6835k30.g));
    }
}
