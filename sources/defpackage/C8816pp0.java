package defpackage;

import java.io.File;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: pp0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8816pp0 {
    public final C9159qp0 a;
    public final boolean[] b;
    public boolean c;
    public final /* synthetic */ C9844sp0 d;

    public C8816pp0(C9844sp0 c9844sp0, C9159qp0 c9159qp0) {
        this.d = c9844sp0;
        this.a = c9159qp0;
        this.b = c9159qp0.e ? null : new boolean[c9844sp0.l];
    }

    public final File b() {
        File file;
        synchronized (this.d) {
            C9159qp0 c9159qp0 = this.a;
            if (c9159qp0.f != this) {
                throw new IllegalStateException();
            }
            if (!c9159qp0.e) {
                this.b[0] = true;
            }
            file = c9159qp0.d[0];
            this.d.a.mkdirs();
        }
        return file;
    }

    public final void a() {
        C9844sp0.b(this.d, this, false);
    }
}
