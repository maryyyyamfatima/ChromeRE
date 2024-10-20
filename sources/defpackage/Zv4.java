package defpackage;

import android.content.Context;
import java.io.File;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class Zv4 implements InterfaceC6793jv4 {
    public final InterfaceC6793jv4 a;
    public final InterfaceC6793jv4 b;
    public final InterfaceC6793jv4 c;

    public Zv4(Lw4 lw4, InterfaceC6793jv4 interfaceC6793jv4, InterfaceC6793jv4 interfaceC6793jv42) {
        this.a = lw4;
        this.b = interfaceC6793jv4;
        this.c = interfaceC6793jv42;
    }

    @Override // defpackage.InterfaceC6793jv4
    public final Object a() {
        Context context = ((Lw4) this.a).a.a;
        if (context != null) {
            return new AH0(context, (File) this.b.a(), (tw4) this.c.a());
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
