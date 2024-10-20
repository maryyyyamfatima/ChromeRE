package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.android.chrome.R;
import java.util.ArrayList;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class D44 extends AbstractC1598Mh3 {
    public final C44 b = new C44(this);
    public B44 c;

    @Override // defpackage.AbstractC1598Mh3
    public final IBinder a() {
        return null;
    }

    @Override // defpackage.AbstractC1598Mh3
    public final void b() {
        this.c = new B44(new C7549m72(V60.a), this.b);
    }

    @Override // defpackage.AbstractC1598Mh3
    public final int e(Intent intent, int i, int i2) {
        String string;
        B44 b44 = this.c;
        C44 c44 = b44.a;
        if (intent == null || intent.getExtras() == null) {
            b44.a();
            c44.a.a.stopSelf();
        } else if ("org.chromium.chrome.browser.app.usb.USB_UPDATE".equals(intent.getAction())) {
            int intExtra = intent.getIntExtra("NotificationId", -1);
            boolean booleanExtra = intent.getBooleanExtra("NotificationIsConnected", false);
            String stringExtra = intent.getStringExtra("NotificationUrl");
            boolean booleanExtra2 = intent.getBooleanExtra("NotificationIsIncognito", false);
            ArrayList arrayList = b44.d;
            boolean contains = arrayList.contains(Integer.valueOf(intExtra));
            InterfaceC7205l72 interfaceC7205l72 = b44.b;
            if (contains) {
                ((C7549m72) interfaceC7205l72).a(intExtra, "UsbNotificationManager");
                arrayList.remove(arrayList.indexOf(Integer.valueOf(intExtra)));
                b44.b(intExtra, true);
            }
            if (booleanExtra) {
                Context context = V60.a;
                PO a = X72.a("usb", new C7893n72(36, "UsbNotificationManager", intExtra));
                c44.getClass();
                C4705dr2 a2 = C4705dr2.a(context, intExtra, C1761No1.a(intExtra, 1), 0);
                a.a.d(false);
                a.k(true);
                a.a.t = true;
                a.f(a2);
                a.l(R.drawable.f46570_resource_name_obfuscated_res_0x7f090197);
                a.h(context.getString(R.string.f71110_resource_name_obfuscated_res_0x7f14038f));
                if (booleanExtra2) {
                    string = context.getString(R.string.f89950_resource_name_obfuscated_res_0x7f140b8b);
                    a.n(context.getString(R.string.f78580_resource_name_obfuscated_res_0x7f1406f0));
                } else {
                    string = context.getString(R.string.f89940_resource_name_obfuscated_res_0x7f140b8a, AbstractC10615v34.b(1, new GURL(stringExtra)));
                }
                a.g(string);
                W72 e = a.e(string);
                ((C7549m72) interfaceC7205l72).f(e);
                arrayList.add(Integer.valueOf(intExtra));
                b44.b(intExtra, false);
                U72.a.b(36, e.a);
            }
            if (arrayList.size() == 0) {
                c44.a.a.stopSelf(i2);
            }
        }
        return super.e(intent, i, i2);
    }

    @Override // defpackage.AbstractC1598Mh3
    public final void c() {
        this.c.a();
    }

    @Override // defpackage.AbstractC1598Mh3
    public final boolean g(Intent intent) {
        this.c.a();
        return super.g(intent);
    }
}
