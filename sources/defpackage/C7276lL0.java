package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.feedback.FeedbackOptions;
import java.util.List;
import java.util.Locale;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: lL0 */
/* loaded from: classes.dex */
public final class C7276lL0 extends AbstractC7620mL0 {
    public final /* synthetic */ FeedbackOptions q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7276lL0(C6144i21 c6144i21, FeedbackOptions feedbackOptions, Context context, long j) {
        super(c6144i21);
        this.q = feedbackOptions;
    }

    @Override // defpackage.AbstractC8508ov
    public final void m(InterfaceC3129Yc interfaceC3129Yc) {
        String str;
        C8651pL0 c8651pL0 = (C8651pL0) interfaceC3129Yc;
        c8651pL0.getClass();
        FeedbackOptions feedbackOptions = this.q;
        BL0.a(feedbackOptions);
        Context context = c8651pL0.F;
        FeedbackOptions a = feedbackOptions == null ? new C11051wL0(context).a() : feedbackOptions;
        C4244cX1 c4244cX1 = (C4244cX1) C4588dX1.P.j();
        String str2 = a.l;
        if (TextUtils.isEmpty(str2)) {
            String packageName = context.getApplicationContext().getPackageName();
            if (c4244cX1.h) {
                c4244cX1.l();
                c4244cX1.h = false;
            }
            C4588dX1 c4588dX1 = (C4588dX1) c4244cX1.g;
            c4588dX1.getClass();
            packageName.getClass();
            c4588dX1.j |= 2;
            c4588dX1.l = packageName;
        } else {
            if (c4244cX1.h) {
                c4244cX1.l();
                c4244cX1.h = false;
            }
            C4588dX1 c4588dX12 = (C4588dX1) c4244cX1.g;
            c4588dX12.getClass();
            str2.getClass();
            c4588dX12.j |= 2;
            c4588dX12.l = str2;
        }
        try {
            str = context.getPackageManager().getPackageInfo(((C4588dX1) c4244cX1.g).l, 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            str = null;
        }
        if (str != null) {
            if (c4244cX1.h) {
                c4244cX1.l();
                c4244cX1.h = false;
            }
            C4588dX1 c4588dX13 = (C4588dX1) c4244cX1.g;
            c4588dX13.getClass();
            c4588dX13.k |= 2;
            c4588dX13.K = str;
        }
        String str3 = a.a;
        if (!TextUtils.isEmpty(str3) && !str3.equals("anonymous")) {
            String num = Integer.toString(new Account(str3, "com.google").name.toLowerCase(Locale.ENGLISH).hashCode());
            if (c4244cX1.h) {
                c4244cX1.l();
                c4244cX1.h = false;
            }
            C4588dX1 c4588dX14 = (C4588dX1) c4244cX1.g;
            c4588dX14.getClass();
            num.getClass();
            c4588dX14.j |= 4;
            c4588dX14.m = num;
        }
        String str4 = a.s;
        if (str4 != null) {
            if (c4244cX1.h) {
                c4244cX1.l();
                c4244cX1.h = false;
            }
            C4588dX1 c4588dX15 = (C4588dX1) c4244cX1.g;
            c4588dX15.getClass();
            c4588dX15.j |= 64;
            c4588dX15.p = str4;
        }
        if (c4244cX1.h) {
            c4244cX1.l();
            c4244cX1.h = false;
        }
        C4588dX1 c4588dX16 = (C4588dX1) c4244cX1.g;
        c4588dX16.getClass();
        c4588dX16.j |= 16;
        c4588dX16.o = "feedback.android";
        int i = C8543p11.e;
        if (c4244cX1.h) {
            c4244cX1.l();
            c4244cX1.h = false;
        }
        C4588dX1 c4588dX17 = (C4588dX1) c4244cX1.g;
        c4588dX17.j |= 1073741824;
        c4588dX17.I = i;
        long currentTimeMillis = System.currentTimeMillis();
        if (c4244cX1.h) {
            c4244cX1.l();
            c4244cX1.h = false;
        }
        C4588dX1 c4588dX18 = (C4588dX1) c4244cX1.g;
        c4588dX18.j |= 16777216;
        c4588dX18.D = currentTimeMillis;
        if (a.r != null || a.k != null) {
            if (c4244cX1.h) {
                c4244cX1.l();
                c4244cX1.h = false;
            }
            C4588dX1 c4588dX19 = (C4588dX1) c4244cX1.g;
            c4588dX19.k |= 16;
            c4588dX19.N = true;
        }
        Bundle bundle = a.g;
        if (bundle != null && !bundle.isEmpty()) {
            int size = a.g.size();
            if (c4244cX1.h) {
                c4244cX1.l();
                c4244cX1.h = false;
            }
            C4588dX1 c4588dX110 = (C4588dX1) c4244cX1.g;
            c4588dX110.k |= 4;
            c4588dX110.L = size;
        }
        List list = a.m;
        if (list != null && !list.isEmpty()) {
            int size2 = a.m.size();
            if (c4244cX1.h) {
                c4244cX1.l();
                c4244cX1.h = false;
            }
            C4588dX1 c4588dX111 = (C4588dX1) c4244cX1.g;
            c4588dX111.k |= 8;
            c4588dX111.M = size2;
        }
        C4588dX1 c4588dX112 = (C4588dX1) c4244cX1.j();
        JX0 jx0 = (JX0) c4588dX112.l(PX0.NEW_BUILDER);
        jx0.m(c4588dX112);
        C4244cX1 c4244cX12 = (C4244cX1) jx0;
        D83 d83 = D83.g;
        if (c4244cX12.h) {
            c4244cX12.l();
            c4244cX12.h = false;
        }
        C4588dX1 c4588dX113 = (C4588dX1) c4244cX12.g;
        c4588dX113.getClass();
        c4588dX113.r = 164;
        c4588dX113.j |= 256;
        C4588dX1 c4588dX114 = (C4588dX1) c4244cX12.j();
        if (c4588dX114.l.isEmpty()) {
            Log.e("gF_BaseMetricsLogger", "MetricsData requires appPackageName to be set");
        }
        if (c4588dX114.p.isEmpty()) {
            Log.e("gF_BaseMetricsLogger", "MetricsData requires sessionId to be set");
        }
        if (c4588dX114.o.isEmpty()) {
            Log.e("gF_BaseMetricsLogger", "MetricsData requires flow to be set");
        }
        if (c4588dX114.I <= 0) {
            Log.e("gF_BaseMetricsLogger", "MetricsData requires clientVersion to be set");
        }
        if (c4588dX114.D <= 0) {
            Log.e("gF_BaseMetricsLogger", "MetricsData requires timestamp to be set");
        }
        D83 c = D83.c(c4588dX114.r);
        if (c == null) {
            c = D83.g;
        }
        if (c == D83.g) {
            Log.e("gF_BaseMetricsLogger", "MetricsData requires user action type to be set");
        }
        context.sendBroadcast(new Intent().setClassName("com.google.android.gms", "com.google.android.gms.chimera.GmsIntentOperationService$GmsExternalReceiver").setAction("com.google.android.gms.googlehelp.metrics.MetricsIntentOperation.LOG_METRIC").putExtra("EXTRA_METRIC_DATA", c4588dX114.toByteArray()));
        InterfaceC2736Vb1 interfaceC2736Vb1 = (InterfaceC2736Vb1) c8651pL0.m();
        ErrorReport errorReport = new ErrorReport(feedbackOptions, context.getCacheDir());
        C2476Tb1 c2476Tb1 = (C2476Tb1) interfaceC2736Vb1;
        Parcel a2 = c2476Tb1.a();
        AbstractC11786yV.b(a2, errorReport);
        Parcel e = c2476Tb1.e(1, a2);
        e.readInt();
        e.recycle();
        a(Status.k);
    }
}
