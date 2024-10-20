package defpackage;

import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ob, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8388ob implements InterfaceC10445ub {
    public final C5638gb a;
    public final C5638gb b;

    public C8388ob(C5638gb c5638gb, C5638gb c5638gb2) {
        this.a = c5638gb;
        this.b = c5638gb2;
    }

    @Override // defpackage.InterfaceC10445ub
    public final List b() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    @Override // defpackage.InterfaceC10445ub
    public final boolean c() {
        return this.a.c() && this.b.c();
    }

    @Override // defpackage.InterfaceC10445ub
    public final AbstractC11251wv a() {
        return new C1858Oh3((C4552dQ0) this.a.a(), (C4552dQ0) this.b.a());
    }
}
