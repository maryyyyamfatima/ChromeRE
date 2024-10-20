package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: lZ0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7346lZ0 extends AbstractC5663gf0 {
    public final Handler i;
    public final int j;
    public final long k;
    public Bitmap l;

    @Override // defpackage.TE3
    public final void d(Object obj, OV3 ov3) {
        this.l = (Bitmap) obj;
        Handler handler = this.i;
        handler.sendMessageAtTime(handler.obtainMessage(1, this), this.k);
    }

    public C7346lZ0(Handler handler, int i, long j) {
        this.i = handler;
        this.j = i;
        this.k = j;
    }

    @Override // defpackage.TE3
    public final void m(Drawable drawable) {
        this.l = null;
    }
}
