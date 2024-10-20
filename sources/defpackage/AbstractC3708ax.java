package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ax, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3708ax implements InterfaceC11128wa2, AG2 {
    public final InterfaceC11128wa2 a;
    public InterfaceC6416iq0 g;
    public AG2 h;
    public boolean i;
    public int j;

    public AbstractC3708ax(InterfaceC11128wa2 interfaceC11128wa2) {
        this.a = interfaceC11128wa2;
    }

    @Override // defpackage.InterfaceC11128wa2
    public final void c(InterfaceC6416iq0 interfaceC6416iq0) {
        if (EnumC7791mq0.g(this.g, interfaceC6416iq0)) {
            this.g = interfaceC6416iq0;
            if (interfaceC6416iq0 instanceof AG2) {
                this.h = (AG2) interfaceC6416iq0;
            }
            this.a.c(this);
        }
    }

    @Override // defpackage.InterfaceC11128wa2
    public final void onError(Throwable th) {
        if (this.i) {
            MR2.b(th);
        } else {
            this.i = true;
            this.a.onError(th);
        }
    }

    @Override // defpackage.InterfaceC11128wa2
    public final void b() {
        if (this.i) {
            return;
        }
        this.i = true;
        this.a.b();
    }

    public final int a(int i) {
        AG2 ag2 = this.h;
        if (ag2 == null || (i & 4) != 0) {
            return 0;
        }
        int e = ag2.e(i);
        if (e != 0) {
            this.j = e;
        }
        return e;
    }

    @Override // defpackage.InterfaceC6416iq0
    public final void dispose() {
        this.g.dispose();
    }

    @Override // defpackage.InterfaceC3586ac3
    public final boolean isEmpty() {
        return this.h.isEmpty();
    }

    @Override // defpackage.InterfaceC3586ac3
    public final void clear() {
        this.h.clear();
    }

    @Override // defpackage.InterfaceC3586ac3
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
