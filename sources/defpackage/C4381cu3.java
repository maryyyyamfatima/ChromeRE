package defpackage;

import java.io.Closeable;
import java.io.OutputStream;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: cu3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4381cu3 {
    public OutputStream a;
    public InterfaceC2438St3 b;

    public final void a(ArrayList arrayList) {
        Closeable closeable = (OutputStream) AbstractC1781Ns1.a(arrayList);
        if (closeable instanceof InterfaceC2438St3) {
            this.b = (InterfaceC2438St3) closeable;
            this.a = (OutputStream) arrayList.get(0);
        }
    }

    public final void b() {
        if (this.b == null) {
            throw new U14("Cannot sync underlying stream");
        }
        this.a.flush();
        ((C0350Cs) this.b).a.getFD().sync();
    }
}
