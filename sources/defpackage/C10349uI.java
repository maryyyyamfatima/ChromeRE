package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: uI, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10349uI extends VB1 {
    public final int q;

    public C10349uI(Context context, int i) {
        super(context);
        this.q = i;
    }

    @Override // defpackage.VB1
    public final int a(int i, int i2, int i3, int i4, int i5) {
        return ((((i4 - i3) / 2) + i3) - (((i2 - i) / 2) + i)) + this.q;
    }

    @Override // defpackage.VB1
    public final float b(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }
}
