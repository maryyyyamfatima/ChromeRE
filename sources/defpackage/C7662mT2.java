package defpackage;

import J.N;
import android.content.Context;
import android.security.KeyChainAliasCallback;
import org.chromium.base.task.PostTask;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: mT2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7662mT2 implements KeyChainAliasCallback {
    public final long a;
    public final Context b;
    public boolean c;

    public C7662mT2(Context context, long j) {
        this.b = context;
        this.a = j;
    }

    @Override // android.security.KeyChainAliasCallback
    public final void alias(final String str) {
        if (this.c) {
            AbstractC4851eH1.f("SSLClientCertRequest", AbstractC4199cO1.a("KeyChainCertSelectionCallback called more than once ('", str, "')"), new Object[0]);
        } else {
            this.c = true;
            PostTask.d(AbstractC5103f04.a, new Runnable() { // from class: kT2
                @Override // java.lang.Runnable
                public final void run() {
                    final C7662mT2 c7662mT2 = C7662mT2.this;
                    c7662mT2.getClass();
                    String str2 = str;
                    if (str2 == null) {
                        PostTask.d(AbstractC5103f04.a, new Runnable() { // from class: lT2
                            @Override // java.lang.Runnable
                            public final void run() {
                                N.M8LmNuWo(C7662mT2.this.a, null, null);
                            }
                        });
                    } else {
                        new C6288iT2(c7662mT2.a, c7662mT2.b, str2).c(AbstractC0185Bl.e);
                    }
                }
            });
        }
    }
}
