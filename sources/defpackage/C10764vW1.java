package defpackage;

import android.content.Context;
import java.util.HashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: vW1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10764vW1 {
    public final C10421uW1 a;
    public final C1690Na0 b;
    public final HashMap c;

    public C10764vW1(Context context, C1690Na0 c1690Na0) {
        C10421uW1 c10421uW1 = new C10421uW1(context);
        this.c = new HashMap();
        this.a = c10421uW1;
        this.b = c1690Na0;
    }

    public final synchronized C5542gI a(String str) {
        if (this.c.containsKey(str)) {
            return (C5542gI) this.c.get(str);
        }
        if (this.a.a(str) == null) {
            return null;
        }
        C1690Na0 c1690Na0 = this.b;
        Context context = c1690Na0.a;
        InterfaceC4919eV interfaceC4919eV = c1690Na0.b;
        InterfaceC4919eV interfaceC4919eV2 = c1690Na0.c;
        if (context == null) {
            throw new NullPointerException("Null applicationContext");
        }
        if (interfaceC4919eV == null) {
            throw new NullPointerException("Null wallClock");
        }
        if (interfaceC4919eV2 == null) {
            throw new NullPointerException("Null monotonicClock");
        }
        if (str != null) {
            C5542gI c5542gI = new C5542gI(context, interfaceC4919eV, interfaceC4919eV2);
            this.c.put(str, c5542gI);
            return c5542gI;
        }
        throw new NullPointerException("Null backendName");
    }
}
