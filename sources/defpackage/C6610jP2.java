package defpackage;

import java.util.LinkedHashSet;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: jP2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6610jP2 extends AbstractC4734dw1 implements InterfaceC7670mV0 {
    public final /* synthetic */ C7298lP2 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6610jP2(C7298lP2 c7298lP2) {
        super(1);
        this.g = c7298lP2;
    }

    @Override // defpackage.InterfaceC7670mV0
    public final Object b(Object obj) {
        LinkedHashSet linkedHashSet = this.g.c;
        String str = ((C3370Zy0) obj).k;
        AbstractC0087Ar1.d(str, "it.identifier");
        return Boolean.valueOf(linkedHashSet.add(str));
    }
}
