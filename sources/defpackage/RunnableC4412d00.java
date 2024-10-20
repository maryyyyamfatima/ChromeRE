package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: d00, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC4412d00 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ T5 g;
    public final /* synthetic */ C5099f00 h;

    @Override // java.lang.Runnable
    public final void run() {
        S5 s5;
        Object obj = this.g.a;
        C5099f00 c5099f00 = this.h;
        String str = (String) c5099f00.b.get(Integer.valueOf(this.a));
        if (str == null) {
            return;
        }
        C3416a6 c3416a6 = (C3416a6) c5099f00.f.get(str);
        if (c3416a6 == null || (s5 = c3416a6.a) == null) {
            c5099f00.h.remove(str);
            c5099f00.g.put(str, obj);
        } else if (c5099f00.e.remove(str)) {
            s5.a(obj);
        }
    }

    public RunnableC4412d00(C5099f00 c5099f00, int i, T5 t5) {
        this.h = c5099f00;
        this.a = i;
        this.g = t5;
    }
}
