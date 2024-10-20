package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ni1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1731Ni1 extends AbstractC1212Ji1 {
    private final transient AbstractC1472Li1 emptySet;

    public C1731Ni1(TL2 tl2, int i) {
        super(tl2, i);
        int i2 = AbstractC1472Li1.h;
        this.emptySet = UL2.o;
    }

    public final AbstractC1472Li1 b(Integer num) {
        AbstractC1472Li1 abstractC1472Li1 = (AbstractC1472Li1) this.map.get(num);
        AbstractC1472Li1 abstractC1472Li12 = this.emptySet;
        if (abstractC1472Li1 != null) {
            return abstractC1472Li1;
        }
        if (abstractC1472Li12 != null) {
            return abstractC1472Li12;
        }
        throw new NullPointerException("Both parameters are null");
    }
}
