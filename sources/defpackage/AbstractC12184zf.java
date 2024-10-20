package defpackage;

import android.content.IntentFilter;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: zf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC12184zf {
    public C11841yf a;
    public final /* synthetic */ LayoutInflaterFactory2C0545Ef b;

    public abstract IntentFilter b();

    public abstract int c();

    public abstract void d();

    public AbstractC12184zf(LayoutInflaterFactory2C0545Ef layoutInflaterFactory2C0545Ef) {
        this.b = layoutInflaterFactory2C0545Ef;
    }

    public final void e() {
        a();
        IntentFilter b = b();
        if (b == null || b.countActions() == 0) {
            return;
        }
        if (this.a == null) {
            this.a = new C11841yf(this);
        }
        this.b.j.registerReceiver(this.a, b);
    }

    public final void a() {
        C11841yf c11841yf = this.a;
        if (c11841yf != null) {
            try {
                this.b.j.unregisterReceiver(c11841yf);
            } catch (IllegalArgumentException unused) {
            }
            this.a = null;
        }
    }
}
