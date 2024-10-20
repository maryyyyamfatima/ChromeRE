package defpackage;

import android.database.Cursor;
import android.os.Build;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: nf0 */
/* loaded from: classes.dex */
public final class C8069nf0 implements InterfaceC7381lf0 {
    public final InterfaceC7381lf0 a;
    public final C8756pf0 b = new C8756pf0();

    public C8069nf0() {
        C9185qt2 a;
        C7725mf0 c7725mf0 = null;
        C8413of0 c8413of0 = ((Build.VERSION.SDK_INT >= 28) && (a = C9185qt2.a()) != null) ? new C8413of0(a.a) : null;
        this.a = c8413of0;
        if (c8413of0 == null) {
            try {
                if (C7725mf0.a == null) {
                    C7725mf0.a = V60.a.getContentResolver();
                }
                if (AbstractC7192l51.e(C7725mf0.a, "sole:chrome_last_modified") > 0) {
                    c7725mf0 = new C7725mf0();
                }
            } catch (Exception e) {
                AbstractC4851eH1.f("ADCP", "Couldn't get timestamp in chrome_last_modified.", e);
            }
            this.a = c7725mf0;
        }
        if (this.a == null) {
            this.a = this.b;
        }
    }

    @Override // defpackage.InterfaceC7381lf0
    public final String a() {
        return this.a.a();
    }

    @Override // defpackage.InterfaceC7381lf0
    public final boolean b() {
        return this.a.b();
    }

    public final boolean c() {
        this.b.getClass();
        boolean z = false;
        if (C8756pf0.d()) {
            Cursor query = V60.a.getContentResolver().query(C8756pf0.c("disableincognitomode"), null, null, null, null);
            if (query != null && query.moveToFirst() && query.getColumnCount() == 1 && query.getInt(0) == 1) {
                z = true;
            }
            if (query != null) {
                query.close();
            }
        }
        return z;
    }
}
