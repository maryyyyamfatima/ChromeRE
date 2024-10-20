package defpackage;

import com.google.common.util.concurrent.r;
import java.util.concurrent.Executor;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: jX, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6647jX extends r {
    public final InterfaceC2909Wk j;
    public final /* synthetic */ C7335lX k;

    @Override // com.google.common.util.concurrent.r
    public final void h(Object obj) {
        this.k.v((RD1) obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6647jX(C7335lX c7335lX, C3544aU3 c3544aU3, Executor executor) {
        super(c7335lX, executor);
        this.k = c7335lX;
        this.j = c3544aU3;
    }

    @Override // defpackage.AbstractRunnableC9172qr1
    public final Object e() {
        return this.j.call();
    }

    @Override // defpackage.AbstractRunnableC9172qr1
    public final String f() {
        return this.j.toString();
    }
}
