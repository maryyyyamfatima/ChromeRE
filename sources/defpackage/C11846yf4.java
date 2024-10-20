package defpackage;

import java.util.Arrays;
import java.util.Objects;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: yf4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11846yf4 {
    public static final C11846yf4 e = new C11846yf4(null, null, null, null);
    public final String a;
    public final String b;
    public final Integer c;
    public final Long d;

    public C11846yf4(String str, String str2, Integer num, Long l) {
        this.a = str;
        this.b = str2;
        this.c = num;
        this.d = l;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C11846yf4)) {
            return false;
        }
        C11846yf4 c11846yf4 = (C11846yf4) obj;
        return Objects.equals(this.a, c11846yf4.a) && Objects.equals(this.b, c11846yf4.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final C3977bk2 a(boolean z) {
        C2777Vj2 c2777Vj2 = (C2777Vj2) C3977bk2.o.j();
        C3297Zj2 c3297Zj2 = (C3297Zj2) C3633ak2.m.j();
        String str = this.b;
        if (str != null) {
            if (c3297Zj2.h) {
                c3297Zj2.l();
                c3297Zj2.h = false;
            }
            C3633ak2 c3633ak2 = (C3633ak2) c3297Zj2.g;
            c3633ak2.getClass();
            str.getClass();
            c3633ak2.j |= 1;
            c3633ak2.k = str;
        }
        Integer num = this.c;
        if (num != null) {
            int intValue = num.intValue();
            if (c3297Zj2.h) {
                c3297Zj2.l();
                c3297Zj2.h = false;
            }
            C3633ak2 c3633ak22 = (C3633ak2) c3297Zj2.g;
            c3633ak22.j |= 2;
            c3633ak22.l = intValue;
        }
        C3633ak2 c3633ak23 = (C3633ak2) c3297Zj2.j();
        if (c2777Vj2.h) {
            c2777Vj2.l();
            c2777Vj2.h = false;
        }
        C3977bk2 c3977bk2 = (C3977bk2) c2777Vj2.g;
        c3977bk2.getClass();
        c3633ak23.getClass();
        c3977bk2.l = c3633ak23;
        c3977bk2.k = 1;
        Long l = this.d;
        if (l != null) {
            long longValue = l.longValue();
            if (c2777Vj2.h) {
                c2777Vj2.l();
                c2777Vj2.h = false;
            }
            C3977bk2 c3977bk22 = (C3977bk2) c2777Vj2.g;
            c3977bk22.j |= 8;
            c3977bk22.n = longValue;
        }
        if (c2777Vj2.h) {
            c2777Vj2.l();
            c2777Vj2.h = false;
        }
        C3977bk2 c3977bk23 = (C3977bk2) c2777Vj2.g;
        c3977bk23.j |= 4;
        c3977bk23.m = z;
        return (C3977bk2) c2777Vj2.j();
    }
}
