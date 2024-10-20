package defpackage;

import android.graphics.Bitmap;
import android.graphics.Rect;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: sv0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9880sv0 implements IO2 {
    public final Bitmap a;
    public final boolean b;
    public final Rect c;
    public final long d;

    @Override // defpackage.IO2
    public final C5819h52 e() {
        return null;
    }

    public C9880sv0(Bitmap bitmap, boolean z, Rect rect, long j) {
        this.a = bitmap;
        this.b = z;
        this.c = rect;
        this.d = j;
    }

    @Override // defpackage.IO2
    public final Bitmap b() {
        return this.a;
    }

    @Override // defpackage.IO2
    public final boolean a() {
        return this.b;
    }

    @Override // defpackage.IO2
    public final Rect d() {
        return this.c;
    }

    @Override // defpackage.IO2
    public final long c() {
        return this.d;
    }
}
