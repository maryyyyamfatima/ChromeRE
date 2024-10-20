package defpackage;

import java.util.ArrayDeque;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: qv, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC9194qv {
    public final ArrayDeque a;

    public abstract InterfaceC8179nx2 a();

    public AbstractC9194qv() {
        char[] cArr = AbstractC10296u74.a;
        this.a = new ArrayDeque(20);
    }

    public final InterfaceC8179nx2 b() {
        InterfaceC8179nx2 interfaceC8179nx2 = (InterfaceC8179nx2) this.a.poll();
        return interfaceC8179nx2 == null ? a() : interfaceC8179nx2;
    }

    public final void c(InterfaceC8179nx2 interfaceC8179nx2) {
        ArrayDeque arrayDeque = this.a;
        if (arrayDeque.size() < 20) {
            arrayDeque.offer(interfaceC8179nx2);
        }
    }
}
