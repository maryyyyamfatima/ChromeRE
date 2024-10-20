package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class B22 implements InterfaceC10960w40 {
    public final C8563p43 a;
    public final C2038Pr3 b;
    public final C5364fm3 c;
    public final /* synthetic */ D22 d;

    public B22(D22 d22, C8563p43 c8563p43, C2038Pr3 c2038Pr3, C5364fm3 c5364fm3) {
        this.d = d22;
        this.a = c8563p43;
        this.b = c2038Pr3;
        this.c = c5364fm3;
    }

    @Override // defpackage.InterfaceC10960w40
    public final void a(C4259ca1 c4259ca1) {
        if (this.b.a(c4259ca1)) {
            try {
                byte[] bArr = c4259ca1.b;
                XF0 d = XF0.d();
                C8906q43 c8906q43 = C8906q43.j;
                int length = bArr.length;
                C8906q43 c8906q432 = new C8906q43();
                try {
                    try {
                        C7931nE2 c7931nE2 = C7931nE2.c;
                        c7931nE2.getClass();
                        QW2 b = c7931nE2.b(c8906q432.getClass());
                        b.f(c8906q432, bArr, 0, length + 0, new C2254Rj(d));
                        b.b(c8906q432);
                        if (c8906q432.a != 0) {
                            throw new RuntimeException();
                        }
                        QX0.i(c8906q432);
                    } catch (IOException e) {
                        if (!(e.getCause() instanceof C1127Ir1)) {
                            throw new C1127Ir1(e);
                        }
                        throw ((C1127Ir1) e.getCause());
                    } catch (IndexOutOfBoundsException unused) {
                        throw C1127Ir1.h();
                    }
                } catch (C1127Ir1 e2) {
                    if (!e2.g) {
                        throw e2;
                    }
                    throw new C1127Ir1(e2);
                } catch (C6827k14 e3) {
                    throw e3.a();
                }
            } catch (C1127Ir1 e4) {
                Log.e("SurveyRecordEventHttpRequest", "Parsing SurveyRecordEventResponse failed!", e4);
            }
        }
        D22 d22 = this.d;
        C8563p43 c8563p43 = this.a;
        C5364fm3 c5364fm3 = this.c;
        d22.getClass();
        int i = AbstractC3208Yr3.b;
        Context context = d22.a;
        String str = TextUtils.isEmpty(d22.c) ? null : d22.c;
        if (OP0.c(C10747vT.a(OP0.b))) {
            L64 l64 = (L64) M64.l.j();
            C2033Pq3 c2033Pq3 = c8563p43.j;
            if (c2033Pq3 != null) {
                if (c2033Pq3 == null) {
                    c2033Pq3 = C2033Pq3.m;
                }
                C10284u54 c10284u54 = (C10284u54) N54.m.j();
                C3350Zu0 c3350Zu0 = c2033Pq3.l;
                if (c3350Zu0 != null) {
                    if (c3350Zu0 == null) {
                        c3350Zu0 = C3350Zu0.l;
                    }
                    if (c10284u54.h) {
                        c10284u54.l();
                        c10284u54.h = false;
                    }
                    N54 n54 = (N54) c10284u54.g;
                    n54.getClass();
                    n54.l = c3350Zu0;
                }
                int i2 = c2033Pq3.j;
                int b2 = AbstractC2373Sg3.b(i2 != 0 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? i2 != 6 ? 0 : 5 : 4 : 3 : 2 : 1 : 6);
                if (b2 == 0) {
                    M54 m54 = M54.j;
                    if (c10284u54.h) {
                        c10284u54.l();
                        c10284u54.h = false;
                    }
                    N54 n542 = (N54) c10284u54.g;
                    n542.getClass();
                    n542.k = m54;
                    n542.j = 2;
                } else if (b2 == 1) {
                    C1643Mq3 c1643Mq3 = c2033Pq3.j == 3 ? (C1643Mq3) c2033Pq3.k : C1643Mq3.l;
                    J54 j54 = (J54) K54.l.j();
                    C3676ar3 c3676ar3 = c1643Mq3.j;
                    if (c3676ar3 != null) {
                        if (c3676ar3 == null) {
                            c3676ar3 = C3676ar3.l;
                        }
                        C7889n64 c7889n64 = (C7889n64) C8919q64.l.j();
                        String str2 = c3676ar3.k;
                        if (c7889n64.h) {
                            c7889n64.l();
                            c7889n64.h = false;
                        }
                        C8919q64 c8919q64 = (C8919q64) c7889n64.g;
                        c8919q64.getClass();
                        str2.getClass();
                        c8919q64.k = str2;
                        if (c3676ar3.j != null) {
                            C8233o64 c8233o64 = (C8233o64) C8576p64.k.j();
                            C3333Zq3 c3333Zq3 = c3676ar3.j;
                            if (c3333Zq3 == null) {
                                c3333Zq3 = C3333Zq3.l;
                            }
                            InterfaceC1377Kp1 interfaceC1377Kp1 = c3333Zq3.k;
                            if (c8233o64.h) {
                                c8233o64.l();
                                c8233o64.h = false;
                            }
                            C8576p64 c8576p64 = (C8576p64) c8233o64.g;
                            InterfaceC1377Kp1 interfaceC1377Kp12 = c8576p64.j;
                            if (!((AbstractC7504m0) interfaceC1377Kp12).a) {
                                c8576p64.j = QX0.r(interfaceC1377Kp12);
                            }
                            List list = c8576p64.j;
                            Charset charset = AbstractC1507Lp1.a;
                            interfaceC1377Kp1.getClass();
                            if (interfaceC1377Kp1 instanceof InterfaceC6812jz1) {
                                List e5 = ((InterfaceC6812jz1) interfaceC1377Kp1).e();
                                InterfaceC6812jz1 interfaceC6812jz1 = (InterfaceC6812jz1) list;
                                int size = list.size();
                                for (Object obj : e5) {
                                    if (obj == null) {
                                        String a = AbstractC9307rF1.a("Element at index ", interfaceC6812jz1.size() - size, " is null.");
                                        int size2 = interfaceC6812jz1.size();
                                        while (true) {
                                            size2--;
                                            if (size2 < size) {
                                                break;
                                            } else {
                                                interfaceC6812jz1.remove(size2);
                                            }
                                        }
                                        throw new NullPointerException(a);
                                    }
                                    int i3 = size;
                                    if (obj instanceof AbstractC4147cE) {
                                        interfaceC6812jz1.h((AbstractC4147cE) obj);
                                    } else {
                                        interfaceC6812jz1.add((String) obj);
                                    }
                                    size = i3;
                                }
                            } else if (interfaceC1377Kp1 instanceof InterfaceC2337Rz2) {
                                list.addAll(interfaceC1377Kp1);
                            } else {
                                if (list instanceof ArrayList) {
                                    ((ArrayList) list).ensureCapacity(interfaceC1377Kp1.size() + list.size());
                                }
                                int size3 = list.size();
                                for (Object obj2 : interfaceC1377Kp1) {
                                    if (obj2 == null) {
                                        String a2 = AbstractC9307rF1.a("Element at index ", list.size() - size3, " is null.");
                                        int size4 = list.size();
                                        while (true) {
                                            size4--;
                                            if (size4 < size3) {
                                                break;
                                            } else {
                                                list.remove(size4);
                                            }
                                        }
                                        throw new NullPointerException(a2);
                                    }
                                    list.add(obj2);
                                }
                            }
                            if (c7889n64.h) {
                                c7889n64.l();
                                c7889n64.h = false;
                            }
                            C8919q64 c8919q642 = (C8919q64) c7889n64.g;
                            C8576p64 c8576p642 = (C8576p64) c8233o64.j();
                            c8919q642.getClass();
                            c8576p642.getClass();
                            c8919q642.j = c8576p642;
                        }
                        if (j54.h) {
                            j54.l();
                            j54.h = false;
                        }
                        K54 k54 = (K54) j54.g;
                        C8919q64 c8919q643 = (C8919q64) c7889n64.j();
                        k54.getClass();
                        c8919q643.getClass();
                        k54.j = c8919q643;
                    }
                    C7112kr3 c7112kr3 = c1643Mq3.k;
                    if (c7112kr3 != null) {
                        if (c7112kr3 == null) {
                            c7112kr3 = C7112kr3.k;
                        }
                        C10633v64 c10633v64 = (C10633v64) G64.k.j();
                        C6768jr3 c6768jr3 = c7112kr3.j;
                        if (c6768jr3 != null) {
                            if (c6768jr3 == null) {
                                c6768jr3 = C6768jr3.k;
                            }
                            C10976w64 c10976w64 = (C10976w64) F64.k.j();
                            C6425ir3 c6425ir3 = c6768jr3.j;
                            if (c6425ir3 != null) {
                                if (c6425ir3 == null) {
                                    c6425ir3 = C6425ir3.l;
                                }
                                C11319x64 c11319x64 = (C11319x64) E64.l.j();
                                C6082hr3 c6082hr3 = c6425ir3.j;
                                if (c6082hr3 != null) {
                                    if (c6082hr3 == null) {
                                        c6082hr3 = C6082hr3.o;
                                    }
                                    C64 c64 = (C64) D64.o.j();
                                    String str3 = c6082hr3.j;
                                    if (c64.h) {
                                        c64.l();
                                        c64.h = false;
                                    }
                                    D64 d64 = (D64) c64.g;
                                    d64.getClass();
                                    str3.getClass();
                                    d64.j = str3;
                                    String str4 = c6082hr3.k;
                                    if (c64.h) {
                                        c64.l();
                                        c64.h = false;
                                    }
                                    D64 d642 = (D64) c64.g;
                                    d642.getClass();
                                    str4.getClass();
                                    d642.k = str4;
                                    String str5 = c6082hr3.l;
                                    if (c64.h) {
                                        c64.l();
                                        c64.h = false;
                                    }
                                    D64 d643 = (D64) c64.g;
                                    d643.getClass();
                                    str5.getClass();
                                    d643.l = str5;
                                    String str6 = c6082hr3.m;
                                    if (c64.h) {
                                        c64.l();
                                        c64.h = false;
                                    }
                                    D64 d644 = (D64) c64.g;
                                    d644.getClass();
                                    str6.getClass();
                                    d644.m = str6;
                                    String str7 = c6082hr3.n;
                                    if (c64.h) {
                                        c64.l();
                                        c64.h = false;
                                    }
                                    D64 d645 = (D64) c64.g;
                                    d645.getClass();
                                    str7.getClass();
                                    d645.n = str7;
                                    D64 d646 = (D64) c64.j();
                                    if (c11319x64.h) {
                                        c11319x64.l();
                                        c11319x64.h = false;
                                    }
                                    E64 e64 = (E64) c11319x64.g;
                                    e64.getClass();
                                    d646.getClass();
                                    e64.j = d646;
                                }
                                C5738gr3 c5738gr3 = c6425ir3.k;
                                if (c5738gr3 != null) {
                                    if (c5738gr3 == null) {
                                        c5738gr3 = C5738gr3.k;
                                    }
                                    C11662y64 c11662y64 = (C11662y64) B64.k.j();
                                    if (c5738gr3.j.size() > 0) {
                                        for (C5394fr3 c5394fr3 : c5738gr3.j) {
                                            C12005z64 c12005z64 = (C12005z64) A64.l.j();
                                            String str8 = c5394fr3.j;
                                            if (c12005z64.h) {
                                                c12005z64.l();
                                                c12005z64.h = false;
                                            }
                                            A64 a64 = (A64) c12005z64.g;
                                            a64.getClass();
                                            str8.getClass();
                                            a64.j = str8;
                                            String str9 = c5394fr3.k;
                                            if (c12005z64.h) {
                                                c12005z64.l();
                                                c12005z64.h = false;
                                            }
                                            A64 a642 = (A64) c12005z64.g;
                                            a642.getClass();
                                            str9.getClass();
                                            a642.k = str9;
                                            A64 a643 = (A64) c12005z64.j();
                                            if (c11662y64.h) {
                                                c11662y64.l();
                                                c11662y64.h = false;
                                            }
                                            B64 b64 = (B64) c11662y64.g;
                                            b64.getClass();
                                            a643.getClass();
                                            InterfaceC1377Kp1 interfaceC1377Kp13 = b64.j;
                                            if (!((AbstractC7504m0) interfaceC1377Kp13).a) {
                                                b64.j = QX0.r(interfaceC1377Kp13);
                                            }
                                            b64.j.add(a643);
                                        }
                                    }
                                    if (c11319x64.h) {
                                        c11319x64.l();
                                        c11319x64.h = false;
                                    }
                                    E64 e642 = (E64) c11319x64.g;
                                    B64 b642 = (B64) c11662y64.j();
                                    e642.getClass();
                                    b642.getClass();
                                    e642.k = b642;
                                }
                                if (c10976w64.h) {
                                    c10976w64.l();
                                    c10976w64.h = false;
                                }
                                F64 f64 = (F64) c10976w64.g;
                                E64 e643 = (E64) c11319x64.j();
                                f64.getClass();
                                e643.getClass();
                                f64.j = e643;
                            }
                            if (c10633v64.h) {
                                c10633v64.l();
                                c10633v64.h = false;
                            }
                            G64 g64 = (G64) c10633v64.g;
                            F64 f642 = (F64) c10976w64.j();
                            g64.getClass();
                            f642.getClass();
                            g64.j = f642;
                        }
                        if (j54.h) {
                            j54.l();
                            j54.h = false;
                        }
                        K54 k542 = (K54) j54.g;
                        G64 g642 = (G64) c10633v64.j();
                        k542.getClass();
                        g642.getClass();
                        k542.k = g642;
                    }
                    if (c10284u54.h) {
                        c10284u54.l();
                        c10284u54.h = false;
                    }
                    N54 n543 = (N54) c10284u54.g;
                    K54 k543 = (K54) j54.j();
                    n543.getClass();
                    k543.getClass();
                    n543.k = k543;
                    n543.j = 3;
                } else if (b2 == 2) {
                    C10627v54 c10627v54 = (C10627v54) C10970w54.k.j();
                    boolean z = (c2033Pq3.j == 4 ? (C11568xq3) c2033Pq3.k : C11568xq3.k).j;
                    if (c10627v54.h) {
                        c10627v54.l();
                        c10627v54.h = false;
                    }
                    ((C10970w54) c10627v54.g).j = z;
                    if (c10284u54.h) {
                        c10284u54.l();
                        c10284u54.h = false;
                    }
                    N54 n544 = (N54) c10284u54.g;
                    C10970w54 c10970w54 = (C10970w54) c10627v54.j();
                    n544.getClass();
                    c10970w54.getClass();
                    n544.k = c10970w54;
                    n544.j = 4;
                } else if (b2 == 3) {
                    C1384Kq3 c1384Kq3 = c2033Pq3.j == 5 ? (C1384Kq3) c2033Pq3.k : C1384Kq3.m;
                    C11313x54 c11313x54 = (C11313x54) I54.m.j();
                    int i4 = c1384Kq3.l;
                    if (c11313x54.h) {
                        c11313x54.l();
                        c11313x54.h = false;
                    }
                    ((I54) c11313x54.g).l = i4;
                    int i5 = c1384Kq3.j;
                    int b3 = AbstractC2373Sg3.b(i5 != 0 ? i5 != 2 ? i5 != 3 ? i5 != 4 ? i5 != 5 ? 0 : 4 : 3 : 2 : 1 : 5);
                    if (b3 == 0) {
                        C1254Jq3 c1254Jq3 = c1384Kq3.j == 2 ? (C1254Jq3) c1384Kq3.k : C1254Jq3.k;
                        G54 g54 = (G54) H54.k.j();
                        C0994Hq3 c0994Hq3 = c1254Jq3.j;
                        if (c0994Hq3 != null) {
                            if (c0994Hq3 == null) {
                                c0994Hq3 = C0994Hq3.m;
                            }
                            F54 b4 = AbstractC5275fX1.b(c0994Hq3);
                            if (g54.h) {
                                g54.l();
                                g54.h = false;
                            }
                            H54 h54 = (H54) g54.g;
                            h54.getClass();
                            b4.getClass();
                            h54.j = b4;
                        }
                        if (c11313x54.h) {
                            c11313x54.l();
                            c11313x54.h = false;
                        }
                        I54 i54 = (I54) c11313x54.g;
                        H54 h542 = (H54) g54.j();
                        i54.getClass();
                        h542.getClass();
                        i54.k = h542;
                        i54.j = 2;
                    } else if (b3 == 1) {
                        C0084Aq3 c0084Aq3 = c1384Kq3.j == 3 ? (C0084Aq3) c1384Kq3.k : C0084Aq3.k;
                        C11656y54 c11656y54 = (C11656y54) C11999z54.k.j();
                        if (c0084Aq3.j.size() > 0) {
                            Iterator it = c0084Aq3.j.iterator();
                            while (it.hasNext()) {
                                F54 b5 = AbstractC5275fX1.b((C0994Hq3) it.next());
                                if (c11656y54.h) {
                                    c11656y54.l();
                                    c11656y54.h = false;
                                }
                                C11999z54 c11999z54 = (C11999z54) c11656y54.g;
                                c11999z54.getClass();
                                b5.getClass();
                                InterfaceC1377Kp1 interfaceC1377Kp14 = c11999z54.j;
                                if (!((AbstractC7504m0) interfaceC1377Kp14).a) {
                                    c11999z54.j = QX0.r(interfaceC1377Kp14);
                                }
                                c11999z54.j.add(b5);
                            }
                        }
                        if (c11313x54.h) {
                            c11313x54.l();
                            c11313x54.h = false;
                        }
                        I54 i542 = (I54) c11313x54.g;
                        C11999z54 c11999z542 = (C11999z54) c11656y54.j();
                        i542.getClass();
                        c11999z542.getClass();
                        i542.k = c11999z542;
                        i542.j = 3;
                    } else if (b3 == 2) {
                        C0604Eq3 c0604Eq3 = c1384Kq3.j == 4 ? (C0604Eq3) c1384Kq3.k : C0604Eq3.k;
                        C54 c54 = (C54) D54.k.j();
                        C0994Hq3 c0994Hq32 = c0604Eq3.j;
                        if (c0994Hq32 != null) {
                            if (c0994Hq32 == null) {
                                c0994Hq32 = C0994Hq3.m;
                            }
                            F54 b6 = AbstractC5275fX1.b(c0994Hq32);
                            if (c54.h) {
                                c54.l();
                                c54.h = false;
                            }
                            D54 d54 = (D54) c54.g;
                            d54.getClass();
                            b6.getClass();
                            d54.j = b6;
                        }
                        if (c11313x54.h) {
                            c11313x54.l();
                            c11313x54.h = false;
                        }
                        I54 i543 = (I54) c11313x54.g;
                        D54 d542 = (D54) c54.j();
                        i543.getClass();
                        d542.getClass();
                        i543.k = d542;
                        i543.j = 4;
                    } else if (b3 == 3) {
                        A54 a54 = (A54) B54.k.j();
                        String str10 = (c1384Kq3.j == 5 ? (C0344Cq3) c1384Kq3.k : C0344Cq3.k).j;
                        if (a54.h) {
                            a54.l();
                            a54.h = false;
                        }
                        B54 b54 = (B54) a54.g;
                        b54.getClass();
                        str10.getClass();
                        b54.j = str10;
                        if (c11313x54.h) {
                            c11313x54.l();
                            c11313x54.h = false;
                        }
                        I54 i544 = (I54) c11313x54.g;
                        B54 b542 = (B54) a54.j();
                        i544.getClass();
                        b542.getClass();
                        i544.k = b542;
                        i544.j = 5;
                    }
                    if (c10284u54.h) {
                        c10284u54.l();
                        c10284u54.h = false;
                    }
                    N54 n545 = (N54) c10284u54.g;
                    I54 i545 = (I54) c11313x54.j();
                    n545.getClass();
                    i545.getClass();
                    n545.k = i545;
                    n545.j = 5;
                } else if (b2 == 4) {
                    L54 l54 = L54.j;
                    if (c10284u54.h) {
                        c10284u54.l();
                        c10284u54.h = false;
                    }
                    N54 n546 = (N54) c10284u54.g;
                    n546.getClass();
                    n546.k = l54;
                    n546.j = 6;
                }
                if (l64.h) {
                    l64.l();
                    l64.h = false;
                }
                M64 m64 = (M64) l64.g;
                N54 n547 = (N54) c10284u54.j();
                m64.getClass();
                n547.getClass();
                m64.j = n547;
            }
            if (c8563p43.k != null) {
                H64 h64 = (H64) I64.l.j();
                C7456lr3 c7456lr3 = c8563p43.k;
                if (c7456lr3 == null) {
                    c7456lr3 = C7456lr3.l;
                }
                String str11 = c7456lr3.j;
                if (h64.h) {
                    h64.l();
                    h64.h = false;
                }
                I64 i64 = (I64) h64.g;
                i64.getClass();
                str11.getClass();
                i64.j = str11;
                C7456lr3 c7456lr32 = c8563p43.k;
                if (c7456lr32 == null) {
                    c7456lr32 = C7456lr3.l;
                }
                AbstractC4147cE abstractC4147cE = c7456lr32.k;
                if (h64.h) {
                    h64.l();
                    h64.h = false;
                }
                I64 i642 = (I64) h64.g;
                i642.getClass();
                abstractC4147cE.getClass();
                i642.k = abstractC4147cE;
                I64 i643 = (I64) h64.j();
                if (l64.h) {
                    l64.l();
                    l64.h = false;
                }
                M64 m642 = (M64) l64.g;
                m642.getClass();
                i643.getClass();
                m642.k = i643;
            }
            C4931eX1 a3 = C4931eX1.a();
            O54 o54 = (O54) P54.n.j();
            if (o54.h) {
                o54.l();
                o54.h = false;
            }
            P54 p54 = (P54) o54.g;
            M64 m643 = (M64) l64.j();
            p54.getClass();
            m643.getClass();
            p54.k = m643;
            p54.j = 3;
            N64 n64 = N64.j;
            if (o54.h) {
                o54.l();
                o54.h = false;
            }
            P54 p542 = (P54) o54.g;
            p542.getClass();
            p542.m = n64;
            p542.l = 5;
            a3.c((P54) o54.j(), c5364fm3.b(), c5364fm3.a(), context, str);
        }
    }
}
