package defpackage;

import android.graphics.Rect;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class WE2 implements YE2 {
    public final /* synthetic */ int a;

    public WE2(int i) {
        this.a = i;
    }

    @Override // defpackage.YE2
    public final float b(Rect rect) {
        return Math.min(this.a * 1.2f, Math.min(rect.width(), rect.height()) / 2.0f);
    }

    @Override // defpackage.YE2
    public final float a(Rect rect) {
        return Math.min(this.a, Math.min(rect.width(), rect.height()) / 2.0f);
    }
}
