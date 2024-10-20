package defpackage;

import android.graphics.Bitmap;
import org.chromium.components.favicon.LargeIconBridge;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: tx1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10235tx1 implements LargeIconBridge.LargeIconCallback {
    public final /* synthetic */ GURL a;
    public final /* synthetic */ LargeIconBridge.LargeIconCallback g;
    public final /* synthetic */ LargeIconBridge h;

    @Override // org.chromium.components.favicon.LargeIconBridge.LargeIconCallback
    public final void onLargeIconAvailable(Bitmap bitmap, int i, boolean z, int i2) {
        this.h.c.put(this.a, new C10578ux1(bitmap, i, z, i2));
        this.g.onLargeIconAvailable(bitmap, i, z, i2);
    }

    public C10235tx1(LargeIconBridge largeIconBridge, GURL gurl, LargeIconBridge.LargeIconCallback largeIconCallback) {
        this.h = largeIconBridge;
        this.a = gurl;
        this.g = largeIconCallback;
    }
}
