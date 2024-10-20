package defpackage;

import java.util.Map;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class VH1 {
    public static InterfaceC9173qr2 a(C7849n00 c7849n00, C5524gE1 c5524gE1, InterfaceC9173qr2 interfaceC9173qr2) {
        return b(c5524gE1, c7849n00.d(), interfaceC9173qr2, c7849n00.g());
    }

    public static InterfaceC9173qr2 b(C5524gE1 c5524gE1, String str, InterfaceC9173qr2 interfaceC9173qr2, C5277fX3 c5277fX3) {
        Map b;
        if (interfaceC9173qr2 == null) {
            return null;
        }
        if (str == null) {
            c5524gE1.getClass();
            if (interfaceC9173qr2 instanceof InterfaceC7948nI) {
                ((InterfaceC7948nI) interfaceC9173qr2).cancel();
            }
            return null;
        }
        interfaceC9173qr2.g("log_tag", str);
        if (c5277fX3 == null || (b = c5524gE1.a.b(c5277fX3)) == null) {
            return interfaceC9173qr2;
        }
        for (Map.Entry entry : b.entrySet()) {
            interfaceC9173qr2.g((String) entry.getKey(), (String) entry.getValue());
        }
        return interfaceC9173qr2;
    }
}
