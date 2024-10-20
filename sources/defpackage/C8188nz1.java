package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import org.chromium.base.ThreadUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: nz1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8188nz1 implements InterfaceC11737yL0 {
    public final Context a;

    public C8188nz1(Context context) {
        this.a = context.getApplicationContext();
    }

    @Override // defpackage.InterfaceC11737yL0
    public final void a(AbstractRunnableC9679sL0 abstractRunnableC9679sL0) {
        Object obj = ThreadUtils.a;
        String str = abstractRunnableC9679sL0.h;
        if (!TextUtils.isEmpty(str)) {
            AbstractC4851eH1.f("cr.feedback", AbstractC4809e90.a("FEEDBACK DATA: DESCRIPTION = ", str), new Object[0]);
        }
        Bundle d = abstractRunnableC9679sL0.d();
        for (String str2 : d.keySet()) {
            AbstractC4851eH1.f("cr.feedback", "FEEDBACK DATA: " + str2 + " = " + d.get(str2), new Object[0]);
        }
        Intent intent = new Intent("android.intent.action.BUG_REPORT");
        intent.setComponent(new ComponentName("com.google.android.gms", "com.google.android.gms.feedback.LegacyBugReportService"));
        Context context = this.a;
        if (context.getPackageManager().resolveService(intent, 0) == null) {
            AbstractC4851eH1.a("cr.feedback", "Unable to resolve Feedback service.", new Object[0]);
        } else {
            context.bindService(intent, new ServiceConnectionC7844mz1(this, abstractRunnableC9679sL0), 1);
        }
    }
}
