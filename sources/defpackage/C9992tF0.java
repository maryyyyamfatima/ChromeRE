package defpackage;

import android.graphics.Rect;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: tF0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9992tF0 implements YE2 {
    @Override // defpackage.YE2
    public final float b(Rect rect) {
        return Math.min(rect.width(), rect.height()) / 2.0f;
    }

    @Override // defpackage.YE2
    public final float a(Rect rect) {
        return Math.min(rect.width(), rect.height()) / 3.0f;
    }
}
