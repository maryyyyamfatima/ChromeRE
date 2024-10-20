package defpackage;

import java.util.ArrayDeque;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ac2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0013Ac2 implements LF {
    public final AbstractC11826yc2 a;
    public final /* synthetic */ C0143Bc2 b;

    public C0013Ac2(C0143Bc2 c0143Bc2, AbstractC11826yc2 abstractC11826yc2) {
        this.b = c0143Bc2;
        this.a = abstractC11826yc2;
    }

    @Override // defpackage.LF
    public final void cancel() {
        ArrayDeque arrayDeque = this.b.b;
        AbstractC11826yc2 abstractC11826yc2 = this.a;
        arrayDeque.remove(abstractC11826yc2);
        abstractC11826yc2.b.remove(this);
    }
}
