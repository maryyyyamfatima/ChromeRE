package org.chromium.chrome.browser.feedback;

import J.N;
import android.util.Pair;
import defpackage.AbstractRunnableC9679sL0;
import defpackage.InterfaceC3039Xk;
import java.util.HashMap;
import java.util.Map;
import org.chromium.chrome.browser.profiles.Profile;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class FamilyInfoFeedbackSource implements InterfaceC3039Xk {
    public final Profile a;
    public final HashMap b = new HashMap();
    public boolean c;
    public Runnable d;

    @Override // defpackage.InterfaceC12080zL0
    public final /* synthetic */ Pair c() {
        return null;
    }

    public FamilyInfoFeedbackSource(Profile profile) {
        this.a = profile;
    }

    @Override // defpackage.InterfaceC3039Xk
    public final void b(AbstractRunnableC9679sL0 abstractRunnableC9679sL0) {
        this.d = abstractRunnableC9679sL0;
        N.MYGJsJCo(this, this.a);
    }

    public final void processFamilyMemberRole(String str) {
        if (!str.isEmpty()) {
            this.b.put("Family_Member_Role", str);
        }
        this.c = true;
        Runnable runnable = this.d;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // defpackage.InterfaceC3039Xk
    public final boolean a() {
        return this.c;
    }

    @Override // defpackage.InterfaceC12080zL0
    public final Map d() {
        return this.b;
    }
}
