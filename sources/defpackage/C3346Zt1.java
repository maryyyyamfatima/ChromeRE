package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;
import java.io.EOFException;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Zt1 */
/* loaded from: classes.dex */
public final class C3346Zt1 extends AbstractC3086Xt1 {
    public static final C3804bE q = C3804bE.a("'\\");
    public static final C3804bE r = C3804bE.a("\"\\");
    public static final C3804bE s = C3804bE.a("{}[]:, \n\t\r\f/\\;#=");
    public final InterfaceC5861hD k;
    public final C5173fD l;
    public int m = 0;
    public long n;
    public int o;
    public String p;

    static {
        C3804bE.a("\n\r");
        C3804bE.a("*/");
    }

    public C3346Zt1(XH2 xh2) {
        this.k = xh2;
        this.l = xh2.g;
        y(6);
    }

    @Override // defpackage.AbstractC3086Xt1
    public final void b() {
        int i = this.m;
        if (i == 0) {
            i = P();
        }
        if (i == 3) {
            y(1);
            this.i[this.a - 1] = 0;
            this.m = 0;
            return;
        }
        throw new C2566Tt1(IR0.a("Expected BEGIN_ARRAY but was ", AbstractC2956Wt1.a(u()), " at path ", h()));
    }

    @Override // defpackage.AbstractC3086Xt1
    public final void e() {
        int i = this.m;
        if (i == 0) {
            i = P();
        }
        if (i == 4) {
            int i2 = this.a - 1;
            this.a = i2;
            int[] iArr = this.i;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.m = 0;
            return;
        }
        throw new C2566Tt1(IR0.a("Expected END_ARRAY but was ", AbstractC2956Wt1.a(u()), " at path ", h()));
    }

    @Override // defpackage.AbstractC3086Xt1
    public final void c() {
        int i = this.m;
        if (i == 0) {
            i = P();
        }
        if (i == 1) {
            y(3);
            this.m = 0;
            return;
        }
        throw new C2566Tt1(IR0.a("Expected BEGIN_OBJECT but was ", AbstractC2956Wt1.a(u()), " at path ", h()));
    }

    @Override // defpackage.AbstractC3086Xt1
    public final void f() {
        int i = this.m;
        if (i == 0) {
            i = P();
        }
        if (i == 2) {
            int i2 = this.a - 1;
            this.a = i2;
            this.h[i2] = null;
            int[] iArr = this.i;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.m = 0;
            return;
        }
        throw new C2566Tt1(IR0.a("Expected END_OBJECT but was ", AbstractC2956Wt1.a(u()), " at path ", h()));
    }

    @Override // defpackage.AbstractC3086Xt1
    public final boolean i() {
        int i = this.m;
        if (i == 0) {
            i = P();
        }
        return (i == 2 || i == 4 || i == 18) ? false : true;
    }

    @Override // defpackage.AbstractC3086Xt1
    public final int u() {
        int i = this.m;
        if (i == 0) {
            i = P();
        }
        switch (i) {
            case 1:
                return 3;
            case 2:
                return 4;
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return 1;
            case 4:
                return 2;
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
            case 9:
            case 10:
            case 11:
                return 6;
            case 12:
            case 13:
            case 14:
            case 15:
                return 5;
            case 16:
            case 17:
                return 7;
            case 18:
                return 10;
            default:
                throw new AssertionError();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01be, code lost:            if (r4 != 7) goto L1151;     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01c0, code lost:            r17.o = r3;        r8 = 17;        r17.m = 17;     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0193, code lost:            if (a0(r1) != false) goto L1151;     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0195, code lost:            if (r4 != 2) goto L1128;     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0197, code lost:            if (r6 == false) goto L1128;     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x019d, code lost:            if (r10 != Long.MIN_VALUE) goto L1121;     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x019f, code lost:            if (r7 == false) goto L1128;     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01a5, code lost:            if (r10 != 0) goto L1124;     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01a7, code lost:            if (r7 != false) goto L1128;     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01a9, code lost:            if (r7 == false) goto L1126;     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01ac, code lost:            r10 = -r10;     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01ad, code lost:            r17.n = r10;        r5.r(r3);        r8 = 16;        r17.m = 16;     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01b8, code lost:            if (r4 == 2) goto L1133;     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01bb, code lost:            if (r4 == 4) goto L1133;     */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0112 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01f8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int P() {
        /*
            Method dump skipped, instructions count: 682
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3346Zt1.P():int");
    }

    public final boolean a0(int i) {
        if (i == 9 || i == 10 || i == 12 || i == 13 || i == 32) {
            return false;
        }
        if (i != 35) {
            if (i == 44) {
                return false;
            }
            if (i != 47 && i != 61) {
                if (i == 123 || i == 125 || i == 58) {
                    return false;
                }
                if (i != 59) {
                    switch (i) {
                        case 91:
                        case 93:
                            return false;
                        case 92:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        O();
        throw null;
    }

    public final String c0() {
        String str;
        int i = this.m;
        if (i == 0) {
            i = P();
        }
        if (i == 14) {
            str = i0();
        } else if (i == 13) {
            str = h0(r);
        } else if (i == 12) {
            str = h0(q);
        } else if (i == 15) {
            str = this.p;
        } else {
            throw new C2566Tt1(IR0.a("Expected a name but was ", AbstractC2956Wt1.a(u()), " at path ", h()));
        }
        this.m = 0;
        this.h[this.a - 1] = str;
        return str;
    }

    @Override // defpackage.AbstractC3086Xt1
    public final int C(C2826Vt1 c2826Vt1) {
        int i = this.m;
        if (i == 0) {
            i = P();
        }
        if (i < 12 || i > 15) {
            return -1;
        }
        if (i == 15) {
            return V(this.p, c2826Vt1);
        }
        int L = this.k.L(c2826Vt1.b);
        if (L != -1) {
            this.m = 0;
            this.h[this.a - 1] = c2826Vt1.a[L];
            return L;
        }
        String str = this.h[this.a - 1];
        String c0 = c0();
        int V = V(c0, c2826Vt1);
        if (V == -1) {
            this.m = 15;
            this.p = c0;
            this.h[this.a - 1] = str;
        }
        return V;
    }

    @Override // defpackage.AbstractC3086Xt1
    public final void F() {
        int i = this.m;
        if (i == 0) {
            i = P();
        }
        if (i == 14) {
            long B0 = this.k.B0(s);
            C5173fD c5173fD = this.l;
            if (B0 == -1) {
                B0 = c5173fD.g;
            }
            c5173fD.r(B0);
        } else if (i == 13) {
            m0(r);
        } else if (i == 12) {
            m0(q);
        } else if (i != 15) {
            throw new C2566Tt1(IR0.a("Expected a name but was ", AbstractC2956Wt1.a(u()), " at path ", h()));
        }
        this.m = 0;
        this.h[this.a - 1] = "null";
    }

    public final int V(String str, C2826Vt1 c2826Vt1) {
        int length = c2826Vt1.a.length;
        for (int i = 0; i < length; i++) {
            if (str.equals(c2826Vt1.a[i])) {
                this.m = 0;
                this.h[this.a - 1] = str;
                return i;
            }
        }
        return -1;
    }

    @Override // defpackage.AbstractC3086Xt1
    public final String s() {
        String k;
        int i = this.m;
        if (i == 0) {
            i = P();
        }
        if (i == 10) {
            k = i0();
        } else if (i == 9) {
            k = h0(r);
        } else if (i == 8) {
            k = h0(q);
        } else if (i == 11) {
            k = this.p;
            this.p = null;
        } else if (i == 16) {
            k = Long.toString(this.n);
        } else if (i == 17) {
            k = this.l.k(this.o);
        } else {
            throw new C2566Tt1(IR0.a("Expected a string but was ", AbstractC2956Wt1.a(u()), " at path ", h()));
        }
        this.m = 0;
        int[] iArr = this.i;
        int i2 = this.a - 1;
        iArr[i2] = iArr[i2] + 1;
        return k;
    }

    @Override // defpackage.AbstractC3086Xt1
    public final boolean j() {
        int i = this.m;
        if (i == 0) {
            i = P();
        }
        if (i == 5) {
            this.m = 0;
            int[] iArr = this.i;
            int i2 = this.a - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        }
        if (i == 6) {
            this.m = 0;
            int[] iArr2 = this.i;
            int i3 = this.a - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return false;
        }
        throw new C2566Tt1(IR0.a("Expected a boolean but was ", AbstractC2956Wt1.a(u()), " at path ", h()));
    }

    @Override // defpackage.AbstractC3086Xt1
    public final double k() {
        int i = this.m;
        if (i == 0) {
            i = P();
        }
        if (i == 16) {
            this.m = 0;
            int[] iArr = this.i;
            int i2 = this.a - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.n;
        }
        if (i == 17) {
            this.p = this.l.k(this.o);
        } else if (i == 9) {
            this.p = h0(r);
        } else if (i == 8) {
            this.p = h0(q);
        } else if (i == 10) {
            this.p = i0();
        } else if (i != 11) {
            throw new C2566Tt1(IR0.a("Expected a double but was ", AbstractC2956Wt1.a(u()), " at path ", h()));
        }
        this.m = 11;
        try {
            double parseDouble = Double.parseDouble(this.p);
            if (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble)) {
                throw new C2696Ut1("JSON forbids NaN and infinities: " + parseDouble + " at path " + h());
            }
            this.p = null;
            this.m = 0;
            int[] iArr2 = this.i;
            int i3 = this.a - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return parseDouble;
        } catch (NumberFormatException unused) {
            throw new C2566Tt1(IR0.a("Expected a double but was ", this.p, " at path ", h()));
        }
    }

    public final String h0(C3804bE c3804bE) {
        StringBuilder sb = null;
        while (true) {
            long B0 = this.k.B0(c3804bE);
            if (B0 == -1) {
                M("Unterminated string");
                throw null;
            }
            C5173fD c5173fD = this.l;
            if (c5173fD.b(B0) != 92) {
                if (sb == null) {
                    String k = c5173fD.k(B0);
                    c5173fD.f();
                    return k;
                }
                sb.append(c5173fD.k(B0));
                c5173fD.f();
                return sb.toString();
            }
            if (sb == null) {
                sb = new StringBuilder();
            }
            sb.append(c5173fD.k(B0));
            c5173fD.f();
            sb.append(k0());
        }
    }

    public final String i0() {
        long B0 = this.k.B0(s);
        C5173fD c5173fD = this.l;
        return B0 != -1 ? c5173fD.k(B0) : c5173fD.j(c5173fD.g, AbstractC3829bJ.a);
    }

    public final void m0(C3804bE c3804bE) {
        while (true) {
            long B0 = this.k.B0(c3804bE);
            if (B0 == -1) {
                M("Unterminated string");
                throw null;
            }
            C5173fD c5173fD = this.l;
            if (c5173fD.b(B0) == 92) {
                c5173fD.r(B0 + 1);
                k0();
            } else {
                c5173fD.r(B0 + 1);
                return;
            }
        }
    }

    @Override // defpackage.AbstractC3086Xt1
    public final int r() {
        String h0;
        int i = this.m;
        if (i == 0) {
            i = P();
        }
        if (i == 16) {
            long j = this.n;
            int i2 = (int) j;
            if (j != i2) {
                throw new C2566Tt1("Expected an int but was " + this.n + " at path " + h());
            }
            this.m = 0;
            int[] iArr = this.i;
            int i3 = this.a - 1;
            iArr[i3] = iArr[i3] + 1;
            return i2;
        }
        if (i == 17) {
            this.p = this.l.k(this.o);
        } else if (i == 9 || i == 8) {
            if (i == 9) {
                h0 = h0(r);
            } else {
                h0 = h0(q);
            }
            this.p = h0;
            try {
                int parseInt = Integer.parseInt(h0);
                this.m = 0;
                int[] iArr2 = this.i;
                int i4 = this.a - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else if (i != 11) {
            throw new C2566Tt1(IR0.a("Expected an int but was ", AbstractC2956Wt1.a(u()), " at path ", h()));
        }
        this.m = 11;
        try {
            double parseDouble = Double.parseDouble(this.p);
            int i5 = (int) parseDouble;
            if (i5 != parseDouble) {
                throw new C2566Tt1(IR0.a("Expected an int but was ", this.p, " at path ", h()));
            }
            this.p = null;
            this.m = 0;
            int[] iArr3 = this.i;
            int i6 = this.a - 1;
            iArr3[i6] = iArr3[i6] + 1;
            return i5;
        } catch (NumberFormatException unused2) {
            throw new C2566Tt1(IR0.a("Expected an int but was ", this.p, " at path ", h()));
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.m = 0;
        this.g[0] = 8;
        this.a = 1;
        C5173fD c5173fD = this.l;
        c5173fD.r(c5173fD.g);
        this.k.close();
    }

    @Override // defpackage.AbstractC3086Xt1
    public final void I() {
        int i = 0;
        do {
            int i2 = this.m;
            if (i2 == 0) {
                i2 = P();
            }
            if (i2 == 3) {
                y(1);
            } else if (i2 == 1) {
                y(3);
            } else {
                if (i2 == 4) {
                    i--;
                    if (i < 0) {
                        throw new C2566Tt1(IR0.a("Expected a value but was ", AbstractC2956Wt1.a(u()), " at path ", h()));
                    }
                    this.a--;
                } else if (i2 == 2) {
                    i--;
                    if (i < 0) {
                        throw new C2566Tt1(IR0.a("Expected a value but was ", AbstractC2956Wt1.a(u()), " at path ", h()));
                    }
                    this.a--;
                } else {
                    C5173fD c5173fD = this.l;
                    if (i2 == 14 || i2 == 10) {
                        long B0 = this.k.B0(s);
                        if (B0 == -1) {
                            B0 = c5173fD.g;
                        }
                        c5173fD.r(B0);
                    } else if (i2 == 9 || i2 == 13) {
                        m0(r);
                    } else if (i2 == 8 || i2 == 12) {
                        m0(q);
                    } else if (i2 == 17) {
                        c5173fD.r(this.o);
                    } else if (i2 == 18) {
                        throw new C2566Tt1(IR0.a("Expected a value but was ", AbstractC2956Wt1.a(u()), " at path ", h()));
                    }
                }
                this.m = 0;
            }
            i++;
            this.m = 0;
        } while (i != 0);
        int[] iArr = this.i;
        int i3 = this.a;
        int i4 = i3 - 1;
        iArr[i4] = iArr[i4] + 1;
        this.h[i3 - 1] = "null";
    }

    public final int g0(boolean z) {
        int i = 0;
        while (true) {
            int i2 = i + 1;
            InterfaceC5861hD interfaceC5861hD = this.k;
            if (!interfaceC5861hD.a(i2)) {
                if (z) {
                    throw new EOFException("End of input");
                }
                return -1;
            }
            long j = i;
            C5173fD c5173fD = this.l;
            byte b = c5173fD.b(j);
            if (b != 10 && b != 32 && b != 13 && b != 9) {
                c5173fD.r(i2 - 1);
                if (b == 47) {
                    if (!interfaceC5861hD.a(2L)) {
                        return b;
                    }
                    O();
                    throw null;
                }
                if (b != 35) {
                    return b;
                }
                O();
                throw null;
            }
            i = i2;
        }
    }

    public final void O() {
        M("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    public final String toString() {
        return AbstractC4199cO1.a("JsonReader(", String.valueOf(this.k), ")");
    }

    public final char k0() {
        int i;
        int i2;
        InterfaceC5861hD interfaceC5861hD = this.k;
        if (!interfaceC5861hD.a(1L)) {
            M("Unterminated escape sequence");
            throw null;
        }
        C5173fD c5173fD = this.l;
        byte f = c5173fD.f();
        if (f == 10 || f == 34 || f == 39 || f == 47 || f == 92) {
            return (char) f;
        }
        if (f == 98) {
            return '\b';
        }
        if (f == 102) {
            return '\f';
        }
        if (f == 110) {
            return '\n';
        }
        if (f == 114) {
            return '\r';
        }
        if (f == 116) {
            return '\t';
        }
        if (f == 117) {
            if (!interfaceC5861hD.a(4L)) {
                throw new EOFException(AbstractC4809e90.a("Unterminated escape sequence at path ", h()));
            }
            char c = 0;
            for (int i3 = 0; i3 < 4; i3++) {
                byte b = c5173fD.b(i3);
                char c2 = (char) (c << 4);
                if (b < 48 || b > 57) {
                    if (b >= 97 && b <= 102) {
                        i = b - 97;
                    } else {
                        if (b < 65 || b > 70) {
                            M("\\u".concat(c5173fD.k(4L)));
                            throw null;
                        }
                        i = b - 65;
                    }
                    i2 = i + 10;
                } else {
                    i2 = b - 48;
                }
                c = (char) (i2 + c2);
            }
            c5173fD.r(4L);
            return c;
        }
        M("Invalid escape sequence: \\" + ((char) f));
        throw null;
    }
}
