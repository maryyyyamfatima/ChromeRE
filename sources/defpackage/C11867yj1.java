package defpackage;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.android.chrome.R;
import org.chromium.chrome.browser.incognito.IncognitoNotificationService;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: yj1 */
/* loaded from: classes.dex */
public final class C11867yj1 implements InterfaceC0442Dk1 {
    @Override // defpackage.InterfaceC0442Dk1
    public final void b() {
        if (AbstractC11530xk1.b()) {
            return;
        }
        AbstractC11524xj1.a();
    }

    @Override // defpackage.InterfaceC0442Dk1
    public final void a() {
        String string;
        Context context = V60.a;
        String string2 = context.getResources().getString(R.string.0_resource_name_obfuscated_res_0x7f140363);
        if (Build.VERSION.SDK_INT >= 24) {
            string = context.getResources().getString(R.string.0_resource_name_obfuscated_res_0x7f140364);
        } else {
            string = context.getResources().getString(R.string.0_resource_name_obfuscated_res_0x7f1401f5);
        }
        PO a = X72.a("incognito", new C7893n72(2, "incognito_tabs_open", 100));
        a.a.f(string);
        Intent intent = new Intent(context, (Class<?>) IncognitoNotificationService.class);
        intent.setAction("com.google.android.apps.chrome.incognito.CLOSE_ALL_INCOGNITO");
        a.f(C4705dr2.c(context, 0, intent, 134217728));
        K62 k62 = a.a;
        k62.e(string2);
        a.k(true);
        k62.x = -1;
        a.l(R.drawable.0_resource_name_obfuscated_res_0x7f090352);
        k62.l = false;
        k62.t = true;
        k62.r = "Incognito";
        C6861k72 c6861k72 = new C6861k72(context);
        W72 d = a.d();
        Notification notification = d.a;
        if (notification == null) {
            AbstractC4851eH1.a("NotifManagerProxy", "Failed to create notification.", new Object[0]);
        } else {
            C7893n72 c7893n72 = d.b;
            c6861k72.c(c7893n72.b, c7893n72.c, notification);
        }
        U72.a.b(2, notification);
        Y60.a.getClass();
        Y60.b();
    }
}
