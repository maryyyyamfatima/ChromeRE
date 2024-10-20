package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Bo, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0200Bo {
    public int a;
    public long b;
    public int c;
    public int d;
    public boolean e;
    public byte f;

    public final void b(int i) {
        if (i == 0) {
            throw new NullPointerException("Null viewTransparency");
        }
        this.c = i;
    }

    public final C0330Co a() {
        int i;
        int i2;
        if (this.f != 7 || (i = this.a) == 0 || (i2 = this.c) == 0) {
            StringBuilder sb = new StringBuilder();
            if (this.a == 0) {
                sb.append(" taskRunnerImplementation");
            }
            if ((this.f & 1) == 0) {
                sb.append(" randomSeed");
            }
            if (this.c == 0) {
                sb.append(" viewTransparency");
            }
            if ((this.f & 2) == 0) {
                sb.append(" backgroundColor");
            }
            if ((this.f & 4) == 0) {
                sb.append(" enableInkDocument");
            }
            throw new IllegalStateException("Missing required properties:".concat(String.valueOf(sb)));
        }
        return new C0330Co(i, this.b, i2, this.d, this.e);
    }
}
