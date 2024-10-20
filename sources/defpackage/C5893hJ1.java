package defpackage;

import java.util.HashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: hJ1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5893hJ1 {
    public final InterfaceC3241Yy1 b;
    public final AbstractC10422uW2 c;
    public final AbstractC10422uW2 d;
    public final HashMap a = new HashMap();
    public final Object e = new Object();

    public C5893hJ1(InterfaceC3241Yy1 interfaceC3241Yy1, AE0 ae0, AE0 ae02) {
        this.b = interfaceC3241Yy1;
        this.c = ae0;
        this.d = ae02;
    }

    public final void a(String str) {
        C5422fw1 c5422fw1;
        synchronized (this.e) {
            C5549gJ1 c5549gJ1 = (C5549gJ1) this.a.get(str);
            if (c5549gJ1 != null && (c5422fw1 = c5549gJ1.b) != null) {
                EnumC7791mq0.a(c5422fw1);
                c5549gJ1.b = null;
            }
        }
    }
}
