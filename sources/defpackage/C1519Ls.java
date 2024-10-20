package defpackage;

import android.os.Handler;
import org.chromium.base.ThreadUtils;
import org.chromium.net.a;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ls, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1519Ls implements T22 {
    public final a a;
    public final InterfaceC1390Ks b;
    public final Handler c;

    @Override // defpackage.T22
    public final void a(int i) {
    }

    @Override // defpackage.T22
    public final void c(long j) {
    }

    @Override // defpackage.T22
    public final void d(int i, long j) {
    }

    @Override // defpackage.T22
    public final void e(int i) {
    }

    @Override // defpackage.T22
    public final void f(long[] jArr) {
    }

    @Override // defpackage.T22
    public final void g(long j) {
    }

    public C1519Ls(C5119f32 c5119f32) {
        Handler handler = new Handler(ThreadUtils.c());
        this.c = handler;
        this.b = c5119f32;
        a aVar = new a(this, new EL2());
        this.a = aVar;
        final int b = aVar.d().b();
        handler.post(new Runnable() { // from class: Js
            @Override // java.lang.Runnable
            public final void run() {
                C1519Ls.this.b.c(b);
            }
        });
    }

    @Override // defpackage.T22
    public final void b(final int i) {
        Runnable runnable = new Runnable() { // from class: Is
            @Override // java.lang.Runnable
            public final void run() {
                C1519Ls.this.b.b(i);
            }
        };
        Object obj = ThreadUtils.a;
        this.c.post(runnable);
    }
}
