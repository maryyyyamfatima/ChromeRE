package defpackage;

import android.graphics.Bitmap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: z93, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12022z93 extends AbstractC0185Bl {
    public final /* synthetic */ Bitmap h;
    public final /* synthetic */ C12237zn4 i;

    public C12022z93(Bitmap bitmap, C12237zn4 c12237zn4) {
        this.h = bitmap;
        this.i = c12237zn4;
    }

    @Override // defpackage.AbstractC0185Bl
    public final void k(Object obj) {
        this.i.b.edit().putString("splash_icon", (String) obj).apply();
    }

    @Override // defpackage.AbstractC0185Bl
    public final Object b() {
        return AbstractC9552ry.a(this.h);
    }
}
