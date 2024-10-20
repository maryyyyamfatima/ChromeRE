package defpackage;

import android.content.Context;
import android.content.res.Resources;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: vP2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10730vP2 {
    public final Resources a;
    public final Resources.Theme b;

    public C10730vP2(C7849n00 c7849n00) {
        Context context = c7849n00.a;
        this.a = context.getResources();
        this.b = context.getTheme();
    }

    public final int a(float f) {
        return FH0.a(f * this.a.getDisplayMetrics().density);
    }
}
