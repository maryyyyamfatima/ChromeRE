package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.feedback.FileTeleporter;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Iterator;
import org.chromium.base.Callback;
import org.chromium.base.ThreadUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class AL0 {
    public static C11051wL0 a(AbstractRunnableC9679sL0 abstractRunnableC9679sL0) {
        C11051wL0 c11051wL0 = new C11051wL0();
        Bundle d = abstractRunnableC9679sL0.d();
        C4317ck c4317ck = new C4317ck();
        for (String str : d.keySet()) {
            c4317ck.put(str, d.getString(str));
        }
        c11051wL0.b();
        Iterator it = ((C2904Wj) c4317ck.entrySet()).iterator();
        while (true) {
            C3294Zj c3294Zj = (C3294Zj) it;
            if (!c3294Zj.hasNext()) {
                break;
            }
            c3294Zj.next();
            C3294Zj c3294Zj2 = c3294Zj;
            c11051wL0.c.putString((String) c3294Zj2.getKey(), (String) c3294Zj2.getValue());
        }
        FX2 fx2 = abstractRunnableC9679sL0.l;
        c11051wL0.a = fx2 == null ? null : fx2.b();
        String str2 = abstractRunnableC9679sL0.h;
        if (!TextUtils.isEmpty(str2)) {
            c11051wL0.d = str2;
        }
        String str3 = abstractRunnableC9679sL0.g;
        if (!TextUtils.isEmpty(str3)) {
            c11051wL0.e = str3;
        }
        Object obj = ThreadUtils.a;
        abstractRunnableC9679sL0.m = null;
        final HashMap hashMap = new HashMap();
        Callback callback = new Callback() { // from class: qL0
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj2) {
                return new ZE(this, obj2);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj2) {
                Pair c = ((InterfaceC12080zL0) obj2).c();
                if (c == null) {
                    return;
                }
                hashMap.put((String) c.first, (String) c.second);
            }
        };
        AbstractC9048qW.a(abstractRunnableC9679sL0.j, callback);
        AbstractC9048qW.a(abstractRunnableC9679sL0.k, callback);
        String str4 = (String) hashMap.get("histograms");
        if (!TextUtils.isEmpty(str4)) {
            try {
                byte[] bytes = str4.getBytes("UTF-8");
                c11051wL0.b();
                c11051wL0.f.add(new FileTeleporter(bytes));
            } catch (UnsupportedEncodingException e) {
                AbstractC4851eH1.a("FeedbackUtil", "Error when attaching metrics data to the user feedback report", e);
            }
        }
        if (!TextUtils.isEmpty(abstractRunnableC9679sL0.i)) {
            c11051wL0.b = abstractRunnableC9679sL0.i;
        }
        return c11051wL0;
    }
}
