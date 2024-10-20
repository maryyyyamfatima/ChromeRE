package defpackage;

import android.net.Uri;
import android.os.StrictMode;
import android.util.Log;
import com.google.protobuf.MessageLite;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class MP0 {
    public static final LP0 h = new LP0();
    public final C7123kt2 a;
    public final String b;
    public final String c;
    public final XB2 d = new XB2(new InterfaceC0209Bp3() { // from class: IP0
        @Override // defpackage.InterfaceC0209Bp3
        public final Object get() {
            C4641dg3 c4641dg3;
            InterfaceC7751mj2 interfaceC7751mj2;
            XF0 c;
            InputStream a;
            final QX1 qx1 = (QX1) MP0.this;
            qx1.getClass();
            StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
            C3954bg3 c3954bg3 = qx1.j;
            c3954bg3.getClass();
            try {
                C3694au3 c3694au3 = (C3694au3) c3954bg3.a.e.get();
                Uri uri = c3954bg3.b;
                interfaceC7751mj2 = (InterfaceC7751mj2) C4641dg3.q.l(PX0.GET_PARSER);
                c = XF0.c();
                a = EH2.a(c3694au3.a(uri));
            } catch (IOException | RuntimeException unused) {
                Log.i("SnapshotHandler", "Unable to retrieve flag snapshot for " + c3954bg3.c + ", using defaults.");
                c4641dg3 = C4641dg3.q;
            }
            try {
                MessageLite b = ((KX0) interfaceC7751mj2).b(a, c);
                if (a != null) {
                    a.close();
                }
                c4641dg3 = (C4641dg3) b;
                StrictMode.setThreadPolicy(allowThreadDiskWrites);
                if (!qx1.g && c4641dg3.k.isEmpty()) {
                    ((QY1) qx1.a.a()).execute(new Runnable() { // from class: NX1
                        @Override // java.lang.Runnable
                        public final void run() {
                            QX1.this.b();
                        }
                    });
                    return TL2.l;
                }
                qx1.i = c4641dg3.k;
                ((QY1) qx1.a.a()).execute(new Runnable() { // from class: OX1
                    @Override // java.lang.Runnable
                    public final void run() {
                        QX1.this.a();
                    }
                });
                C0306Cj0 c0306Cj0 = AbstractC0436Dj0.a;
                if (c0306Cj0 == null) {
                    synchronized (AbstractC0436Dj0.class) {
                        if (AbstractC0436Dj0.a == null) {
                            AbstractC0436Dj0.a = new C0306Cj0();
                        }
                        c0306Cj0 = AbstractC0436Dj0.a;
                    }
                }
                c0306Cj0.getClass();
                ((QY1) qx1.a.a()).execute(new Runnable() { // from class: PX1
                    @Override // java.lang.Runnable
                    public final void run() {
                        final QX1 qx12 = QX1.this;
                        final String str = qx12.c;
                        if (str.equals("")) {
                            return;
                        }
                        C7123kt2 c7123kt2 = qx12.a;
                        C5869hE2 b2 = AbstractC3082Xs2.b(c7123kt2);
                        final String str2 = qx12.b;
                        final RD1 b3 = b2.b(new CV0() { // from class: Ss2
                            @Override // defpackage.CV0
                            public final Object apply(Object obj) {
                                E4 e4 = (E4) obj;
                                F2 f2 = F2.m;
                                e4.getClass();
                                String str3 = str2;
                                str3.getClass();
                                OL1 ol1 = e4.j;
                                if (ol1.containsKey(str3)) {
                                    f2 = (F2) ol1.get(str3);
                                }
                                PX0 px0 = PX0.NEW_BUILDER;
                                JX0 jx0 = (JX0) f2.l(px0);
                                jx0.m(f2);
                                E2 e2 = (E2) jx0;
                                List unmodifiableList = Collections.unmodifiableList(((F2) e2.g).k);
                                String str4 = str;
                                if (!unmodifiableList.contains(str4)) {
                                    e2.o(str4);
                                }
                                JX0 jx02 = (JX0) e4.l(px0);
                                jx02.m(e4);
                                D4 d4 = (D4) jx02;
                                if (e2.h) {
                                    e2.l();
                                    e2.h = false;
                                }
                                F2 f22 = (F2) e2.g;
                                f22.getClass();
                                str4.getClass();
                                f22.j |= 1;
                                f22.l = str4;
                                d4.o((F2) e2.j(), str3);
                                return (E4) d4.j();
                            }
                        }, c7123kt2.a());
                        b3.f(new Runnable() { // from class: KX1
                            @Override // java.lang.Runnable
                            public final void run() {
                                RD1 rd1 = b3;
                                QX1 qx13 = QX1.this;
                                qx13.getClass();
                                try {
                                    rd1.isDone();
                                    AbstractC7515m14.a(rd1);
                                } catch (Exception e) {
                                    Log.w("MobStoreFlagStore", "Failed to store account on flag read for: " + qx13.b + " which may lead to stale flags.", e);
                                }
                            }
                        }, c7123kt2.a());
                    }
                });
                return C3954bg3.b(c4641dg3);
            } catch (Throwable th) {
                if (a != null) {
                    try {
                        a.close();
                    } catch (Throwable unused2) {
                    }
                }
                throw th;
            }
        }
    });
    public final C5327fg2 e = new C5327fg2();
    public final boolean f;
    public final boolean g;

    public abstract RD1 a();

    public abstract void b();

    /* JADX WARN: Type inference failed for: r2v1, types: [IP0] */
    public MP0(C7123kt2 c7123kt2, String str, String str2, boolean z, boolean z2, Set set) {
        this.a = c7123kt2;
        this.b = str;
        this.c = str2;
        this.f = z;
        this.g = z2;
    }
}
