package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: bo, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3998bo {
    public final InterfaceC9989tE2 a;
    public final ExecutorC4027bs4 b;
    public final String c;
    public final InterfaceC1286Jx0 d;
    public final boolean e;
    public final Object f;
    public final boolean g;

    public C3998bo(InterfaceC9989tE2 interfaceC9989tE2, ExecutorC4027bs4 executorC4027bs4, String str, InterfaceC1286Jx0 interfaceC1286Jx0, boolean z, Object obj, boolean z2) {
        this.a = interfaceC9989tE2;
        this.b = executorC4027bs4;
        this.c = str;
        this.d = interfaceC1286Jx0;
        this.e = z;
        this.f = obj;
        this.g = z2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.d);
        String valueOf4 = String.valueOf(this.f);
        StringBuilder a = AbstractC10975w63.a("ElementsConfig{converterProvider=", valueOf, ", layoutExecutor=", valueOf2, ", logTag=");
        AbstractC9972tB0.a(a, this.c, ", perfLoggerFactory=", valueOf3, ", elementsInteractionLogger=null, useIncrementalMount=");
        a.append(this.e);
        a.append(", userData=");
        a.append(valueOf4);
        a.append(", recyclerConfig=null, nestedScrollingEnabled=");
        a.append(this.g);
        a.append(", globalCommandDataDecorators=null}");
        return a.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3998bo)) {
            return false;
        }
        C3998bo c3998bo = (C3998bo) obj;
        if (this.a.equals(c3998bo.a)) {
            ExecutorC4027bs4 executorC4027bs4 = c3998bo.b;
            ExecutorC4027bs4 executorC4027bs42 = this.b;
            if (executorC4027bs42 != null ? executorC4027bs42.equals(executorC4027bs4) : executorC4027bs4 == null) {
                if (this.c.equals(c3998bo.c) && this.d.equals(c3998bo.d) && this.e == c3998bo.e) {
                    Object obj2 = c3998bo.f;
                    Object obj3 = this.f;
                    if (obj3 != null ? obj3.equals(obj2) : obj2 == null) {
                        if (this.g == c3998bo.g) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        ExecutorC4027bs4 executorC4027bs4 = this.b;
        int hashCode2 = (((((((((hashCode ^ (executorC4027bs4 == null ? 0 : executorC4027bs4.hashCode())) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ 0) * 1000003) ^ (this.e ? 1231 : 1237)) * 1000003;
        Object obj = this.f;
        return ((((((hashCode2 ^ (obj == null ? 0 : obj.hashCode())) * 1000003) ^ 0) * 1000003) ^ (this.g ? 1231 : 1237)) * 1000003) ^ 0;
    }
}
