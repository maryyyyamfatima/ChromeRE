package defpackage;

import android.graphics.Rect;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: j13, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6482j13 implements YE2 {
    @Override // defpackage.YE2
    public final float b(Rect rect) {
        return Math.max(rect.width(), rect.height()) / 2.0f;
    }

    @Override // defpackage.YE2
    public final float a(Rect rect) {
        return Math.min(rect.width(), rect.height()) / 1.5f;
    }
}
