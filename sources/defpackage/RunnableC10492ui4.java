package defpackage;

import android.app.Notification;
import android.content.Context;
import com.android.chrome.R;
import org.chromium.base.task.PostTask;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ui4 */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC10492ui4 implements Runnable {
    public final /* synthetic */ Context a;

    public /* synthetic */ RunnableC10492ui4(Context context) {
        this.a = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context = this.a;
        final C7549m72 c7549m72 = new C7549m72(context);
        PO a = X72.a("vr", null);
        a.a.f(context.getResources().getString(R.string.0_resource_name_obfuscated_res_0x7f140bb3));
        String string = context.getResources().getString(R.string.0_resource_name_obfuscated_res_0x7f140bb2);
        K62 k62 = a.a;
        k62.e(string);
        a.l(R.drawable.0_resource_name_obfuscated_res_0x7f0901d9);
        k62.u = "msg";
        k62.k = 2;
        Notification c = a.c();
        if (c == null) {
            AbstractC4851eH1.a("NotifManagerProxy", "Failed to create notification.", new Object[0]);
        } else {
            c7549m72.a.c(null, 7, c);
        }
        PostTask.b(AbstractC5103f04.a, new Runnable() { // from class: vi4
            @Override // java.lang.Runnable
            public final void run() {
                ((C7549m72) c7549m72).a.b(7, null);
            }
        }, 5000L);
    }
}
