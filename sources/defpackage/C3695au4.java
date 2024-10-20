package defpackage;

import android.content.Context;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: au4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3695au4 implements InterfaceC6793jv4 {
    public final InterfaceC6793jv4 a;
    public final /* synthetic */ int b = 0;

    public C3695au4(Lw4 lw4) {
        this.a = lw4;
    }

    public C3695au4(Lw4 lw4, int i) {
        this.a = lw4;
    }

    @Override // defpackage.InterfaceC6793jv4
    public final Object a() {
        Lw4 lw4 = (Lw4) this.a;
        if (this.b != 0) {
            Context context = lw4.a.a;
            if (context != null) {
                return new St4(context);
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
        Context context2 = lw4.a.a;
        if (context2 != null) {
            return new Wt4(context2);
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
