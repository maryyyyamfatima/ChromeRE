package defpackage;

import java.io.Serializable;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: p02, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8538p02 implements InterfaceC0209Bp3, Serializable {
    public final int a;

    @Override // defpackage.InterfaceC0209Bp3
    public final Object get() {
        return new QY(this.a);
    }

    public C8538p02(int i) {
        RV.b(i, "expectedValuesPerKey");
        this.a = i;
    }
}
