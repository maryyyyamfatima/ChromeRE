package defpackage;

import android.os.Looper;
import android.util.SparseArray;
import java.util.concurrent.Executor;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: pI */
/* loaded from: classes.dex */
public final class C8635pI implements InterfaceC7948nI {
    public static final SparseArray q;
    public final int b;
    public final Vr4 c;
    public final SM3 d;
    public final C10020tK3 e;
    public final Executor f;
    public final String g;
    public int h = -1;
    public boolean i = false;
    public String j = null;
    public final long k;
    public long l;
    public long m;
    public long n;
    public long o;
    public long p;

    @Override // defpackage.InterfaceC9173qr2
    public final void b() {
    }

    @Override // defpackage.InterfaceC9173qr2
    public final void c() {
    }

    @Override // defpackage.InterfaceC9173qr2
    public final void d() {
    }

    @Override // defpackage.InterfaceC9173qr2
    public final void f() {
    }

    @Override // defpackage.InterfaceC9173qr2
    public final void h() {
    }

    static {
        SparseArray sparseArray = new SparseArray();
        q = sparseArray;
        sparseArray.put(16, PM3.g);
        sparseArray.put(6, PM3.h);
    }

    public C8635pI(int i, String str, Vr4 vr4, SM3 sm3, Executor executor) {
        this.b = i;
        this.c = vr4;
        this.f = executor;
        this.d = sm3;
        this.k = vr4.a();
        this.e = new C10020tK3(Thread.currentThread().getId(), Looper.getMainLooper().getThread() == Thread.currentThread());
        this.g = str;
    }

    @Override // defpackage.InterfaceC9173qr2
    public final void g(String str, String str2) {
        if ("CellLogId".equals(str)) {
            try {
                this.h = Integer.parseInt(str2);
            } catch (NumberFormatException unused) {
                this.h = -1;
            }
        } else if ("CELL_NODE_ID".equals(str)) {
            this.j = str2;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.InterfaceC9173qr2
    public final void e(String str) {
        char c;
        if (this.b != 16) {
            return;
        }
        switch (str.hashCode()) {
            case -2086025552:
                if (str.equals("start_create_layout")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -935948671:
                if (str.equals("start_measure")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 749650793:
                if (str.equals("end_create_layout")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1694616058:
                if (str.equals("end_measure")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        Vr4 vr4 = this.c;
        if (c == 0) {
            this.o = vr4.a();
            this.p = -1L;
        } else if (c == 1) {
            this.m = vr4.a();
            this.n = -1L;
        } else if (c == 2) {
            this.p = vr4.a();
        } else {
            if (c != 3) {
                return;
            }
            this.n = vr4.a();
        }
    }

    @Override // defpackage.InterfaceC7948nI
    public final void flush() {
        this.l = this.c.a();
        this.f.execute(new Runnable() { // from class: oI
            @Override // java.lang.Runnable
            public final void run() {
                C8635pI c8635pI = C8635pI.this;
                if (c8635pI.i) {
                    return;
                }
                SparseArray sparseArray = C8635pI.q;
                int i = c8635pI.b;
                c8635pI.i(sparseArray.get(i) == null ? "Unknown" : ((PM3) sparseArray.get(i)).a, c8635pI.k, c8635pI.l);
                long j = c8635pI.o;
                if (j > 0) {
                    long j2 = c8635pI.p;
                    if (j2 > 0) {
                        c8635pI.i("FirstRootMaterialization", j, j2);
                    }
                }
                long j3 = c8635pI.m;
                if (j3 > 0) {
                    long j4 = c8635pI.n;
                    if (j4 > 0) {
                        c8635pI.i("FirstRootMeasurement", j3, j4);
                    }
                }
            }
        });
    }

    @Override // defpackage.InterfaceC7948nI
    public final void cancel() {
        this.i = true;
    }

    @Override // defpackage.InterfaceC7948nI
    public final boolean a() {
        return !this.i;
    }

    public final void i(String str, long j, long j2) {
        byte b = (byte) (0 | 1);
        C10020tK3 c10020tK3 = this.e;
        int i = AbstractC1472Li1.h;
        UL2 ul2 = UL2.o;
        if (ul2 != null) {
            String str2 = this.j;
            if (str2 == null) {
                str2 = null;
            }
            if (str == null) {
                throw new NullPointerException("Null name");
            }
            Long valueOf = Long.valueOf(j);
            Long valueOf2 = Long.valueOf(j2);
            if (b == 1) {
                C1240Jo c1240Jo = new C1240Jo(str, valueOf, valueOf2, null, null, new C1500Lo(ul2, c10020tK3, str2, null, null, null, null, null, null, 1));
                int i2 = this.h;
                String str3 = this.g;
                SM3 sm3 = this.d;
                if (i2 > 0) {
                    sm3.e(0, str3, i2, c1240Jo);
                    return;
                } else {
                    sm3.a(0, str3, c1240Jo);
                    return;
                }
            }
            StringBuilder sb = new StringBuilder();
            if ((b & 1) == 0) {
                sb.append(" materializationCount");
            }
            throw new IllegalStateException("Missing required properties:".concat(String.valueOf(sb)));
        }
        throw new NullPointerException("Null templateUris");
    }
}
