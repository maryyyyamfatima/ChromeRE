package defpackage;

import J.N;
import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.chromium.chrome.browser.app.usb.UsbNotificationService;
import org.chromium.content_public.browser.WebContents;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class B44 {
    public final C44 a;
    public final InterfaceC7205l72 b;
    public final ArrayList d = new ArrayList();
    public final Q83 c = O83.a;

    public B44(C7549m72 c7549m72, C44 c44) {
        this.a = c44;
        this.b = c7549m72;
    }

    public final void a() {
        Q83 q83 = this.c;
        Set k = q83.k("Chrome.USB.NotificationIds", null);
        if (k == null) {
            return;
        }
        Iterator it = k.iterator();
        while (it.hasNext()) {
            ((C7549m72) this.b).a(Integer.parseInt((String) it.next()), "UsbNotificationManager");
        }
        q83.m("Chrome.USB.NotificationIds");
    }

    public final void b(int i, boolean z) {
        HashSet hashSet = new HashSet();
        Q83 q83 = this.c;
        HashSet hashSet2 = new HashSet(q83.k("Chrome.USB.NotificationIds", hashSet));
        if (z && !hashSet2.isEmpty() && hashSet2.contains(String.valueOf(i))) {
            hashSet2.remove(String.valueOf(i));
        } else if (!z) {
            hashSet2.add(String.valueOf(i));
        }
        q83.u("Chrome.USB.NotificationIds", hashSet2);
    }

    public static void c(Context context, int i, WebContents webContents, GURL gurl, boolean z) {
        boolean z2 = false;
        boolean MrjKaAvk = webContents == null ? false : N.MrjKaAvk(webContents);
        if (MrjKaAvk) {
            z2 = true;
        } else {
            Set k = O83.a.k("Chrome.USB.NotificationIds", null);
            if (k != null && !k.isEmpty()) {
                z2 = k.contains(String.valueOf(i));
            }
        }
        if (z2) {
            Intent intent = new Intent(context, (Class<?>) UsbNotificationService.class);
            intent.setAction("org.chromium.chrome.browser.app.usb.USB_UPDATE");
            intent.putExtra("NotificationId", i);
            intent.putExtra("NotificationUrl", gurl.i());
            intent.putExtra("NotificationIsConnected", MrjKaAvk);
            intent.putExtra("NotificationIsIncognito", z);
            context.startService(intent);
        }
    }
}
