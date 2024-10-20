package defpackage;

import android.net.Uri;
import com.google.common.util.concurrent.v;
import com.google.protobuf.MessageLite;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Xc3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3003Xc3 implements InterfaceC9175qr4 {
    public final String a;
    public final RD1 b;
    public final AbstractC7587mE2 c;
    public final X33 d;
    public final C3694au3 e;
    public final AbstractC7720me1 f;
    public final AbstractC10997wA1 g;
    public final Object h = new Object();
    public final C8273oE0 i = new C8273oE0();
    public RD1 j = null;

    public C3003Xc3(String str, C9803si1 c9803si1, C12238zo c12238zo, Executor executor, C3694au3 c3694au3, AbstractC7720me1 abstractC7720me1, AbstractC10997wA1 abstractC10997wA1) {
        this.a = str;
        this.b = AbstractC5957hW0.d(c9803si1);
        this.c = c12238zo;
        this.d = new X33(executor);
        this.e = c3694au3;
        this.f = abstractC7720me1;
        this.g = abstractC10997wA1;
    }

    public final RD1 a() {
        RD1 rd1;
        synchronized (this.h) {
            RD1 rd12 = this.j;
            if (rd12 != null && rd12.isDone()) {
                try {
                    AbstractC5957hW0.b(this.j);
                } catch (ExecutionException unused) {
                    this.j = null;
                }
            }
            if (this.j == null) {
                this.j = AbstractC5957hW0.d(this.i.a(AbstractC4575dU3.a(new InterfaceC2909Wk() { // from class: Uc3
                    @Override // defpackage.InterfaceC2909Wk
                    public final RD1 call() {
                        final C3003Xc3 c3003Xc3 = C3003Xc3.this;
                        try {
                            return AbstractC5957hW0.c(c3003Xc3.b((Uri) AbstractC5957hW0.b(c3003Xc3.b)));
                        } catch (IOException e) {
                            C2873Wc3 c2873Wc3 = new C2873Wc3(c3003Xc3);
                            if ((e instanceof ZM0) || (e.getCause() instanceof ZM0)) {
                                return new v(e);
                            }
                            return AbstractC5957hW0.e(c3003Xc3.f.a(e, c2873Wc3), AbstractC4575dU3.b(new InterfaceC3299Zk() { // from class: Nc3
                                @Override // defpackage.InterfaceC3299Zk
                                public final RD1 apply(Object obj) {
                                    C3003Xc3 c3003Xc32 = C3003Xc3.this;
                                    return AbstractC5957hW0.c(c3003Xc32.b((Uri) AbstractC5957hW0.b(c3003Xc32.b)));
                                }
                            }), c3003Xc3.d);
                        }
                    }
                }), this.d));
            }
            rd1 = this.j;
        }
        return rd1;
    }

    public final MessageLite b(Uri uri) {
        AbstractC7587mE2 abstractC7587mE2 = this.c;
        C3694au3 c3694au3 = this.e;
        try {
            try {
                RunnableC9793sg3 a = this.g.a("Read " + this.a);
                try {
                    InputStream a2 = EH2.a(c3694au3.a(uri));
                    try {
                        abstractC7587mE2.getClass();
                        C12238zo c12238zo = (C12238zo) abstractC7587mE2;
                        MessageLite b = ((KX0) c12238zo.a.h()).b(a2, c12238zo.b);
                        if (a2 != null) {
                            a2.close();
                        }
                        if (a != null) {
                            a.close();
                        }
                        return b;
                    } catch (Throwable th) {
                        if (a2 != null) {
                            try {
                                a2.close();
                            } catch (Throwable unused) {
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    if (a != null) {
                        try {
                            a.close();
                        } catch (Throwable unused2) {
                        }
                    }
                    throw th2;
                }
            } catch (FileNotFoundException e) {
                C1837Od2 a3 = c3694au3.a(uri);
                if (!a3.a.b(a3.d)) {
                    return ((C12238zo) abstractC7587mE2).a;
                }
                throw e;
            }
        } catch (IOException e2) {
            throw AbstractC9341rM0.a(c3694au3, uri, e2);
        }
    }

    public final void c(Uri uri, Object obj) {
        C3694au3 c3694au3 = this.e;
        Uri a = T24.a(uri, ".tmp");
        try {
            RunnableC9793sg3 a2 = this.g.a("Write " + this.a);
            try {
                C4381cu3 c4381cu3 = new C4381cu3();
                try {
                    C1837Od2 a3 = c3694au3.a(a);
                    ArrayList a4 = a3.a(a3.a.d(a3.d));
                    new C4381cu3[]{c4381cu3}[0].a(a4);
                    OutputStream outputStream = (OutputStream) a4.get(0);
                    try {
                        this.c.getClass();
                        ((MessageLite) obj).a(outputStream);
                        c4381cu3.b();
                        if (outputStream != null) {
                            outputStream.close();
                        }
                        if (a2 != null) {
                            a2.close();
                        }
                        c3694au3.b(a, uri);
                    } catch (Throwable th) {
                        if (outputStream != null) {
                            try {
                                outputStream.close();
                            } catch (Throwable unused) {
                            }
                        }
                        throw th;
                    }
                } catch (IOException e) {
                    throw AbstractC9341rM0.a(c3694au3, uri, e);
                }
            } catch (Throwable th2) {
                if (a2 != null) {
                    try {
                        a2.close();
                    } catch (Throwable unused2) {
                    }
                }
                throw th2;
            }
        } catch (IOException e2) {
            C1837Od2 a5 = c3694au3.a(a);
            if (a5.a.b(a5.d)) {
                try {
                    C1837Od2 a6 = c3694au3.a(a);
                    a6.a.a(a6.d);
                } catch (IOException unused3) {
                }
            }
            throw e2;
        }
    }
}
