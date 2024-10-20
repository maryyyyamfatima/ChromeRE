package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Nd3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1708Nd3 implements InterfaceC5467g40 {
    public final /* synthetic */ C3268Zd3 a;

    public C1708Nd3(C3268Zd3 c3268Zd3) {
        this.a = c3268Zd3;
    }

    @Override // defpackage.InterfaceC5467g40
    public final void a(boolean z) {
        ArrayList arrayList;
        AbstractC10296u74.a();
        synchronized (this.a) {
            arrayList = new ArrayList(this.a.b);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((InterfaceC5467g40) it.next()).a(z);
        }
    }
}
