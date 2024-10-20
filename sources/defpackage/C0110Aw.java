package defpackage;

import android.content.Context;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Aw, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0110Aw {
    public final C5726gp3 a;
    public final Runnable b;
    public final String c;
    public final String d;

    public C0110Aw(C5726gp3 c5726gp3, String str, String str2, Runnable runnable) {
        this.a = c5726gp3;
        this.c = str;
        this.d = str2;
        this.b = runnable;
    }

    public C0110Aw(Context context, C5726gp3 c5726gp3, int i, Runnable runnable) {
        this(c5726gp3, context.getResources().getString(i), (String) null, runnable);
    }
}
