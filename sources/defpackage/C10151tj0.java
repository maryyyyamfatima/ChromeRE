package defpackage;

import android.content.Context;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: tj0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10151tj0 implements InterfaceC5811h40 {
    public final Context a;
    public final InterfaceC5467g40 g;

    @Override // defpackage.GA1
    public final void onDestroy() {
    }

    public C10151tj0(Context context, C5231fO2 c5231fO2) {
        this.a = context.getApplicationContext();
        this.g = c5231fO2;
    }

    @Override // defpackage.GA1
    public final void b() {
        C3268Zd3 a = C3268Zd3.a(this.a);
        InterfaceC5467g40 interfaceC5467g40 = this.g;
        synchronized (a) {
            a.b.add(interfaceC5467g40);
            if (!a.c && !a.b.isEmpty()) {
                a.c = a.a.a();
            }
        }
    }

    @Override // defpackage.GA1
    public final void a() {
        C3268Zd3 a = C3268Zd3.a(this.a);
        InterfaceC5467g40 interfaceC5467g40 = this.g;
        synchronized (a) {
            a.b.remove(interfaceC5467g40);
            if (a.c && a.b.isEmpty()) {
                a.a.b();
                a.c = false;
            }
        }
    }
}
