package defpackage;

import android.net.Uri;
import android.os.Bundle;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: en0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5023en0 implements InterfaceC0711Fm0 {
    public final C2140Qm0 a;
    public final C2660Um0 g;

    @Override // defpackage.D30
    public final void b(HY1 hy1) {
    }

    @Override // defpackage.InterfaceC7786mp1, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    public C5023en0(C2140Qm0 c2140Qm0, C2660Um0 c2660Um0) {
        this.a = c2140Qm0;
        this.g = c2660Um0;
    }

    @Override // defpackage.InterfaceC0711Fm0
    public final void H(String[] strArr, final C8117nn0 c8117nn0) {
        GURL g = this.g.a.g();
        if (g != null) {
            Uri parse = Uri.parse(g.i());
            C2140Qm0 c2140Qm0 = this.a;
            c2140Qm0.getClass();
            Bundle bundle = new Bundle();
            bundle.putStringArray("getDetails.itemIds", strArr);
            c2140Qm0.a(parse, "getDetails", bundle, new MY0(c8117nn0), new Runnable() { // from class: Im0
                @Override // java.lang.Runnable
                public final void run() {
                    C8117nn0.this.a(6, new C0092As1[0]);
                }
            }, new Runnable() { // from class: Jm0
                @Override // java.lang.Runnable
                public final void run() {
                    C8117nn0.this.a(5, new C0092As1[0]);
                }
            });
        }
    }

    @Override // defpackage.InterfaceC0711Fm0
    public final void l0(final C10861vn0 c10861vn0) {
        GURL g = this.g.a.g();
        if (g != null) {
            Uri parse = Uri.parse(g.i());
            C2140Qm0 c2140Qm0 = this.a;
            c2140Qm0.getClass();
            c2140Qm0.a(parse, "listPurchases", new Bundle(), new JD1(c10861vn0), new Runnable() { // from class: Gm0
                @Override // java.lang.Runnable
                public final void run() {
                    C10861vn0.this.a(6, new C5874hF2[0]);
                }
            }, new Runnable() { // from class: Hm0
                @Override // java.lang.Runnable
                public final void run() {
                    C10861vn0.this.a(5, new C5874hF2[0]);
                }
            });
        }
    }

    @Override // defpackage.InterfaceC0711Fm0
    public final void R(final C9489rn0 c9489rn0) {
        GURL g = this.g.a.g();
        if (g != null) {
            Uri parse = Uri.parse(g.i());
            C2140Qm0 c2140Qm0 = this.a;
            c2140Qm0.getClass();
            c2140Qm0.a(parse, "listPurchaseHistory", new Bundle(), new ID1(c9489rn0), new Runnable() { // from class: Nm0
                @Override // java.lang.Runnable
                public final void run() {
                    C9489rn0.this.a(6, new C5874hF2[0]);
                }
            }, new Runnable() { // from class: Om0
                @Override // java.lang.Runnable
                public final void run() {
                    C9489rn0.this.a(5, new C5874hF2[0]);
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Runnable, Km0] */
    /* JADX WARN: Type inference failed for: r6v0, types: [Lm0] */
    @Override // defpackage.InterfaceC0711Fm0
    public final void z0(final String str, final C6741jn0 c6741jn0) {
        GURL g = this.g.a.g();
        if (g != null) {
            final Uri parse = Uri.parse(g.i());
            final C2140Qm0 c2140Qm0 = this.a;
            c2140Qm0.getClass();
            Bundle bundle = new Bundle();
            bundle.putString("consume.purchaseToken", str);
            C10274u40 c10274u40 = new C10274u40(c6741jn0);
            final ?? r11 = new Runnable() { // from class: Km0
                @Override // java.lang.Runnable
                public final void run() {
                    C6741jn0.this.a(5);
                }
            };
            final ?? r6 = new Runnable() { // from class: Lm0
                @Override // java.lang.Runnable
                public final void run() {
                    C6741jn0.this.a(6);
                }
            };
            c2140Qm0.a(parse, "consume", bundle, c10274u40, new Runnable() { // from class: Mm0
                @Override // java.lang.Runnable
                public final void run() {
                    Uri uri = parse;
                    Runnable runnable = r6;
                    Runnable runnable2 = r11;
                    C2140Qm0 c2140Qm02 = C2140Qm0.this;
                    c2140Qm02.getClass();
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("acknowledge.purchaseToken", str);
                    bundle2.putBoolean("acknowledge.makeAvailableAgain", true);
                    c2140Qm02.a(uri, "acknowledge", bundle2, new G4(c6741jn0), runnable, runnable2);
                }
            }, r11);
        }
    }
}
