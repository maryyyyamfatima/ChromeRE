package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: wg3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC11165wg3 {
    public final C1439Lb3 b;
    public boolean c = false;
    public final AbstractC11165wg3 a = null;

    public AbstractC11165wg3(C1439Lb3 c1439Lb3) {
        this.b = c1439Lb3;
    }

    public final Object a(C10479ug3 c10479ug3) {
        AbstractC11165wg3 abstractC11165wg3;
        Object obj = this.b.get(c10479ug3);
        return (obj != null || (abstractC11165wg3 = this.a) == null) ? obj : abstractC11165wg3.a(c10479ug3);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpanExtras<");
        for (AbstractC11165wg3 abstractC11165wg3 = this; abstractC11165wg3 != null; abstractC11165wg3 = abstractC11165wg3.a) {
            for (int i = 0; i < abstractC11165wg3.b.h; i++) {
                sb.append(this.b.j(i));
                sb.append("], ");
            }
        }
        sb.append(">");
        return sb.toString();
    }
}
