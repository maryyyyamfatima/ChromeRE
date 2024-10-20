package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: iR2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6278iR2 extends ViewOutlineProvider {
    public int a;

    public C6278iR2(int i) {
        this.a = i;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        outline.setRoundRect(view.getPaddingLeft(), view.getPaddingTop(), view.getWidth() - view.getPaddingRight(), view.getHeight() - view.getPaddingBottom(), this.a);
    }
}
