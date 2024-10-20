package defpackage;

import android.content.Context;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: et4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5063et4 implements InterfaceC6793jv4 {
    public final Jw4 a;

    public C5063et4(Jw4 jw4) {
        this.a = jw4;
    }

    @Override // defpackage.InterfaceC6793jv4
    public final Object a() {
        Bw4 bw4;
        Context context = this.a.a;
        synchronized (Bw4.class) {
            if (Bw4.j == null) {
                EnumC7143kw4 enumC7143kw4 = EnumC7143kw4.a;
                Bw4.j = new Bw4(context);
            }
            bw4 = Bw4.j;
        }
        if (bw4 != null) {
            return bw4;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
