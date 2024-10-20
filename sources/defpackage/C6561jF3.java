package defpackage;

import java.util.ArrayDeque;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: jF3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6561jF3 {
    public final Object a = new Object();
    public ArrayDeque b;
    public boolean c;

    public final void a(InterfaceC6219iF3 interfaceC6219iF3) {
        synchronized (this.a) {
            if (this.b == null) {
                this.b = new ArrayDeque();
            }
            this.b.add(interfaceC6219iF3);
        }
    }

    public final void b(AF3 af3) {
        InterfaceC6219iF3 interfaceC6219iF3;
        synchronized (this.a) {
            if (this.b != null && !this.c) {
                this.c = true;
                while (true) {
                    synchronized (this.a) {
                        interfaceC6219iF3 = (InterfaceC6219iF3) this.b.poll();
                        if (interfaceC6219iF3 == null) {
                            this.c = false;
                            return;
                        }
                    }
                    interfaceC6219iF3.b(af3);
                }
            }
        }
    }
}
