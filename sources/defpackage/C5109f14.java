package defpackage;

import com.google.android.libraries.elements.interfaces.DebuggerClient;
import io.grpc.Status;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: f14 */
/* loaded from: classes.dex */
public final class C5109f14 {
    public final byte[] a;
    public final byte[] b;
    public final String c;
    public final /* synthetic */ C5453g14 d;

    public C5109f14(C5453g14 c5453g14, byte[] bArr, UF0 uf0, String str) {
        byte[] bArr2;
        this.d = c5453g14;
        this.a = bArr;
        if (uf0 == null) {
            bArr2 = AbstractC8868py0.a;
        } else {
            TF0 tf0 = new TF0();
            int i = 0;
            while (true) {
                if (i < uf0.i()) {
                    uf0.h(tf0, i);
                    if (tf0.j() == 224886694) {
                        byte[] bArr3 = new byte[tf0.i()];
                        tf0.f(6).get(bArr3);
                        bArr2 = bArr3;
                        break;
                    }
                    i++;
                } else {
                    bArr2 = AbstractC8868py0.a;
                    break;
                }
            }
        }
        this.b = bArr2;
        this.c = str;
    }

    public final void a(Status status, C4765e14 c4765e14, InterfaceC12058zG3 interfaceC12058zG3, U80 u80, StringBuilder sb, C4883eN3 c4883eN3, C5427fx0 c5427fx0) {
        if (status.b()) {
            StringBuilder sb2 = ((C3184Yn) u80).l;
            if (sb2 != null) {
                sb2.append((CharSequence) sb);
                sb2.append('|');
            }
            if (c4765e14 != null) {
                long j = c4765e14.a;
                if (j > 0) {
                    interfaceC12058zG3.h(j);
                }
                String str = c4765e14.b;
                if (str != null) {
                    interfaceC12058zG3.b(str);
                }
            }
        }
        if (c4883eN3 != null) {
            C3184Yn c3184Yn = (C3184Yn) u80;
            if (c3184Yn.s != null) {
                C6259iN3 c6259iN3 = (C6259iN3) C6601jN3.n.j();
                if (c6259iN3.h) {
                    c6259iN3.l();
                    c6259iN3.h = false;
                }
                C6601jN3 c6601jN3 = (C6601jN3) c6259iN3.g;
                c6601jN3.getClass();
                c6601jN3.k = c4883eN3;
                c6601jN3.j |= 1;
                C3235Yx0 b = AbstractC12203zi0.b(c5427fx0, null, null, c3184Yn.s);
                if (b != null) {
                    if (c6259iN3.h) {
                        c6259iN3.l();
                        c6259iN3.h = false;
                    }
                    C6601jN3 c6601jN32 = (C6601jN3) c6259iN3.g;
                    c6601jN32.getClass();
                    c6601jN32.l = b;
                    c6601jN32.j |= 2;
                }
                DebuggerClient debuggerClient = (DebuggerClient) this.d.d.get();
                C7633mN3 c7633mN3 = (C7633mN3) C7977nN3.p.j();
                C11064wN3 d = AbstractC12203zi0.d();
                if (c7633mN3.h) {
                    c7633mN3.l();
                    c7633mN3.h = false;
                }
                C7977nN3 c7977nN3 = (C7977nN3) c7633mN3.g;
                c7977nN3.getClass();
                d.getClass();
                c7977nN3.m = d;
                c7977nN3.j |= 1;
                if (c7633mN3.h) {
                    c7633mN3.l();
                    c7633mN3.h = false;
                }
                C7977nN3 c7977nN32 = (C7977nN3) c7633mN3.g;
                C6601jN3 c6601jN33 = (C6601jN3) c6259iN3.j();
                c7977nN32.getClass();
                c6601jN33.getClass();
                c7977nN32.l = c6601jN33;
                c7977nN32.k = 3;
                debuggerClient.sendTimelineEvent(((C7977nN3) c7633mN3.j()).toByteArray());
            }
        }
    }

    public final void b(C4883eN3 c4883eN3) {
        if (c4883eN3 != null) {
            C6945kN3 c6945kN3 = (C6945kN3) C7289lN3.m.j();
            if (c6945kN3.h) {
                c6945kN3.l();
                c6945kN3.h = false;
            }
            C7289lN3 c7289lN3 = (C7289lN3) c6945kN3.g;
            c7289lN3.getClass();
            c7289lN3.k = c4883eN3;
            c7289lN3.j |= 1;
            String b = C5453g14.b(this.a);
            if (c6945kN3.h) {
                c6945kN3.l();
                c6945kN3.h = false;
            }
            C7289lN3 c7289lN32 = (C7289lN3) c6945kN3.g;
            c7289lN32.getClass();
            b.getClass();
            c7289lN32.j |= 2;
            c7289lN32.l = b;
            C7289lN3 c7289lN33 = (C7289lN3) c6945kN3.j();
            DebuggerClient debuggerClient = (DebuggerClient) this.d.d.get();
            C7633mN3 c7633mN3 = (C7633mN3) C7977nN3.p.j();
            C11064wN3 d = AbstractC12203zi0.d();
            if (c7633mN3.h) {
                c7633mN3.l();
                c7633mN3.h = false;
            }
            C7977nN3 c7977nN3 = (C7977nN3) c7633mN3.g;
            c7977nN3.getClass();
            d.getClass();
            c7977nN3.m = d;
            c7977nN3.j |= 1;
            if (c7633mN3.h) {
                c7633mN3.l();
                c7633mN3.h = false;
            }
            C7977nN3 c7977nN32 = (C7977nN3) c7633mN3.g;
            c7977nN32.getClass();
            c7289lN33.getClass();
            c7977nN32.l = c7289lN33;
            c7977nN32.k = 2;
            debuggerClient.sendTimelineEvent(((C7977nN3) c7633mN3.j()).toByteArray());
        }
    }
}
