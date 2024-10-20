package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: io, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6403io {
    public AbstractC0562Ei1 a;
    public int b;

    public final void b(AbstractC0562Ei1 abstractC0562Ei1) {
        if (abstractC0562Ei1 == null) {
            throw new NullPointerException("Null records");
        }
        this.a = abstractC0562Ei1;
    }

    public final void c(int i) {
        if (i == 0) {
            throw new NullPointerException("Null status");
        }
        this.b = i;
    }

    public final C6746jo a() {
        int i;
        AbstractC0562Ei1 abstractC0562Ei1 = this.a;
        if (abstractC0562Ei1 == null || (i = this.b) == 0) {
            StringBuilder sb = new StringBuilder();
            if (this.a == null) {
                sb.append(" records");
            }
            if (this.b == 0) {
                sb.append(" status");
            }
            throw new IllegalStateException("Missing required properties:".concat(String.valueOf(sb)));
        }
        return new C6746jo(abstractC0562Ei1, i);
    }
}
