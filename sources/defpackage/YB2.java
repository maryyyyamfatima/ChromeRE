package defpackage;

import android.content.Context;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class YB2 implements InterfaceC0209Bp3 {
    public final String a;
    public final String g;
    public final Object h;
    public final HP0 i;
    public volatile C5327fg2 j;
    public volatile int k = -1;
    public volatile Object l;

    public YB2(String str, String str2, Object obj, C6305iX c6305iX) {
        this.a = str;
        this.g = str2;
        this.h = obj;
        this.i = c6305iX;
    }

    @Override // defpackage.InterfaceC0209Bp3
    public final Object get() {
        Object obj = C7123kt2.f;
        synchronized (AbstractC7811mt2.a) {
        }
        if (AbstractC7811mt2.c == null) {
            AbstractC7811mt2.c = new C7467lt2();
        }
        throw new IllegalStateException("Must call PhenotypeContext.setContext() first");
    }

    public final Object a(Context context) {
        C7123kt2 b = C7123kt2.b(context.getApplicationContext());
        int i = this.k;
        Object obj = this.l;
        if (this.j == null || i < this.j.a.get() || obj == null) {
            synchronized (this) {
                if (this.j == null) {
                    HP0 hp0 = this.i;
                    String str = this.a;
                    C6305iX c6305iX = (C6305iX) hp0;
                    c6305iX.getClass();
                    synchronized (AbstractC7811mt2.a) {
                    }
                    if (AbstractC7811mt2.b == null) {
                        AbstractC7811mt2.b = new C7467lt2();
                    }
                    this.j = c6305iX.a(b, str).e;
                }
                if (this.k < this.j.a.get()) {
                    this.k = this.j.a.get();
                    this.l = b(b);
                }
                obj = this.l;
            }
        }
        return obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(final defpackage.C7123kt2 r9) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.YB2.b(kt2):java.lang.Object");
    }
}
