package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Yk0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3170Yk0 extends AbstractC4052bx {
    public final InterfaceC11128wa2 a;
    public Object g;

    public C3170Yk0(InterfaceC11128wa2 interfaceC11128wa2) {
        this.a = interfaceC11128wa2;
    }

    @Override // defpackage.BG2
    public final int e(int i) {
        if ((i & 2) == 0) {
            return 0;
        }
        lazySet(8);
        return 2;
    }

    @Override // defpackage.InterfaceC3586ac3
    public final Object poll() {
        if (get() != 16) {
            return null;
        }
        Object obj = this.g;
        this.g = null;
        lazySet(32);
        return obj;
    }

    @Override // defpackage.InterfaceC3586ac3
    public final boolean isEmpty() {
        return get() != 16;
    }

    @Override // defpackage.InterfaceC3586ac3
    public final void clear() {
        lazySet(32);
        this.g = null;
    }

    @Override // defpackage.InterfaceC6416iq0
    public final void dispose() {
        set(4);
        this.g = null;
    }

    public final boolean a() {
        return get() == 4;
    }
}
