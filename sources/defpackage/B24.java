package defpackage;

import android.database.sqlite.SQLiteDatabase;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.Objects;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final /* synthetic */ class B24 implements Runnable {
    public final /* synthetic */ J24 a;
    public final /* synthetic */ C2149Qo g;
    public final /* synthetic */ int h;
    public final /* synthetic */ Runnable i;

    public /* synthetic */ B24(J24 j24, C2149Qo c2149Qo, int i, Runnable runnable) {
        this.a = j24;
        this.g = c2149Qo;
        this.h = i;
        this.i = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final C2149Qo c2149Qo = this.g;
        final int i = this.h;
        Runnable runnable = this.i;
        final J24 j24 = this.a;
        InterfaceC2828Vt3 interfaceC2828Vt3 = j24.f;
        try {
            try {
                final InterfaceC11011wD0 interfaceC11011wD0 = j24.c;
                Objects.requireNonNull(interfaceC11011wD0);
                ((C5600gT2) interfaceC2828Vt3).f(new InterfaceC2698Ut3() { // from class: C24
                    @Override // defpackage.InterfaceC2698Ut3
                    public final Object a() {
                        C5600gT2 c5600gT2 = (C5600gT2) InterfaceC11011wD0.this;
                        long a = c5600gT2.g.a() - c5600gT2.i.d;
                        SQLiteDatabase b = c5600gT2.b();
                        b.beginTransaction();
                        try {
                            Integer valueOf = Integer.valueOf(b.delete("events", "timestamp_ms < ?", new String[]{String.valueOf(a)}));
                            b.setTransactionSuccessful();
                            b.endTransaction();
                            return Integer.valueOf(valueOf.intValue());
                        } catch (Throwable th) {
                            b.endTransaction();
                            throw th;
                        }
                    }
                });
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) j24.a.getSystemService("connectivity")).getActiveNetworkInfo();
                if (!(activeNetworkInfo != null && activeNetworkInfo.isConnected())) {
                    ((C5600gT2) interfaceC2828Vt3).f(new InterfaceC2698Ut3() { // from class: D24
                        @Override // defpackage.InterfaceC2698Ut3
                        public final Object a() {
                            ((C11927yt1) J24.this.d).a(c2149Qo, i + 1, false);
                            return null;
                        }
                    });
                } else {
                    j24.a(c2149Qo, i);
                }
            } catch (C2568Tt3 unused) {
                ((C11927yt1) j24.d).a(c2149Qo, i + 1, false);
            }
        } finally {
            runnable.run();
        }
    }
}
