package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: sx2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9893sx2 extends C9550rx2 {
    public final Object c;

    public C9893sx2(int i) {
        super(i);
        this.c = new Object();
    }

    @Override // defpackage.C9550rx2, defpackage.InterfaceC9208qx2
    public final Object b() {
        Object b;
        synchronized (this.c) {
            b = super.b();
        }
        return b;
    }

    @Override // defpackage.C9550rx2, defpackage.InterfaceC9208qx2
    public final boolean a(Object obj) {
        boolean a;
        synchronized (this.c) {
            a = super.a(obj);
        }
        return a;
    }
}
