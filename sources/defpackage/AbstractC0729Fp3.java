package defpackage;

import java.io.Serializable;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Fp3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0729Fp3 {
    public static InterfaceC0209Bp3 a(InterfaceC0209Bp3 interfaceC0209Bp3) {
        if ((interfaceC0209Bp3 instanceof C0469Dp3) || (interfaceC0209Bp3 instanceof C0339Cp3)) {
            return interfaceC0209Bp3;
        }
        if (interfaceC0209Bp3 instanceof Serializable) {
            return new C0339Cp3(interfaceC0209Bp3);
        }
        return new C0469Dp3(interfaceC0209Bp3);
    }
}
