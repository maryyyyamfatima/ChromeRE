package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class VD extends WD {
    public int a = 0;
    public final int g;
    public final /* synthetic */ AbstractC4147cE h;

    public VD(AbstractC4147cE abstractC4147cE) {
        this.h = abstractC4147cE;
        this.g = abstractC4147cE.size();
    }

    @Override // j$.util.Iterator
    public final boolean hasNext() {
        return this.a < this.g;
    }
}
