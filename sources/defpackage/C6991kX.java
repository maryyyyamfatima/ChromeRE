package defpackage;

import com.google.common.util.concurrent.r;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: kX, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6991kX extends r {
    public final Callable j;
    public final /* synthetic */ C7335lX k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6991kX(C7335lX c7335lX, Callable callable, Executor executor) {
        super(c7335lX, executor);
        this.k = c7335lX;
        this.j = callable;
    }

    @Override // defpackage.AbstractRunnableC9172qr1
    public final Object e() {
        return this.j.call();
    }

    @Override // com.google.common.util.concurrent.r
    public final void h(Object obj) {
        this.k.t(obj);
    }

    @Override // defpackage.AbstractRunnableC9172qr1
    public final String f() {
        return this.j.toString();
    }
}
