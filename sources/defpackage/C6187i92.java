package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: i92, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6187i92 extends AbstractC3708ax {
    public final InterfaceC1155Ix k;
    public Object l;
    public boolean m;

    public C6187i92(InterfaceC11128wa2 interfaceC11128wa2, InterfaceC1155Ix interfaceC1155Ix) {
        super(interfaceC11128wa2);
        this.k = interfaceC1155Ix;
    }

    @Override // defpackage.InterfaceC11128wa2
    public final void d(Object obj) {
        if (this.i) {
            return;
        }
        int i = this.j;
        InterfaceC11128wa2 interfaceC11128wa2 = this.a;
        if (i != 0) {
            interfaceC11128wa2.d(obj);
            return;
        }
        try {
            if (this.m) {
                boolean test = this.k.test(this.l, obj);
                this.l = obj;
                if (test) {
                    return;
                }
            } else {
                this.m = true;
                this.l = obj;
            }
            interfaceC11128wa2.d(obj);
        } catch (Throwable th) {
            AbstractC4148cE0.a(th);
            this.g.dispose();
            onError(th);
        }
    }

    @Override // defpackage.BG2
    public final int e(int i) {
        return a(i);
    }

    @Override // defpackage.InterfaceC3586ac3
    public final Object poll() {
        while (true) {
            Object poll = this.h.poll();
            if (poll == null) {
                return null;
            }
            if (!this.m) {
                this.m = true;
                this.l = poll;
                return poll;
            }
            if (!this.k.test(this.l, poll)) {
                this.l = poll;
                return poll;
            }
            this.l = poll;
        }
    }
}
