package defpackage;

import android.content.Context;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class Lw4 implements InterfaceC6793jv4 {
    public final Jw4 a;

    public Lw4(Jw4 jw4) {
        this.a = jw4;
    }

    @Override // defpackage.InterfaceC6793jv4
    public final Object a() {
        Context context = this.a.a;
        if (context != null) {
            return context;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
