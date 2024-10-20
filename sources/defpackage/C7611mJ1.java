package defpackage;

import com.airbnb.lottie.b;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: mJ1 */
/* loaded from: classes.dex */
public final class C7611mJ1 implements MJ1 {
    public final /* synthetic */ b a;

    public C7611mJ1(b bVar) {
        this.a = bVar;
    }

    @Override // defpackage.MJ1
    public final void onResult(Object obj) {
        Throwable th = (Throwable) obj;
        b bVar = this.a;
        int i = bVar.l;
        if (i != 0) {
            bVar.setImageResource(i);
        }
        MJ1 mj1 = bVar.k;
        if (mj1 == null) {
            mj1 = b.B;
        }
        mj1.onResult(th);
    }
}
