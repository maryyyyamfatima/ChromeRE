package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ko, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1370Ko {
    public AbstractC1472Li1 a;
    public C10020tK3 b;
    public int c;
    public byte d;

    public final void b(AbstractC1472Li1 abstractC1472Li1) {
        if (abstractC1472Li1 == null) {
            throw new NullPointerException("Null templateUris");
        }
        this.a = abstractC1472Li1;
    }

    public final C1500Lo a() {
        AbstractC1472Li1 abstractC1472Li1;
        if (this.d != 1 || (abstractC1472Li1 = this.a) == null) {
            StringBuilder sb = new StringBuilder();
            if (this.a == null) {
                sb.append(" templateUris");
            }
            if ((1 & this.d) == 0) {
                sb.append(" materializationCount");
            }
            throw new IllegalStateException("Missing required properties:".concat(String.valueOf(sb)));
        }
        return new C1500Lo(abstractC1472Li1, this.b, null, null, null, null, null, null, null, this.c);
    }
}
