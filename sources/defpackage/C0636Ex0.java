package defpackage;

import android.util.Pair;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ex0 */
/* loaded from: classes.dex */
public final class C0636Ex0 implements InterfaceC11128wa2, InterfaceC6416iq0 {
    public final C10942w10 g;
    public final C11628y10 h;
    public volatile WZ j;
    public volatile boolean k;
    public final AtomicReference a = new AtomicReference();
    public final Object i = new Object();

    @Override // defpackage.InterfaceC11128wa2
    public final void b() {
    }

    @Override // defpackage.InterfaceC11128wa2
    public final void onError(Throwable th) {
        throw ZD0.a(th);
    }

    public C0636Ex0(C10942w10 c10942w10, C11628y10 c11628y10) {
        this.g = c10942w10;
        this.h = c11628y10;
    }

    @Override // defpackage.InterfaceC11128wa2
    public final void c(InterfaceC6416iq0 interfaceC6416iq0) {
        AbstractC3446aB0.a(this.a, interfaceC6416iq0, C0636Ex0.class);
    }

    public final boolean a() {
        return this.a.get() == EnumC7791mq0.a;
    }

    @Override // defpackage.InterfaceC6416iq0
    public final void dispose() {
        EnumC7791mq0.a(this.a);
    }

    @Override // defpackage.InterfaceC11128wa2
    public final void d(Object obj) {
        Pair pair = (Pair) obj;
        if (a()) {
            return;
        }
        synchronized (this.i) {
            this.j = (WZ) pair.first;
            if (this.k && !a()) {
                C10942w10 c10942w10 = this.g;
                C7849n00 c7849n00 = (C7849n00) pair.second;
                c10942w10.getClass();
                C10942w10.a(c7849n00);
            }
        }
    }
}
