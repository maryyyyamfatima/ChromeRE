package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: oo3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8470oo3 extends ViewOutlineProvider {
    public final int a;

    public C8470oo3(int i) {
        this.a = i;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.a);
    }
}
