package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ao, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3654ao {
    public InterfaceC9989tE2 a;
    public ExecutorC4027bs4 b;
    public String c;
    public InterfaceC1286Jx0 d;
    public boolean e;
    public Object f;
    public boolean g;
    public byte h;

    public final C3998bo a() {
        InterfaceC9989tE2 interfaceC9989tE2;
        String str;
        InterfaceC1286Jx0 interfaceC1286Jx0;
        if (this.h != 3 || (interfaceC9989tE2 = this.a) == null || (str = this.c) == null || (interfaceC1286Jx0 = this.d) == null) {
            StringBuilder sb = new StringBuilder();
            if (this.a == null) {
                sb.append(" converterProvider");
            }
            if (this.c == null) {
                sb.append(" logTag");
            }
            if (this.d == null) {
                sb.append(" perfLoggerFactory");
            }
            if ((this.h & 1) == 0) {
                sb.append(" useIncrementalMount");
            }
            if ((this.h & 2) == 0) {
                sb.append(" nestedScrollingEnabled");
            }
            throw new IllegalStateException("Missing required properties:".concat(String.valueOf(sb)));
        }
        return new C3998bo(interfaceC9989tE2, this.b, str, interfaceC1286Jx0, this.e, this.f, this.g);
    }
}
