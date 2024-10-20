package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: zV2, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC12132zV2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int g;
    public final /* synthetic */ AV2 h;

    public RunnableC12132zV2(AV2 av2, int i, int i2) {
        this.h = av2;
        this.a = i;
        this.g = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        AV2 av2 = this.h;
        int i2 = this.a;
        if (i2 > 0 && (i = this.g) > 0) {
            av2.b.getHolder().setFixedSize(i2, i);
        } else {
            av2.b.getHolder().setSizeFromLayout();
        }
    }
}
