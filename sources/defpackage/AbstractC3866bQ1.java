package defpackage;

import java.util.ArrayList;
import java.util.concurrent.Executor;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: bQ1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3866bQ1 extends AbstractC4896eQ1 {
    public final Object a = new Object();
    public Executor b;
    public C8334oQ1 c;
    public TP1 d;
    public ArrayList e;

    public final void j(TP1 tp1, ArrayList arrayList) {
        if (tp1 == null) {
            throw new NullPointerException("groupRoute must not be null");
        }
        synchronized (this.a) {
            Executor executor = this.b;
            if (executor != null) {
                executor.execute(new ZP1(this, this.c, tp1, arrayList));
            } else {
                this.d = tp1;
                this.e = new ArrayList(arrayList);
            }
        }
    }
}
