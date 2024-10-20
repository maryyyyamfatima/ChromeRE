package defpackage;

import android.content.Intent;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final /* synthetic */ class BB0 implements Runnable {
    public final /* synthetic */ DB0 a;
    public final /* synthetic */ Intent g;
    public final /* synthetic */ C6905kF3 h;

    public /* synthetic */ BB0(DB0 db0, Intent intent, C6905kF3 c6905kF3) {
        this.a = db0;
        this.g = intent;
        this.h = c6905kF3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Intent intent = this.g;
        C6905kF3 c6905kF3 = this.h;
        DB0 db0 = this.a;
        db0.getClass();
        try {
            db0.b(intent);
        } finally {
            c6905kF3.b(null);
        }
    }
}
