package defpackage;

import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: zb */
/* loaded from: classes.dex */
public final class C12160zb {
    public final Object a;

    public C12160zb(CommandOuterClass$Command commandOuterClass$Command, InterfaceC9738sX interfaceC9738sX, AbstractC11362xE3 abstractC11362xE3) {
        this.a = abstractC11362xE3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C12160zb)) {
            return false;
        }
        C12160zb c12160zb = (C12160zb) obj;
        Object obj2 = this.a;
        if (obj2 instanceof AbstractC11362xE3) {
            Object obj3 = c12160zb.a;
            if (obj3 instanceof AbstractC11362xE3) {
                return RP0.l((AbstractC11362xE3) obj2, (AbstractC11362xE3) obj3);
            }
        }
        return obj2.equals(c12160zb.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
