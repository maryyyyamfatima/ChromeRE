package org.chromium.chrome.browser.feedback;

import J.N;
import android.util.Pair;
import defpackage.AbstractC4199cO1;
import defpackage.AbstractRunnableC9679sL0;
import defpackage.InterfaceC3039Xk;
import java.util.HashMap;
import java.util.Map;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class ProcessIdFeedbackSource implements InterfaceC3039Xk {
    public static final HashMap c;
    public HashMap a;
    public boolean b;

    @Override // defpackage.InterfaceC12080zL0
    public final /* synthetic */ Pair c() {
        return null;
    }

    static {
        HashMap hashMap = new HashMap();
        c = hashMap;
        hashMap.put("renderer", 3);
        hashMap.put("utility", 6);
        hashMap.put("gpu-process", 9);
    }

    public final void prepareCompleted(long j) {
        this.a = new HashMap();
        for (Map.Entry entry : c.entrySet()) {
            long[] MKHKXOCT = N.MKHKXOCT(j, this, ((Integer) entry.getValue()).intValue());
            if (MKHKXOCT.length != 0) {
                StringBuilder sb = new StringBuilder();
                for (long j2 : MKHKXOCT) {
                    if (sb.length() > 0) {
                        sb.append(", ");
                    }
                    sb.append(String.valueOf(j2));
                }
                this.a.put(AbstractC4199cO1.a("Process IDs (", (String) entry.getKey(), ")"), sb.toString());
            }
        }
        this.a.put("Process IDs (browser)", Long.toString(N.MXN_TQGn()));
        this.b = true;
    }

    @Override // defpackage.InterfaceC3039Xk
    public final boolean a() {
        return this.b;
    }

    @Override // defpackage.InterfaceC12080zL0
    public final Map d() {
        return this.a;
    }

    @Override // defpackage.InterfaceC3039Xk
    public final void b(AbstractRunnableC9679sL0 abstractRunnableC9679sL0) {
        N.Mx7ChZtk(this);
    }
}
